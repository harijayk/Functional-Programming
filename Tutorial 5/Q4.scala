object Q4 extends App {
    def isEven(n:Int):Boolean = n match{
        case 0 => true
        case _ => isOdd(n-1)
    }

    def isOdd(n:Int):Boolean = !(isEven(n))

    print("Enter a number to get odd even values: ")
    val input = scala.io.StdIn.readInt()
    println(isEven(input))

}