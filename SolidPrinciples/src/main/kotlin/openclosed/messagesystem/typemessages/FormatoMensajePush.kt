package openclosed.messagesystem.typemessages

import openclosed.messagesystem.interfaces.FormatoMensaje

class FormatoMensajePush : FormatoMensaje {
    override fun formatearMensaje(contenido: String): String {
        return "PUSH: $contenido"
    }
}