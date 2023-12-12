package openclosed.creditcards

import openclosed.creditcards.cards.AmericanExpress
import openclosed.creditcards.cards.MasterCard
import openclosed.creditcards.cards.Visa
import openclosed.creditcards.interfaces.TarifaProcesamiento

class ProcesadorPagos(private val tarifaProcesamiento: TarifaProcesamiento) {

    fun procesarPagos(monto: Double) {
        val tarifa = tarifaProcesamiento.calcularTarifa(monto)
        val montoTotal = tarifa + monto
        println("Procesando pago. Monto total: $montoTotal")
    }
}

fun main() {
    //Ejemplo con tarjeta Visa
    val visa = Visa()
    val procesadorVisa = ProcesadorPagos(visa)
    procesadorVisa.procesarPagos(5000.0)

    //Ejemplo con tarjeta Mastercard
    val masterCard = MasterCard()
    val procesadorMasterCard = ProcesadorPagos(masterCard)
    procesadorMasterCard.procesarPagos(5000.0)

    //Ejemplo con tarjeta American Express
    val americanExpress = AmericanExpress()
    val procesadorAmerican = ProcesadorPagos(americanExpress)
    procesadorAmerican.procesarPagos(5000.0)
}