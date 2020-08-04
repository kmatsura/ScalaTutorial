object ComplexNumbers {
class Complex1(real: Double, imaginary: Double) {
  def re() = real
  def im() = imaginary
}

class Complex2(real: Double, imaginary: Double) {
  def re = real
  def im = imaginary
}
  def main(args: Array[String]): Unit = {
    val c1 = new Complex1(1.2, 3.4)
    println("imaginary part1: " + c1.im())
    val c2 = new Complex2(2.3, 4.5)
    println("imaginary part2: " + c2.im)
  }
}