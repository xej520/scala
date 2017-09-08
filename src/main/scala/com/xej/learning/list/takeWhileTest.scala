package com.xej.learning.list

/**
  * Created by erjun on 2017/9/8.
  */
object takeWhileTest {
	def main(args: Array[String]): Unit = {
		val names = List("spark", "hadoop","kafka","hive", "mesos", "zero", "xyz","marathon")
		//需求：将names容器中，获取/过滤出元素长度为4的元素，
		//takeWhile, 从第一个元素开始判断，满足条件，就留下，直到遇到第一个不满足的条件的元素，就结束循环
		//可见，takeWhile 有可能并不是对所有的元素进行操作的
		names.takeWhile(_.length > 4 ).foreach{x => print(x + " ")}

		println("\n------------------")
		//从左边开始获取2个元素，
		names.take(2).foreach{x => print(x + " ")}
		println("\n------------------")
		//从右边开始获取4个元素，
		names.takeRight(4).foreach{x => print(x + " ")}
		println("\n------------------")
		//filter， 同样，满足条件，就留下。是对所有的元素，进行操作的
		names.filter(_.length > 4).foreach{x => print(x + " ")}//将"xyz"元素，过滤掉了
	}
}
