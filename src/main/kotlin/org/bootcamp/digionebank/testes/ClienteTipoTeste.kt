package org.bootcamp.digionebank.testes

import org.bootcamp.digionebank.CLienteTipo

fun main(){
    CLienteTipo.values().map{ tipo ->
        println(tipo.legend)
    }
    CLienteTipo.values().forEach {
        println(it.legend)
    }

    val pf = CLienteTipo.PF

    println(pf.name + pf.legend)

}