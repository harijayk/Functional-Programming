object Q3 extends App{
  def toUpper(s: String): String = {
    s.toUpperCase()
  }

  def toLower(s: String): String = {
    s.toLowerCase()
  }

  def names(name: String)(func: String => String): String = {
    func(name)
  }

  println(names("Benny")(toUpper(_)))
  println(names("Niroshan".substring(0,2))(toUpper(_)) + names("Niroshan".substring(2))(toLower(_)))
  println(names("Saman")(toLower(_)))
  println(names("Kumara".substring(0,1))(toUpper(_)) + names("Kumara".substring(1,5))(toLower(_)) + names("Kumara".substring(5))(toUpper(_)))

}