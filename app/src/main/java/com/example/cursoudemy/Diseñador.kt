package com.example.cursoudemy

class Diseñador(name: String, age: Int) : Persona(name, age) {
    override fun work() {
        //super.work()
        println("Esta persona esta diseñando")
    }
}