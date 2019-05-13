import scala.util.control.Breaks

object Break {
  def main(args: Array[String]): Unit = {
    var loop=new Breaks
    loop.breakable(for (a <- 1 to 10){
      println("before"+a)
      if(a==4){
        loop.break
      }
      println("after"+a)
    })

  }
}
