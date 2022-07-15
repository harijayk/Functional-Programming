object Question4a{
    def normalH(hours:Int):Int = hours * 250;

    def otH(hours:Int):Int = hours * 85;

    def total(h1:Int, h2:Int):Int = normalH(h1) + otH(h2);

    def tax(total:Int):Double = total * 0.12;

    def salary(h1:Int, h2:Int):Double = total(h1,h2) - tax(total(h1,h2));

    def main(args: Array[String]):Unit = {
        println (salary(40,30));
    }
}