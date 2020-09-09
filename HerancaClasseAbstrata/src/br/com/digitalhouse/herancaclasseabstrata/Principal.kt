package br.com.digitalhouse.herancaclasseabstrata

fun main() {

    println("OBJETO PESSOA------------------------------------------------")
    val brasileiro = Pessoa(19, "ser humano", "João")

    brasileiro.locomover()
    brasileiro.idadePessoa()

    println("OBJETO FELINO------------------------------------------------")
    val pantera = Felino()
    pantera.locomover()

    println("OBJETO GATO------------------------------------------------")
    val gatinhoPelucia = Gato()
    gatinhoPelucia.gatoAndando()
}