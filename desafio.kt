import java.text.Normalizer.Form

// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

data class Usuario(val nome:String, val id: Int) //recebe um nome e um ID, é usada para inserir usuários nas formações

data class ConteudoEducacional(val nome: String, val duracao: Int) // recebe o nome e duração e é inserido nas formações

//Classe Formacao recebe o nome da formação, lista de conteúdos educacionais e nível de dificuldade.
data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>, val nivel: Nivel) {

    val inscritos = mutableListOf<Usuario>()

    // matricula um usuário criado pela classe Usuario na lista de inscritos da formação
    fun matricular(usuario: Usuario) {
        // TODO("Utilize o parâmetro $usuario para simular uma matrícula (usar a lista de $inscritos).")
        inscritos.add(usuario)
    }

    // imprime a lista de alunos inscritos na formação
    fun getInscritos(){
        println(inscritos)
    }
}

fun main() {
    // TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
    // TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")

    val userMauricio = Usuario("Mauricio", 1)
    val poo = ConteudoEducacional("POO", 60)
    val classes = ConteudoEducacional("Classes em Kotlin", 120)
    val formation = Formacao("Kotlin", listOf(poo, classes), Nivel.INTERMEDIARIO)

    formation.matricular(userMauricio)

    println(formation)
}
