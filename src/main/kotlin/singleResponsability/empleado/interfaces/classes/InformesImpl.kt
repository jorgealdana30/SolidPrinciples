package singleResponsability.empleado.interfaces.classes

import singleResponsability.empleado.interfaces.Informes

class InformesImpl: Informes {

    override fun informeSueldoEmpleado(empleado: Empleado) {
        println("El sueldo del empleado es: ${empleado.sueldo}")
    }
}