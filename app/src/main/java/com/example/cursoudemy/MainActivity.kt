package com.example.cursoudemy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //sentenciaIf()
        claseHerencia()
    }

    private fun sentenciaIf() {
        var a = 10
        var b = 119
        var c = 5
        var numeroMayor: Int

        numeroMayor = if (a > b && a > c) a else if (b > a && b > c) b else c
        println("Ek numero mayor es $numeroMayor")
    }

    private fun claseHerencia() {
        val programador = Programador(name = "Tatiana", age = 26, lenguaje = "Kotlin")
        programador.work()
        programador.sayLenguaje()
        programador.goToWork()
        val diseñador = Diseñador(name = "Brian", age = 24)
        diseñador.work()
        diseñador.goToWork()
    }
}