package liskovsustitution.classes

class Calculadora {

    fun calcularAreaTotal(figuras: List<Figura>): Double {
        var areaTotal = 0.0
        for (figura in figuras) {
            areaTotal += when (figura) {
                is Cuadrado -> figura.lado * figura.lado
                is Circulo -> Math.PI * figura.radio * figura.radio
                else -> throw IllegalArgumentException("No corresponde a ninguna figura")
            }
        }
        return areaTotal
    }

    fun calcularAreaCuadrado(cuadrado: Cuadrado): Double {
        return cuadrado.lado * cuadrado.lado
    }
}

fun main() {
    val circulo = Circulo(25.0)
    val cuadrado = Cuadrado(5.0)
    val listaFiguras = listOf(circulo, cuadrado)

    val calculadora = Calculadora()
    println("Total de Areas: ${calculadora.calcularAreaTotal(listaFiguras)}")

    println("Area del cuadrado: ${calculadora.calcularAreaCuadrado(cuadrado)}")
}