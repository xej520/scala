package com.xej.learning.currying

/**
  * Created by erjun on 2017/9/7.
  */
object CurryingTest {
	def main(args: Array[String]): Unit = {
		println("---->:\t" + sum(3,4))
		println("---->:\t" + sum2(5))
		println("---->:\t" + sum2(5)(1))
		// 柯里函数
		println("---->:\t" + sum3(4)(8))
	}
	def sum(a: Int, b: Int) = a+b
	def sum2(a: Int) = (b: Int) => a + b
	def sum3(a: Int)(b: Int) = a + b
}
