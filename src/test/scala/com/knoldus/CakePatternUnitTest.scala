package com.knoldus

import org.scalamock.scalatest._
import org.scalatest.flatspec
import org.scalatest.matchers.should.Matchers.convertToAnyShouldWrapper
import com.knoldus.CakePatternDesign.Test

trait TestRegistry
  extends CakePatternDesign.TestExecutorComponent
    with CakePatternDesign.TestEnvironmentComponent
    with MockFactory {
  override val env: TestEnvironment = mock[TestEnvironment]
  override val testExecutor: TestExecutor = new TestExecutor
}

class CakePatternUnitTest extends FlatSpec with TestRegistry {

  "A TestExecutor" should "execute tests using a given environment" in {
    (env.readEnvironmentProperties _).expects().returning(Map("ENV" -> "true"))
    val test = Test("test-1", { environment =>
      environment.getOrElse("ENV", "false").toBoolean
    })
    assertResult(testExecutor.execute(List(test)))(true)
  }
}



















