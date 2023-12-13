package singleResponsability.empleado.interfaces.classes

fun main() {
    val empleado = Empleado("Jorge", 20000, "Ing")
    val informes = InformesImpl()

    informes.informeSueldoEmpleado(empleado)
}