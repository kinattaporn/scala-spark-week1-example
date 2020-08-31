package example

object Main extends App {
  println("---------------------------- sum")
  println(Lists.sum(List(1,2,3)))

  println("---------------------------- sum")
  println(Lists.sum(List()))

  println("---------------------------- max")
  println(Lists.max(List(2,1,3)))

  println("---------------------------- max")
  println(Lists.max(List()))
}
