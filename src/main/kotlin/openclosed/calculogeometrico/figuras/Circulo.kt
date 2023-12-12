package openclosed.calculogeometrico.figuras

import openclosed.calculogeometrico.interfaces.FormaGeometrica

class Circulo(private val radio: Double) : FormaGeometrica {

    override fun calcularArea(): Double {
        return Math.PI * radio * radio
    }
}