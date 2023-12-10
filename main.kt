class Formacao(
    val nome: String,
    val nivel: String,
    val conteudosEducacionais: MutableList<ConteudoEducacional> = mutableListOf()
) {
    private val alunosMatriculados: MutableList<Aluno> = mutableListOf()
    var totalInscritos: Int = 0
        private set
    var total50Porcento: Int = 0
        private set
    var totalFinalizados: Int = 0
        private set

    fun matricularAluno(aluno: Aluno) {
        alunosMatriculados.add(aluno)
        totalInscritos++
    }

    fun atualizarProgressoAluno(aluno: Aluno, progresso: Double) {
        if (progresso >= 0.5 && progresso < 1.0) {
            total50Porcento++
        } else if (progresso >= 1.0) {
            totalFinalizados++
        }
    }

  
}

}

class ConteudoEducacional(
    val titulo: String,
    val descricao: String
)

class Aluno(
    val nome: String,
    val email: String
)
