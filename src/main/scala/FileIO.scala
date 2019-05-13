import java.io.{File, PrintWriter}

import scala.io.{Source, StdIn}

object FileIO {
  def main(args: Array[String]): Unit = {
    val writer = new PrintWriter(new File("C:\\Users\\maruami\\Desktop\\cc.txt"))
    writer.write("cc\nccc")
    writer.close()
    Source.fromFile("C:\\Users\\maruami\\Desktop\\cc.txt").foreach(print)

    // 从屏幕上读取用户输入
    val str = StdIn.readLine()
    println(str)
  }
}
