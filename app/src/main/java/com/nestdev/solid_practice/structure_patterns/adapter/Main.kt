package com.nestdev.solid_practice.structure_patterns.adapter

//типа дома
class Client(private val myInterface: ClientInterface) {


    fun printProducedData() {
        for (i in 0..9)
            println(myInterface.getData())
    }
}

//типа репозитория
interface ClientInterface {
    fun getData(): String
}

fun main() {

    val client = Client(Adapter())
    println("Let's take data from imagined internet library")
     client.printProducedData()

}