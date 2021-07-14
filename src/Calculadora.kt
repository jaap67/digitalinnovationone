import java.util.*

fun main() {
    val operando1:Float = 3.0F
    val operando2:Float = 15.0F

    val z: Float? = when (3) {
        1 -> calculate(operando1, operando2){ a, b -> a + b }
        2 -> calculate(operando1, operando2){ a, b -> a - b }
        3 -> calculate(operando1, operando2){ a, b -> a * b }
        4 -> {
            if (operando2 == 0f) {
                println("Não se faz divisão por zero")
                null
            } else (operando1 / operando2)
        } else -> {
            println("Valor de Operação deve ser de 1 a 4")
            null
        }
    }
    if(z != null) println(String.format(Locale("pt", "BR"),"%.2f", z))
}

inline fun calculate(n1:Float, n2: Float, operation:(Float, Float) -> Float) = operation(n1, n2)