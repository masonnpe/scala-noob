object HelloWorld {
  def main(args: Array[String]): Unit = {
    println(
      """aaa
        |bbb
        |ccc
      """.stripMargin)// 多行字符串
    var name:String="hello"// var 声明的变量可以修改
    name+=" world"
    println(name)
    val desc:String="dec"// val 声明的常量不可以修改
    println(desc)
    // 在 Scala 中声明变量和常量不一定要指明数据类型，在没有指明数据类型的情况下，其数据类型是通过变量或常量的初始值推断出来的。
    //所以，如果在没有指明数据类型的情况下声明变量或常量必须要给出其初始值，否则将会报错。
  }
}
