package com.example.lab1

fun main() {
    val name = "thanh"
    val age = 20

    println("ten : $name")
    println("tuoi : $age")

    printHello()

    printThongTin("long",19)

    val chuvitamgiac = tinhtong(3,4,5)
    println("chu vi tam giac : $chuvitamgiac")

    println("1 so ngau nhien : ${random()}")

    print("lap lai dau . : ")
    laplai1()
    println()

    laplai2(2,5)

    vonglapdieukien(12)

    print("chon NN tu 1 den 3:")
    vonglapdieukienWhen()
    println()

    vonglapdieukienWhen2()

    val myDongxu = dongxu()
    print("tung dong xu la mat : ")
    myDongxu.roll()

    val myxucxac = xucxac2(10)
    val tong = myxucxac.roll()
    println("xuc xac co ${myxucxac.socham}")
    println("tung duoc $tong cham")
}
//các hàm
fun printHello () {
    println ("Hello thay giao")
}

fun printThongTin(name: String, age: Int) {
    println("doi ten thanh : $name")
    println("tuoi moi la : $age")
}

fun tinhtong(a : Int,b : Int, c :Int ): Int {
    return a + b + c
}

fun random(): Int{
    val randomNN = (1..100).random()
    return randomNN
}

fun laplai1(){
    repeat(20){
        print(".")
    }
}

fun laplai2(age : Int,sovong : Int) {
    repeat(sovong){
        repeat(age + 2){
            print("@")
        }
        println()
    }
}

fun vonglapdieukien(num : Int){
    if (num > 5){
        println("so lon hon 5")
    }
    else if ( num == 5){
        println("so la so 5")
    }
    else {
        println("so nho hon 5")
    }
}

fun vonglapdieukienWhen(){
    val randomNN2 = (1..5).random()
    when (randomNN2) {
        1 -> println("ra so 1")
        2 -> println("ra so 2")
        3 -> println("ra so 3")
    }
}
fun vonglapdieukienWhen2(){
    val xucxac = (1..6).random()

        val tungxucxac = when (xucxac) {
            1 -> "Mot"
            2 -> "Hai"
            3 -> "Ba"
            4 -> "bon"
            5 -> "nam"
            6 -> "sau"
            else -> "NULL"
        }
        println(tungxucxac)

}

class dongxu(){
    val matxu = 2

    fun roll(){
        val tungdongxu = (1..2).random()
        println(tungdongxu)
    }
}

class xucxac2(val socham : Int){

    fun roll(): Int {
        val tungxucxac = (1..socham ).random()
        return tungxucxac
    }
}

