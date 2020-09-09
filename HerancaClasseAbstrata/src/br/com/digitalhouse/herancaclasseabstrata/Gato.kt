package br.com.digitalhouse.herancaclasseabstrata

class Gato : Felino() {
    override val cor: String = "amarelo"

    fun gatoAndando(){
        super.locomover()
        println("A cor é $cor")
    }
}