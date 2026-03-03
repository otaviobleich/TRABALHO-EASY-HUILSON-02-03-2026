import javax.script.ScriptEngineManager

class NivelExtremo {}

fun main() {

    println("Digite a expressão (mínimo 9 caracteres, com parênteses): ")
    val texto = readLine()

    if (texto != null && texto.length >= 9) {

        try {
            val gerenciador = ScriptEngineManager()
            val mecanismo = gerenciador.getEngineByName("JavaScript")
            val valorFinal = mecanismo.eval(texto)

            println("Resultado: $valorFinal")

        } catch (erro: Exception) {
            println("Erro na expressão!")
        }

    } else {
        println("A expressão deve ter no mínimo 9 caracteres.")
    }
}