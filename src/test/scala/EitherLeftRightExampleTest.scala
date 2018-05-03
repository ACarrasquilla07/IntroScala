import org.scalatest.{AsyncWordSpec, Matchers}

class EitherLeftRightExampleTest extends AsyncWordSpec with Matchers{

  "EitherTest" should{
    "" in{
      val valor = EitherLeftRightExample.divide(9,9)
      Right(1) should be(valor)
    }
  }
}
