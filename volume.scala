
object volume extends App{

  def const(p:Double,q:Double) = p / q;

  def cub(i:Double) = (i*i*i);

  def cal(x:Double) = const(4,3) * const(22,7) *  cub(x) ; 

  println(cal(5))

}
