class calculator
{
 def +(a: Int, b: Int): Int=a+b
 def -(a: Int, b: Int): Int=a-b
 def *(a: Int, b: Int): Long=a*b
 def /(a: Int, b: Int): Int=a/b
}

object calculator
{
 def main(args: Array[String]) =
 { 
  val calc = new calculator()

  println("Addition: ", + calc.+(10,2))
  println("Subtraction: ", + calc.-(10,2))
  println("Multiplication: ", + calc.*(10,2))
  println("Division: ", + calc./(10,2))
 }
}
