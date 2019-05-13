import scala.util.matching.Regex

object RegexDemo {
  def main(args: Array[String]): Unit = {
    val pattern = ("abl[ae]\\d+").r
    val str = "ablaw is able1 and cool"

    println((pattern findAllIn str).mkString(","))

  }
}
