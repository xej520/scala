package com.xej.learning.forTest

//主要测试for的嵌套，写法
object ForTest003 {
    def main(args: Array[String]): Unit = {
        val arr = for{
            i <- 1 to 10
            j <- 1 to i
            k <- 1 to j
        } yield (s"$i $j $k")

        arr.foreach(println(_))
    }
}
