package br.desafioCurso.com

import java.util.*

data class Matricula(var aluno: Aluno, var curso: Curso) {
    var data = Date()

    init {
        println("Matricula do(a) aluno(a) ${aluno.nome}  criado na data de: $data")
    }



}


