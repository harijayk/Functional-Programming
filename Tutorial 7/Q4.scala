 class Account(id:String,n:Int,b:Double){
    val nic:String=id
    val accno=n
    var balance=b
        
}
object Q4 extends App{
  val acc1=new Account("001",123,25000)
  val acc2=new Account("002",234,50000)
  val acc3=new Account("003",345,-100)
  val acc4=new Account("004",456,500)
  val acc5=new Account("005",567,-200)

  var bank:List[Account]=List(acc1,acc2,acc3,acc4,acc5)
  
  println("Accounts with negative balances:\n"+find(bank)+"\n")
  add(bank)
  interest(bank)

  def find(list:List[Account])={
    list.filter(x=>x.balance<0)
  }

  def add(list:List[Account])={
     var sum=list.foldLeft(0.0)((sum,y)=>sum+y.balance)
     println("Sum of all account balances:"+sum+"\n")
  }

  def interest(list:List[Account])={
    list.map(x=>{
      if (x.balance>0) {
        x.balance=x.balance+x.balance*0.05
        println("Final balance of account "+x.accno+" = "+(x.balance)) 
      } else {
        x.balance=x.balance+x.balance*0.1
        println("Final balance of account "+x.accno+" = "+(x.balance)) 
      }
    })
  }
}
