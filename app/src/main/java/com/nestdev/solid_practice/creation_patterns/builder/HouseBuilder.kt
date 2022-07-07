package com.nestdev.solid_practice.creation_patterns.builder

class HouseBuilder: Builder {

    val house = House()

    override fun buildWalls() {
        house.walls = 4
    }

    override fun buildDoors() {
        house.doors = 2
    }

    override fun buildWindows() {
        house.windows = 5
    }

    override fun buildRoof() {
        house.roof = Materials.WOOD
    }

    override fun buildGarage() {
        house.garage = Materials.PANEL
    }

    override fun buildGason() {
        house.gasonSize = 5
    }

    fun getResult() : House {
        println("You just have built a house!")
        println(("""
                |walls: ${house.walls}
                |doors: ${house.doors}
                |windows: ${house.windows}
                |roof: ${house.roof}
                |garage: ${house.garage}
                |gason size: ${house.gasonSize}
                """).trimMargin())
        return house
    }
}
