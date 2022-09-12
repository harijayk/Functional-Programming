class Rational(x:Int,y:Int){
    require(y>0,"denominator can't be equal to zero")
    private def gcd(x:Int,y:Int):Int=if(y==0) x else gcd(y,x%y)
    def nume = x/gcd(x,y)
    def denom = y/gcd(x,y)
    def neg = new Rational(-this.nume,this.denom)

    def +(r:Rational) = new Rational(this.nume*r.denom+r.nume*this.denom,this.denom*r.denom)

    def -(r:Rational) = this+r.neg
}
object Q2 extends App{
    val x = new Rational(3,4)
    val y = new Rational(5,8)
    val z = new Rational(2,7)
    val result = x-y-z
    println("Value of " + x.nume + "/" + x.denom + "-" + y.nume + "/" + y.denom +"-"+z.nume +"/"+z.denom+"= "+result.nume +"/"+result.denom)
}
