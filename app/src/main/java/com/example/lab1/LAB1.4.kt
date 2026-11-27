package com.example.lab1.lab1

import kotlinx.coroutines.*

suspend fun getValue(): Double {
    delay(2000)
    return 10.0
}

suspend fun processValue() {
    val value = getValue()
    println("$value")
}

fun main() = runBlocking {

    // 1. Chạy hàm
    val job: Job = launch {
        processValue()
    }

    // 2. Chờ một chút
    delay(1000)

    // 3. Kiểm tra
    println("dang chay: ${job.isActive}")

    // 4. Hủy
    job.cancel()

    println("huy")
}