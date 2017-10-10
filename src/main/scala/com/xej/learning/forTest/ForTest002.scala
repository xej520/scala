package com.xej.learning.forTest

import scala.concurrent.Future

object ForTest002 {
    import scala.concurrent.ExecutionContext.Implicits.global
    def main(args: Array[String]): Unit = {
        val f1 = Future(4)
        val f2 = Future(5)
        val arr = for{
            x <- f1
            y <- f2
        } yield x + y

        arr.foreach(x => println(x))
    }
}
