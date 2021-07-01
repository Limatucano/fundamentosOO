package org.bootcamp.digionebank

class Analista(cpf:String, nome:String, salario:Double ) : Funcionario(cpf,nome, salario) {
    override fun calculoAuxilio() = this.salario* 0.1

}