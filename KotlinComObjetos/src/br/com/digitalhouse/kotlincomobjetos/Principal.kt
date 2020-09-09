package br.com.digitalhouse.kotlincomobjetos

import java.util.*

fun main() {
     //Criação do objeto
     val brasileiro = Pessoa()

     //Exibi as informações inicilizadas na classe Pessoa
     println("O brasileiro é ${brasileiro.nome} e tem a idade de ${brasileiro.idade} anos")

     //Aleterei o valor da propriedade nome
     brasileiro.nome = "Sergio"
     //Exibir uma mensagem com o valor nome alterado
     println("O brasileiro é ${brasileiro.nome} e tem a idade de ${brasileiro.idade} anos")

     //Alterei a propriedade nome
     brasileiro.nome = "Jessica"
     //Mandei exibir o sobrenome
     println("O brasileiro é ${brasileiro.nome} e tem o sobrenome ${brasileiro.sobrenome}")

     //----------------------------------------------------------------------------------------
     val cachorro = Cachorro("Bidu", 2, "Golden" )
     println("O nome do cachorro é ${cachorro.nome}")
     println("A raça é ${cachorro.raca} e idade ${cachorro.idade}")

     val scanner = Scanner(System.`in`)

     print("Olá digite seu nome: ")
     val nomeRecebido = scanner.nextInt()
     println("Olá $nomeRecebido")
}