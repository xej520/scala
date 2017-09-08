package com.xej.learning.nimingFunction

object AnonymousFunction {
	def main(args: Array[String]): Unit = {
		//对于有参数输入的匿名函数，调用时，同样要用参数输入哦
		kafkaName("apache kafka")
		println("--->:\t" + flumeName("apache flume"))
		sparkName

		//匿名函数的使用场景--1，作为参数，传入给高阶函数
		//下面，map,foreach里，就是匿名函数
		Array(3,2,1,5).map{(x: Int) => x + 2}.foreach(x => print(x + " "))

		println("\n----------------------------------------------------")

		Array(3,2,1,5).map{_ + 1}.foreach(x => print(x + " "))
	}

	//匿名函数的使用场景--2，直接赋值给变量
	//参数：有参数输入，函数体：无返回值，形式的匿名函数//函数体里，可能有很多条语句哦，
	//只是最终结果，是有返回值的
	val kafkaName = (name: String) => println("--kafka-->" + name)

	//参数：有参数输入，函数体：有返回值，形式的匿名函数
	val flumeName = (name: String) => "--flume-->" + name

	//参数：无参数输入，函数体：无返回值，形式的匿名函数
	val sparkName = println("----this is spark------")
}
