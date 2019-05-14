package FunctionDemo

class Animal(val name:String,val age:Int){
  var sch="jit";
  println(name+"age:"+age+"school"+sch)
  // 附属构造器
  def this( name:String, age:Int,sch:String){
    this(name,age)
    this.sch=sch
  }
}

class Tiger(name:String,age:Int,height:Int) extends Animal(name, age ){
  override def toString: String = {
    "重写了"
  }
}