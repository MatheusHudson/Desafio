package br.desafioCurso.com

class Curso(
        var nome: String,
        var codigo: Int,
        var titular: Titular,
        var adjunto: Adjunto,
        var qtdMaximaAlunos: Int,
        var listaAlunosMatriculado: MutableList<Aluno>
) {

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Curso

        if (codigo != other.codigo) return false

        return true
    }


}