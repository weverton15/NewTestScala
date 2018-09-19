import main.br.com.s2it.ex1.StringConsists
import main.br.com.s2it.ex2.SpecialDigit

object Main extends App {
  val strRemove = new StringConsists("xjjyyzzzxaaaaajjjjjxxxxxxxxyyyyyyzzzzzzzooooo")
  println(strRemove.removeEqualsChar())

  val sumDigits = new SpecialDigit(4256976)
  println(sumDigits.sumNumbers())
}
