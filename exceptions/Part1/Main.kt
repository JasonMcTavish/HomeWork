package exceptions.Part1

fun main() {
    val wheel = Wheel(2.0)
    val wheel2 = Wheel(-8.5)
    wheel.getPressureInWheel()
    val item = runCatching { wheel.pumpUpTheWheel(10.0) }
    println(item.exceptionOrNull())
    val item2 = runCatching { wheel2.getPressureInWheel() }
    println(item2.exceptionOrNull())

}

class TooHighPressure : Throwable(message = "Pressure is too high")
class TooLowPressure : Throwable(message = "Pressure is too low")
class IncorrectPressure : Throwable(message = "Pressure is not in normal range")


class Wheel(private var pressure: Double) {
    fun pumpUpTheWheel(pressure: Double) {
        when (pressure) {
            in (-9999999.0)..(0.0) -> throw IncorrectPressure()
            in 0.0..10.0 -> {
                if (pressure < 1.6) throw TooLowPressure()
                if (pressure > 2.5) throw TooHighPressure()
                if (pressure in 1.6..2.5) this.pressure = pressure
            }
            in 10.1..99999999.0 -> throw IncorrectPressure()
        }
    }

    fun getPressureInWheel() {
        when (pressure) {
            in (-9999999.0)..(0.0) -> throw IncorrectPressure()
            in 0.0..10.0 -> {
                if (pressure < 1.6) throw TooLowPressure()
                if (pressure > 2.5) throw TooHighPressure()
                if (pressure in 1.6..2.5) println("Pressure of wheel is $pressure")
            }
            in 10.1..99999999.0 -> throw IncorrectPressure()
        }

    }
}
