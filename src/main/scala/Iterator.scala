object IteratorDemo {
  def main(args: Array[String]): Unit = {
    val it = Iterator("jd","taobao","vip")
    while(it.hasNext){
      println(it.next())
    }
    val nums = Iterator(1,4,9)
    println(nums.max)

    println(multiplier(2))//闭包
  }

  var factor = 3
  val multiplier = (i:Int) => i * factor
}
