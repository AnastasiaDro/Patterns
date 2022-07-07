package com.nestdev.solid_practice.structure_patterns.adapter

import kotlin.random.Random

class Adapter: ClientInterface {
    private val dbProvider = DbDataProvider("My database", 0)
    private val inetDataProvider = InetDataProvider()

    override fun getData(): String {
        val random: List<Int> = List(1) { Random.nextInt(0, 2) }
        val generated = random[0]


        val result = when (generated) {
                0 -> dbProvider.getDataFromCursor()
                1 -> inetDataProvider.getData()
                else -> "String is empty"
        }
        return result
    }


}