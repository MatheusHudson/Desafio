package br.desafioCurso.com

import java.util.*

class Matricula(var aluno: Aluno, var curso: Curso) {
    var data = Date()

    init {
        println("Matricula do(a) aluno ${aluno.nome} do curso ${curso.nome} criado na data de: $data")
    }



}


