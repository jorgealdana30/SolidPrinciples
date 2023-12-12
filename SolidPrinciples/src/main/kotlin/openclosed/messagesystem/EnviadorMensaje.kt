package openclosed.messagesystem

import openclosed.messagesystem.interfaces.FormatoMensaje
import openclosed.messagesystem.typemessages.FormatoMensajePush
import openclosed.messagesystem.typemessages.FormatoMensajeSMS

class EnviadorMensaje(private val formatoMensaje: FormatoMensaje) {

    fun enviarMensaje(mensaje: String, destinatario: String) {
        val mensajeFormateado = formatoMensaje.formatearMensaje(mensaje)
        println("Enviando mensaje a $destinatario mediante $mensajeFormateado")
    }
}

fun main() {
    val formatoSMS = FormatoMensajeSMS()
    val enviarMensaje = EnviadorMensaje(formatoSMS)
    enviarMensaje.enviarMensaje("Hola, como estás?", "Jorge")

    val formatoPush = FormatoMensajePush()
    val enviarMensajePush = EnviadorMensaje(formatoPush)
    enviarMensajePush.enviarMensaje("Espero te encuentres muy bien!", "Jorge")
}