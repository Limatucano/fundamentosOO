package org.bootcamp.digionebank.testes

import org.bootcamp.digionebank.Funcionario
import org.bootcamp.digionebank.Gerente
import org.bootcamp.digionebank.Relatorio

fun main(){
    val matheus = Gerente("matheus", "123456", 2500.0, "senha123")

    Relatorio.imprime(matheus)

    AutenticacaoTeste().autentica(matheus)
}

