object MatchDemo {
  def main(args: Array[String]): Unit = {
    var x="c";
    println(matchTest(x))

  }
  def matchTest(ch:String): String ={
    ch match {
      case "a"=> "aaaa"
      case "b"=> "bbbb"
      case _=>"other"
    }
  }

  //使用了case关键字的类定义就是就是样例类(case classes)，样例类是种特殊的类，经过优化以用于模式匹配。
}
