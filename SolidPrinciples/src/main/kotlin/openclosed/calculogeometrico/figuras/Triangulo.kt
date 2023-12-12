package openclosed.calculogeometrico.figuras

import openclosed.calculogeometrico.interfaces.FormaGeometrica

class Triangulo(private val base: Double, private val altura: Double): FormaGeometrica {

    override fun calcularArea(): Double {
        return (base * altura) / 2
    }
}