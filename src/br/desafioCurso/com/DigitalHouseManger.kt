package br.desafioCurso.com

class DigitalHouseManger() {
    val listaAlunos = mutableListOf<Aluno>()
    val listaProfessores = mutableListOf<Professor>()
    val listaCursos = mutableListOf<Curso>()
    val listaMatriculas = mutableListOf<Matricula>()


    fun registrarCurso(nome: String, codigoCurso: Int, qtdMaximaAluno: Int) {
        val curso = Curso(nome, codigoCurso, qtdMaximaAluno)
        listaCursos.add(curso)
        println("Curso registrado com sucesso!")
    }

    fun excluirCurso(codigoCurso: Int) {
        when {
            listaCursos.contains(codigoCurso) -> {
                listaCursos.remove(listaCursos[codigoCurso])
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
        listaProfessores.add(professorAdjunto)
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
        listaProfessores.add(professorTitular)
        println("Professor Titular adicionado!")
    }

    fun excluirProfessor(codigoProfessor: Int) {
        val lista = listaProfessores.filter { it.codigo === codigoProfessor }
        when {
            lista.isNotEmpty() -> {
                println("Professor removido com sucesso! ")
            }
            else -> println("Não é possivel excluir este curso, pois ele não existe!")
        }

    }

    fun matricularAluno(nome: String, sobrenome: String, codigoAluno: Int) {
        val aluno = Aluno(nome, sobrenome, codigoAluno)
        listaAlunos.add(aluno)
        println("Aluno adicionado!!")
    }

    fun matricularAluno(codigoAluno: Int, codigoCurso: Int) {
        val filtrarAluno = listaAlunos.filter { it.codigo === codigoAluno }
        val filtrarCurso = listaCursos.filter { it.codigo === codigoCurso }

        when {
           filtrarAluno.isNotEmpty() && filtrarCurso.isNotEmpty() -> {
                val aluno = filtrarAluno
                val curso = listaCursos[codigoCurso]
               aluno.forEach { curso.adicionarUmAluno(it) }
               aluno.forEach { curso.listaAlunosMatriculado.add(it)}

                val matricula = Matricula(aluno[0], curso)
                listaMatriculas.add(matricula)

            }
            else -> println("Informe um codigo de Aluno e codigo de curso existente!")
        }
    }

    fun alocarProfessores(
            codigoCurso: Int,
            codigoProfessorTitular: Int,
            codigoProfessorAdjunto: Int,
    ) {
        val filtrarCurso = listaCursos.filter { it.codigo === codigoCurso }
        val filtrarProfessorTitular = listaProfessores.filter { it.codigo === codigoProfessorTitular }
        val filtrarProfessorAdjunto = listaProfessores.filter { it.codigo === codigoProfessorAdjunto }
        when {
            filtrarCurso.isNotEmpty() && filtrarProfessorTitular.isNotEmpty() -> {
                listaProfessores.addAll(filtrarProfessorTitular)
                println("Professor alocado com sucesso!")
            }
            filtrarCurso.isNotEmpty() && filtrarProfessorAdjunto.isNotEmpty() -> {
                listaProfessores.addAll(filtrarProfessorAdjunto)
                println("Professor alocado com sucesso!")
            }
            else -> println("Não é possivel alocar estes professores!")


        }

    }


}
