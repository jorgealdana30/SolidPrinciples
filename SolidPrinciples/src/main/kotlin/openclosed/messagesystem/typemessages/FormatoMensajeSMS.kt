package openclosed.messagesystem.typemessages

import openclosed.messagesystem.interfaces.FormatoMensaje

class FormatoMensajeSMS : FormatoMensaje {

    override fun formatearMensaje(contenido: String): String {
        return "SMS: $contenido"
    }
}