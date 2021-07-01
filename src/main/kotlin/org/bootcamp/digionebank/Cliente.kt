package org.bootcamp.digionebank

class Cliente(nome:String, cpf:String, val clienteTipo:CLienteTipo, val senha: String): Pessoa(nome, cpf), Logavel {
    override fun login(): Boolean = "123" == senha

    override fun toString(): String {
        return "Nome: $nome, CPF: $cpf, Tipo: $clienteTipo, Logado: ${login()}".trimIndent()
    }


}