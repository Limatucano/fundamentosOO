package org.bootcamp.digionebank.testes

import org.bootcamp.digionebank.Bank

fun main(){
    val itau = Bank("Itáu",1)

    val santander = itau.copy(nome="santander")

    println(itau)
    println(santander)
}
