package br.com.digitalhouse.olamundo

fun main(){
    println("Olá mundo!")
    println(mostrarMeuNome("Corrêa", 24))
    println("------------------------------------------")
    println("LISTA DE ALUNOS")
    println("------------------------------------------")
    println(alunosDeAndroid())

    for (nome in alunosDeAndroid()){
        println(nome)
    }
}

fun mostrarMeuNome(sobrenome: String, idade: Int): String{

    val idadeRecebida = when (idade) {
        18 -> "tem 18 anos"
        20 -> "tem 20 anos"
        30 -> "tem 30 anos"
        else -> "nao se sabe a idade"
    }

    return "Jéssica $sobrenome e idade $idadeRecebida"
}

fun alunosDeAndroid(): ArrayList<String>{

    val listaAlunos = arrayListOf<String>()
    listaAlunos.add("Wagner")
    listaAlunos.add("Vitória")
    listaAlunos.add("João")
    listaAlunos.add("André")

    return listaAlunos
}