package com.example.lab1

import android.R
import com.example.lab1.lab1.nguoi
import kotlin.String

fun main() {
//nhóm
    val numbers = listOf(0, 3, 8, 4, 0, 5, 5, 8, 9, 2)
    println("danh sach goc : $numbers")
    val setOfNumbers = numbers.toSet()
    println("danh sach sau set:$setOfNumbers")

    val chuoi1 = setOf(1, 2, 3)
    val chuoi2 = setOf(3, 4, 5)

    println("tim number chung : ${chuoi1.intersect(chuoi2)}")
    println("gop number chung : ${chuoi1.union(chuoi2)}")
// sơ đồ

    val student = mutableMapOf(
        "name" to " Thanh",
        "age " to 20,
        "class" to " CE"
        )
    println("ly lich sinh vien : $student")

    student.forEach { println("{${it.key}} is ${it.value}") }
    println(student.map { "${it.key} is ${it.value}" }.joinToString (" , "))
    val locTen =student.filter { it.key.length < 5 }
    println(locTen)

// hàm vi phạm


    val Nguoi = nguoi(name = "thanh",classId = "24CE")
    println(Nguoi.displayID())

    val nguoi1 : nguoi? = null
    nguoi1?.let {
        println("Tên người: ${it.name}")
        println("Mã lớp: ${it.classId}")
    }
    Nguoi.apply {
        name = "thanh"
        classId = "24CE"
    }
}