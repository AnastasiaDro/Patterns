package com.nestdev.solid_practice.structure_patterns.adapter


fun main() {
    println("Let's take data from imagined internet library")
    val adapter = Adapter()

    for (i in 0..10) {
        println("result $i: ${adapter.getData()}")
    }

}