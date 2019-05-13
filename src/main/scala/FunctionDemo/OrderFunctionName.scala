package FunctionDemo

object OrderFunctionName {

  def main(args: Array[String]): Unit = {
    print(b=1,a=2)
    val str = show("dasdas","dsada","dsadas")
    println(str)

    println(digui(4))

    var f=(x:Int,y:Int)=>{x*y}//匿名函数
    println(f(2,4))

  }

  def print(a:Int,b:Int,c:Int=2):Unit={ //默认参数值
    println("a:"+a)
    println("b:"+b)
    println("c:"+c)
  }

  def show(a:String*):String={//可变参数
    var c=""
    for (elem <- a) {
      c=plus(c+elem)
    }

    def plus(a:String):String={
      a+"局部函数"
    }

    c
  }

  def digui(n:Int): Int ={//递归
    if(n==1||n==2){
      n
    }else{
      digui(n-1)+digui(n-2)
    }
  }
}
