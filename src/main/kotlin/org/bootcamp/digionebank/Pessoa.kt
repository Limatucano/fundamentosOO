package org.bootcamp.digionebank

class Pessoa() {
     var nome: String = "Matheus"
     var cpf: String = "132.456.789-00"
     private set // modificador de visibilidade para set


}

fun main() {
    val matheus = Pessoa()
}