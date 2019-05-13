class Function {
  def hello(args: Array[String]): String = {
    var ret=""
    for (a<-args){
      ret=ret+a
    }
    return ret
  }
}
