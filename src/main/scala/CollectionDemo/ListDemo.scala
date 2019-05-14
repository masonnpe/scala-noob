package CollectionDemo

import scala.collection.mutable.ListBuffer

object ListDemo {
  def main(args: Array[String]): Unit = {

    var l=List(1,23,4,5,67)
    println(l.head)        //第一个元素
    println(l.tail)        //除了第一个
    var l2=1::Nil          //1是头  Nil是尾

    var lb=ListBuffer[Int]()  // 可变list
    lb+=(1,23,5,4)
    println(lb)
  }
}
