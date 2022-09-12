class Rational(x:Int,y:Int){
    require(y>0,"denominator must be positive")
    val nume=x
    val denom=y
    def neg = new Rational(-this.nume,this.denom)
}
object Q1 extends App{
    val x = new Rational(1,3)
    val result=x.neg;
    println("Negative value of " + x.nume + "/" + x.denom + " is " + result.nume + "/" + result.denom)
}
