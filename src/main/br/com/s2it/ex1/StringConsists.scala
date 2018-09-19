package main.br.com.s2it.ex1

class StringConsists(str: String) {
  def removeEqualsChar(): String = str.map(_.toLower).distinct
}