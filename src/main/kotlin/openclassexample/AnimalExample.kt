package openclassexample

open class Animal {
    open fun hacerSonido() {
        println("Haciendo algú sonido")
    }
}

class Perro : Animal() {
    override fun hacerSonido() {
        println("wuau wuau...")
    }
}

class Gato : Animal() {
    override fun hacerSonido() {
        println("miau miau...")
    }
}

fun main() {
    val perro = Perro()
    val gato = Gato()

    perro.hacerSonido()
    gato.hacerSonido()
}