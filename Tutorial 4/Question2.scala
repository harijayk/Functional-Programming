object Q4 extends App {
    print("Enter a number: ")
    val input = scala.io.StdIn.readInt()
    
    def patternMatching(input: Int):Unit = input match{
        case x if input < 0 || input == 0 => println("Negative/Zero is input")
        case x if input % 2 == 0 => println("Even number is given")
        case x if input % 2 != 0 => println("Odd number is given")
    }

    patternMatching(input)
}