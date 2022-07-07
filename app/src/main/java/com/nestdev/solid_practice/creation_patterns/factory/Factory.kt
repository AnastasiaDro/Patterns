package com.nestdev.solid_practice.creation_patterns.factory


enum class ParamType {
    CAPPUCCINO,
    LATTE,
    RAF,
    AMERICANO,
    ESPRESSO
}

data class Coffee(val name: String)

/**
 * Just delegation of the creation instances of another objects (classes)
 */

class Factory {
   fun createCofee(type: ParamType) {

       val coffee = when (type) {
           ParamType.CAPPUCCINO -> Coffee("Cappuccino")
           ParamType.LATTE -> Coffee("Latte")
           ParamType.RAF -> Coffee("Raf");
           ParamType.AMERICANO -> Coffee("Americano")
           ParamType.ESPRESSO -> Coffee("Espresso")
       }
       println("coffee ${coffee.name} has been created")
   }
}

fun main() {
    val factory = Factory()
    println("${factory.createCofee(ParamType.RAF)}")
    println("${factory.createCofee(ParamType.CAPPUCCINO)}")
}
