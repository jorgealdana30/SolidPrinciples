package openclosed.calculogeometrico.figuras

import openclosed.calculogeometrico.interfaces.FormaGeometrica

class Rectangulo(private val ancho: Double, private val altura: Double): FormaGeometrica {

    override fun calcularArea(): Double {
        return ancho * altura
    }
}