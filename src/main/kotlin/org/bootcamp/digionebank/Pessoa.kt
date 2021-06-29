package org.bootcamp.digionebank

class Pessoa() {
     var nome: String = "Matheus"
     var cpf: String = "132.456.789-00"
    private set
// modo tradicional get e set
//    private var nome: String = "Matheus"
//    private var cpf: String = "132.456.789-00"


// modo tradicional get e set
//    fun getCpf():String{
//        return this.cpf
//    }
//    fun setCpf(cpf:String){
//        this.cpf = cpf
//    }
    inner class Endereco{
        val rua: String = "teste"
        val bairro: String = "Centro"
    }
}

fun main() {
    val matheus = Pessoa()
    println(matheus.cpf)

// modo tradicional get e set
//    println(matheus.getCpf())
//    matheus.setCpf("123")
//    println(matheus.getCpf())

    println(matheus.Endereco().rua)
}