package br.desafioCurso.com

class Adjunto(override var nome: String,
              override var sobrenome: String,
              override var codigo: Int,
              override var tempoDeCasa: Int,
              var qtdHorasMonitoria: Int
) : Professor


