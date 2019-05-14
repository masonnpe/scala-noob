import scala.collection.mutable.ArrayBuffer
import scala.util.Sorting

object ArrayDemo {

  def main(args: Array[String]): Unit = {
    var c=ArrayBuffer[Int]() //可变数组 相当于arraylist
    c+=1
    c+=(2,3,4)
    c++=Array(9,6,7,8,5)

    c.trimEnd(2)// 尾部去2个

    c.remove(0) // 删除某个位置的元素

    c.insert(1,10,11)// 在某个索引位置 插入元素
    c.foreach(println)
    println(c.sum)
    println(c.max)

    Sorting.quickSort(c.toArray)
  }

  var arr=new Array[String](5)
  var arr2=Array("hello","world")


//  Sorting.quickSort(c)
//
//  val str: Nothing = c.mkString("<", ",", ">")
}
