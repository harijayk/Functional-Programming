object Q3 extends App {
    var b:Int = 0;
    def sum(a:Int): Unit={
        b = b + a; 
        if(a>0) sum(a - 1);
        else print(b); 
    }

    print("Input a value:");
    val input = scala.io.StdIn.readInt()
    sum(input);
}