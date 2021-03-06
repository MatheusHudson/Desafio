package br.desafioCurso.com

 class Curso(
         var nome: String,
        var codigo: Int ,
        private var qtdMaximaAlunos: Int,

        ) {
      val titular = mutableMapOf<Int, Titular>()
      val adjunto = mutableMapOf<Int, Adjunto>()

      val listaAlunosMatriculado = mutableMapOf<Int, Aluno>()



    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Curso

        if (codigo != other.codigo) return false

        return true
    }

    fun adicionarUmAluno(codigo: Int,aluno: Aluno): Boolean {
        when  {
            listaAlunosMatriculado.size < qtdMaximaAlunos -> {
                println("Aluno matriculado com sucesso!")
                listaAlunosMatriculado.put(codigo,aluno)
                return true
            }
            else -> {
                println("Não há vagas disponiveis para este curso!")
                return false
            }

        }
    }

fun excluiUmAluno(aluno: Aluno) {
    listaAlunosMatriculado.remove(aluno)
    println("Aluno removido do curso de: $nome!")
}

     override fun toString(): String {
         return "Curso(nome='$nome', codigo=$codigo, qtdMaximaAlunos=$qtdMaximaAlunos)"
     }


 }

