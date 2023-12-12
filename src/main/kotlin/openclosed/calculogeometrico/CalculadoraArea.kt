package openclosed.calculogeometrico

import openclosed.calculogeometrico.figuras.Circulo
import openclosed.calculogeometrico.figuras.Rectangulo
import openclosed.calculogeometrico.figuras.Triangulo
import openclosed.calculogeometrico.interfaces.FormaGeometrica

class CalculadoraArea(private val formas: List<FormaGeometrica>) {

    fun calcularArea(): List<Double> {
        return formas.map { it.calcularArea() }
    }
}

fun main() {
    val circulo = Circulo(5.0)
    val rectangulo = Rectangulo(10.0, 5.0)
    val triangulo = Triangulo(20.0, 15.0)

    val listaFormas = listOf(circulo, rectangulo, triangulo)
    val calculadoraArea = CalculadoraArea(listaFormas)

    calculadoraArea.calcularArea().forEachIndexed { index, area ->
        println("Area de la forma ${index + 1}: $area")
    }
}