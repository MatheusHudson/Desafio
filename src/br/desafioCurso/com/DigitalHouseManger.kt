package br.desafioCurso.com

import java.lang.Exception

class DigitalHouseManger() {
    val listaAlunos = mutableMapOf<Int, Aluno>()
    val listaProfessores = mutableMapOf<Int, Professor>()
    val listaCursos = mutableMapOf<Int, Curso>()
    val listaMatriculas = mutableListOf<Matricula>()


    fun registrarCurso(nome: String, codigoCurso: Int, qtdMaximaAluno: Int) {
        val curso = Curso(nome, codigoCurso, qtdMaximaAluno)
        listaCursos.put(codigoCurso, curso)
        println("Curso registrado com sucesso!")
    }

    fun excluirCurso(codigoCurso: Int) {
        when {
            listaCursos.containsKey(codigoCurso) -> {
                listaCursos.remove(codigoCurso)
                println("Curso removido!")
            }
            else -> println("Não é possivel excluir este curso, pois ele não existe!")
        }

    }

    fun registrarProfessorAdjunto(
            nome: String,
            sobrenome: String,
            codigoProfessor: Int,
            quantidadeDeHoras: Int,
    ) {

        var professorAdjunto = Adjunto(nome, sobrenome, codigoProfessor, quantidadeDeHoras)
        listaProfessores.put(codigoProfessor, professorAdjunto)
        println("Professor Adjunto adicionado!")

    }

    fun registrarProfessorTitular(
            nome: String,
            sobrenome: String,
            codigoProfessor: Int,
            quantidadeDeHoras: Int,
            especialidade: String,
    ) {

        var professorTitular = Titular(nome, sobrenome, codigoProfessor, quantidadeDeHoras, especialidade)
        listaProfessores.put(codigoProfessor, professorTitular)
        println("Professor Titular adicionado!")
    }

    fun excluirProfessor(codigoProfessor: Int) {

        when {
            listaProfessores.containsKey(codigoProfessor) -> {
                listaProfessores.remove(codigoProfessor)
                println("Professor removido com sucesso! ")
            }
            else -> println("Não é possivel excluir este curso, pois ele não existe!")
        }

    }

    fun matricularAluno(nome: String, sobrenome: String, codigoAluno: Int) {
        val aluno = Aluno(nome, sobrenome, codigoAluno)
        listaAlunos.put(codigoAluno, aluno)
        println("Aluno adicionado!!")
    }

    fun matricularAluno(codigoAluno: Int, codigoCurso: Int) {


        when {
            listaAlunos.containsKey(codigoAluno) && listaCursos.containsKey(codigoCurso) -> {

                val aluno = listaAlunos[codigoAluno]
                val curso = listaCursos[codigoCurso]

                var check = curso!!.adicionarUmAluno(codigoAluno, aluno!!)

                if (check && !aluno.cursosMartriculados.contains(curso)) {

                    aluno.cursosMartriculados.add(curso)

                    curso.listaAlunosMatriculado.put(codigoAluno, aluno)
                    val matricula = Matricula(aluno, curso)
                    listaMatriculas.add(matricula)

                }

            }
            else -> println("Informe um codigo de Aluno e codigo de curso existente!")
        }
    }

    fun alocarProfessores(
            codigoCurso: Int,
            codigoProfessorTitular: Int,
            codigoProfessorAdjunto: Int,
    ) {


        when {
            listaCursos.containsKey(codigoCurso) && listaProfessores.containsKey(codigoProfessorTitular) &&
                    listaCursos.containsKey(codigoCurso) && listaProfessores.containsKey(codigoProfessorAdjunto) -> {

                listaCursos[codigoCurso]!!.titular.put(codigoProfessorTitular, listaProfessores[codigoProfessorTitular] as Titular)
                println("Professor alocado com sucesso!")

                listaCursos[codigoCurso]!!.adjunto.put(codigoProfessorAdjunto, listaProfessores[codigoProfessorAdjunto] as Adjunto)
                println("Professor alocado com sucesso!")
            }
            else -> println("Não é possivel alocar estes professores!")
        }
    }


    fun verificarCursosMatriculados(aluno: Aluno?) {
        try {
            println("${aluno?.nome} está matriculado nos cursos de:")
            aluno!!.cursosMartriculados.forEach { println(it.nome) }
        } catch(ex : Exception) {
            println("Escolha um aluno valido")
        }

    }

}
