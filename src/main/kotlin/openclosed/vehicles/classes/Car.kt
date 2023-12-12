package openclosed.vehicles.classes

import openclosed.vehicles.interfaces.Vehicle
import java.lang.Math.random
import kotlin.math.truncate

class Car : Vehicle {

    override fun draw() {

    }

    override fun startEngine() {
        println("Motor encendido")
    }

    override fun stopEngine() {
        TODO("Not yet implemented")
    }

    override fun parkingVehicle() {
        TODO("Not yet implemented")
    }

    override fun reFuel() {
        TODO("Not yet implemented")
    }

    override fun isVehicleReadyToMaintain() {
        TODO("Not yet implemented")
    }

    override fun lightsOn() {
        println("luces encendidas...")
    }

    override fun lightsOff() {
        TODO("Not yet implemented")
    }

    override fun drive() {
        println("Vehiculo en movimiento a velocidad de: ${(truncate(random() * 100))} Km/H")
    }
}