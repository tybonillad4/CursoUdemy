package com.example.cursoudemy

class Programador(name: String, age: Int, val lenguaje: String) : Persona(name, age), Vehiculo {

    //sobreescritura en herencia
    override fun work() {
        //super.work()    si se ejecuta se volvera a imprimir lo que este en este mismo metodo de la clase padre
        println("Esta persona esta programando")
        println("Comentario prueba para git")
    }

    fun sayLenguaje() {
        println("Este programador usa el lenguaje $lenguaje")
    }

    override fun goToWork() {
        println("Esta persona va a google")
    }

    override fun drive() {
        println("esta persona conduce un coche")
    }
}