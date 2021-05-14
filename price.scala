object price extends App{
  
  def discount(y:Double) = (y * 60) / 100;

  def ship(p:Int):Double =  if (p-50 > 0) (50*3+(p-50)*0.75) else (50*3);

  def cal(x:Int):Double =  discount(x * 24.95) + ship(x) ;


  println(cal(60))



}
