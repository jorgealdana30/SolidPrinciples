package openclosed.creditcards.cards

import openclosed.creditcards.interfaces.TarifaProcesamiento

class MasterCard : TarifaProcesamiento {

    override fun calcularTarifa(tarifa: Double): Double {
        return tarifa * 0.02
    }
}