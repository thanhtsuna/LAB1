package com.example.lab1
import android.R.string


fun main() {
// lớp trựu tượng
    val nha = Nha()
    println("vat lieu de xay nha la ${nha.valieu}")

    println("dien tich nha : ${nha.dientich()}")

//danh sách
    val students = listOf("thanh","long","quan")
    println("danh sach hoc sinh : $students")
    println("so hoc sinh : ${students.size}")
    println("hoc sinh so 2 la :${ students[2] }")
    val students1 = listOf("thanh","long","quan").reversed()
    println("danh sach sau khi dao : $students1")
    val students2 = mutableListOf("thanh","long","quan")
    println("danh sach ban dau : $students2")
    students2.add("do")
    println("danh sach sau khi them : $students2")
    students2.remove("long")
    println("danh sach sau khi xoa : $students2")
    students2[2] = "peter"
    println("danh sach sau khi sua : $students2")

//vòng lặp

    for (student in students){
        println("vong for: $student")
    }
    var muc = 0
    while (muc < students.size){
        println("vong while: ${students[muc]}")
        muc++
    }

// chuỗi
    val name = "thanh"
    println("do dai: ${name.length}")

    val number = 5
    println("ten to co $number ki tu")

    val dai = 10
    val rong = 5
    println("chu vi : ${dai * rong}cm2")
}
// trựu tương
abstract class xaynha() {
    abstract val valieu : String

    abstract fun dientich(): Double

}
class Nha : xaynha(){
    override val valieu = "gach "

    override fun dientich() : Double{
        return 100.0
    }
}
//danh sách
