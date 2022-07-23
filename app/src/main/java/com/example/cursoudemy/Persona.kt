package com.example.cursoudemy

//open se usa para permitir que se pueda extender otras clases de ella
open class Persona(
    name: String,
    age: Int
) : Work() {

    //Cualquier clase tiene una superclase comun "Any"
    open fun work() {   //el open se usa para poder sobreescribir metodos en las clases hijas
        println("Esta persona esta trabajando")
    }

    override fun goToWork() {
        println("Esta persona va al trabajo")
    }
}