object sphere{
    def volume(radius:Double):Double = (4*math.Pi*radius*radius*radius)/3;

    def main(args: Array[String]):Unit = {
        println(volume(5));
    }
}