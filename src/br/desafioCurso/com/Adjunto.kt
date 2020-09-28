package br.desafioCurso.com

class Adjunto(override var nome: String,
              override var sobrenome: String,
              override var codigo: Int,
              override var tempoDeCasa: Int,

) : Professor {
    private var qtdHorasMonitoria: Int? = null
    override fun toString(): String {
        return "Adjunto(nome='$nome', sobrenome='$sobrenome', codigo=$codigo, tempoDeCasa=$tempoDeCasa, qtdHorasMonitoria=$qtdHorasMonitoria)"
    }


}




