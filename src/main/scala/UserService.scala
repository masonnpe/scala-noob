trait UserService {
  def isAdmin(role:String):Boolean
  def isSuper(role:String):Boolean
}
// 比java接口更高级