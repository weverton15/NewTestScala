package main.br.com.s2it.ex2

class SpecialDigit(number: Int) {
  def sumNumbers(): Int = {
    def sums(n: Int):Int = n match {
      case n if n < 10 => n
      case _           => sums(n.toString.map(_.asDigit).sum)
    }
    sums(number)
  }
}