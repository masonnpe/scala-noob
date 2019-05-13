object TestArray {
  def main(args: Array[String]): Unit = {
    // 声明数组
    var z = new Array[String](3)
    var y:Array[String] = new Array[String](3)

    val ints = Array(1,2,3)
    ints(0)=4
    for(x<-ints){
      println(x)
    }

    val array = Array.ofDim[Int](3,3)//二维数组
    for (i<-0 to 2){
      for (j<-0 to 2){
        array(i)(j)=j
      }
    }
    for (i<-0 to 2){
      for (j<-0 to 2){
        println(array(i)(j))
      }
    }

    var myList1 = Array(1.9, 2.9, 3.4, 3.5)
    var myList2 = Array(8.9, 7.9, 0.4, 1.5)
    val doubles = Array.concat(myList1,myList2)//合并数组
    for (x<-doubles){
      println(x)
    }
    Array.range(1,10,2)// 生成一个区间范围内的数组

  }
}
