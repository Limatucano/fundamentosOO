package org.bootcamp.digionebank.testes

import org.bootcamp.digionebank.Analista
import org.bootcamp.digionebank.Funcionario
import org.bootcamp.digionebank.Relatorio

fun main(){
    val joao = Analista("123456","joao alberto",1500.0)

    Relatorio.imprime(joao)
}
