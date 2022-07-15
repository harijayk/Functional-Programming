object temperature{
    def fahrenheit(celcius:Double):Double = celcius*1.8000 + 32.00;

    def main(args: Array[String]):Unit = {
        println(fahrenheit(35));
    }
}