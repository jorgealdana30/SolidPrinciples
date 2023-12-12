package openclosed.vehicles.interfaces

interface Vehicle {
    fun draw()
    fun startEngine()
    fun stopEngine()
    fun parkingVehicle()
    fun reFuel()
    fun isVehicleReadyToMaintain()
    fun lightsOn()
    fun lightsOff()
    fun drive()
}