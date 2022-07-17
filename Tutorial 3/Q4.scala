object bookstore{
    def price(noOfBooks:Int):Double = noOfBooks*24.95

    def discount(price:Double):Double = price*0.4

    def shippingCosts(noOfBooks:Int):Double = noOfBooks match{
        case x if x<=50 => x*3
        case x if x>50 => (50*3) + ((x-50)*0.75)
    }

    def wholesaleCost(noOfBooks:Int):Double = price(noOfBooks) - discount(price(noOfBooks)) + shippingCosts(noOfBooks)

    def main(args: Array[String]):Unit = {
        printf("Wholesale price = ")
        println(wholesaleCost(60))
    } 
}