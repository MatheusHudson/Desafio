package br.desafioCurso.com

class Titular(override var nome: String,
              override var sobrenome: String,
              override var codigo: Int,
              override var tempoDeCasa: Int,
              var especialidade : String
) : Professor

