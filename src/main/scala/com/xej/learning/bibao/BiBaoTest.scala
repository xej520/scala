package com.xej.learning.bibao

/**
  * Created by erjun on 2017/9/11.
  */
object BiBaoTest {
	def main(args: Array[String]): Unit = {
		val salesDepartment = add(10000) //变量salesDepartment相等于一个匿名函数，wages + 10000
		println("---->:\t" + salesDepartment(10)) //为销售部门的某一个员工发工资，基本工资是10
		val rDdepartment = add(15000) //变量rDdepartment相等于一个匿名函数，wages + 15000
		println("---->:\t" + rDdepartment(100))
		val testDepartment = add(12000) //变量testDepartment相等于一个匿名函数，wages + 12000
		println("---->:\t" + testDepartment(10))
	}
	def add(bonus: Int) = (wages: Int) => wages + bonus //bonus，这种形式就是闭包现象



}


















