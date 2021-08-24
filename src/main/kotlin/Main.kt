fun main(args: Array<String>) {
    // an object instance of class car
    val C1= Car()
    // the cars properties a]with values assigned
    C1.brand = "Ford"
    C1.capacity = 4
    C1.model = "Mustang"
    C1.year = 1998

    println("Car brand=" +C1.brand)
    println("Car Capacity="+C1.capacity)
    println("Car Model="+C1.model)
    println("Car Year="+C1.year)
    C1.drive()
    C1.speed(200)

}