package br.desafioCurso.com

data class Titular(override var nome: String,
              override var sobrenome: String,
              override var codigo: Int,
              override var tempoDeCasa: Int,
              var especialidade : String
) : Professor {
    override fun toString(): String {
        return "Titular(nome='$nome', sobrenome='$sobrenome', codigo=$codigo, tempoDeCasa=$tempoDeCasa, especialidade='$especialidade')"
    }
}

