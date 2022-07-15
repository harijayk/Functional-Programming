object Question4b{
    def attendees(ticketPrice:Int):Int = 120 + (15-ticketPrice)/5*20;

    def revenue(ticketPrice:Int):Int = attendees(ticketPrice) * ticketPrice;

    def cost(ticketPrice:Int):Int = 500 + attendees(ticketPrice) * 3;

    def profit(ticketPrice:Int):Int = revenue(ticketPrice) - cost(ticketPrice);

    def main(args: Array[String]):Unit = {
        println(profit(10));
        println(profit(15));
        println(profit(20));
    }
}