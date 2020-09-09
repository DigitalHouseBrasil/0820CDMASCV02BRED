package br.com.digitalhouse.herancaclasseabstrata

abstract class Animal(open val idade: Int = 0, open val especie: String = "") {

    open fun locomover(){}

    fun idade(){
        println("Animal tem idade de $idade e é da especie $especie" )
    }

    abstract fun come(comida: String): String
}