class UserServiceImpl extends UserService {
  override def isAdmin(role: String): Boolean = role=="admin"

  override def isSuper(role: String): Boolean = ???
}

object Test{

  def main(args: Array[String]): Unit = {
    val impl = new UserServiceImpl
    val bool = impl.isAdmin("admin")
    println(bool)
  }
}