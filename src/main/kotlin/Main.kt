fun main() {



    var car: Car = Car()

    car.start()


}

class Car {


    private val model: String? = null

    fun start() {
        println("Starting the $model")
    }
}

