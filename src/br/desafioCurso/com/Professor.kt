package br.desafioCurso.com

interface Professor {
    var nome: String
    var sobrenome: String
    var codigo: Int
    var tempoDeCasa: Int


     fun equals(other: Professor): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Professor

        if (codigo != other.codigo) return false

        return true
    }


}