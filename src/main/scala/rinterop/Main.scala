package rinterop

object Main extends App{
  println("Hello world")
  rs.main()
}
 object rs {
  import org.rosuda.REngine
  import org.rosuda.REngine.Rserve.RConnection

  def main() {
    val c = new RConnection
    val d = c.eval("rnorm(10)")
    val e = d.asDoubles

    for (i <- 0 until 10) {
        println(e(i))
    }
  }
}