package br.desafioCurso.com

data class Aluno(var nome: String, var sobrenome: String, var codigo: Int) {
    var cursosMartriculados = mutableListOf<Curso>()



}
