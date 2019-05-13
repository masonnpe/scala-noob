package FunctionDemo

object CurryingDemo {
  def main(args: Array[String]): Unit = {
    println(add(5)(8))
  }

  def add(x:Int)(y:Int) = x + y
}
