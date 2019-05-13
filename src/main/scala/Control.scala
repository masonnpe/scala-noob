object Control {
  def main(args: Array[String]): Unit = {
    var time=21
    if(time<10){
      println("不够")
      do {
        time=time-1
        println(time)
      }while(time>0)
    }else if(time<20){
      println("还行")
      while (time>0){
        time=time-1
        println(time)
      }
    }else{
      println("够了")
      for (a <- 1 to 10){
        println(a)
      }
      for (a <- 1 until 10){ //不包括10
        println(a)
      }

    }

    for( a <- 1 to 3; b <- 1 to 3){// 使用分号 (;) 来设置多个区间，它将迭代给定区间所有的可能值
      println( "Value of a: " + a );
      println( "Value of b: " + b );
    }

    //for 循环集合并过滤
    val numList=List("a","b","a","a","e")

    //将 for 循环的返回值作为一个变量存储
    var retVal=for (a <-numList if a=="a"; if a!="b") yield a


    for( a <- retVal){
      println( "Value of a: " + a );
    }

  }
}
