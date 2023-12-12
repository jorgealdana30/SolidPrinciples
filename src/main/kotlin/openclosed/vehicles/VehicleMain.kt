package openclosed.vehicles

import openclosed.vehicles.classes.Car
import openclosed.vehicles.classes.Taller
import openclosed.vehicles.classes.Truck

fun main() {
    val chevrolet = Car()
    val foton = Truck()
    val taller = Taller()

    chevrolet.lightsOn()
    chevrolet.startEngine()
    chevrolet.drive()

    taller.maintainVehicle(chevrolet)
    taller.maintainVehicle(foton)
}