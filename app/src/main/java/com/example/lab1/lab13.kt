package com.example.lab1.lab1

class nguoi(var name : String, var classId : String){
    fun nameID ( name : String){
        this.name = name
    }
    fun classID ( classId : String){
        this.classId = classId
    }
    fun displayID(): String{
        return "name: $name, class: $classId"
    }
}