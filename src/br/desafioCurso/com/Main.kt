package br.desafioCurso.com

fun main() {

    val digitalHouseManger = DigitalHouseManger()

    digitalHouseManger.registrarProfessorAdjunto("Lucas", "Martins",123, 50)
    digitalHouseManger.registrarProfessorAdjunto("Silvia", "Vasconcelos",125, 90)

    digitalHouseManger.registrarProfessorTitular("Pedro", "Linhares", 165, 290, "Inglês")
    digitalHouseManger.registrarProfessorTitular("Julia", "Barbosa", 195, 250, "Filosofia")

    digitalHouseManger.registrarCurso("Full Stack", 2001,3)
    digitalHouseManger.registrarCurso("Android", 2002,2)



    digitalHouseManger.alocarProfessores(2001, 165,123)
    digitalHouseManger.alocarProfessores(2002, 195,125)



    digitalHouseManger.matricularAluno("Leonardo", "Sousa", 999)
    digitalHouseManger.matricularAluno("Tabata", "Isaias", 998)

    digitalHouseManger.matricularAluno("Patricia", "Castanhar", 997)


    digitalHouseManger.matricularAluno(999,2001)
    digitalHouseManger.matricularAluno(998,2001)

    digitalHouseManger.matricularAluno(999,2002)
    digitalHouseManger.matricularAluno(998,2002)
    digitalHouseManger.matricularAluno(997,2002)




}