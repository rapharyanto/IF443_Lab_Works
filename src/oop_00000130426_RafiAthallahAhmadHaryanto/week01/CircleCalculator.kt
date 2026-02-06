package oop_00000130426_RafiAthallahAhmadHaryanto.week01

fun main(args: Array<String>) {
    //variable definition
    var radius = 7.0
    val pi = 3.14

    // Calculation
    var area = pi * radius * radius

    //Output Concatenation
    println("Radius: $radius, Area: $area")

    checkSize (area)
}

fun checkSize (area: Double) {
    if(area > 100) {
        println("This is a Big Circle")
    }else{
        println("This is a Small Circle")
    }
}