package com.nestdev.solid_practice.creation_patterns.builder

class Director {
    fun buildSomething(builder: Builder) {
        builder.buildWalls()
        builder.buildWindows()
        builder.buildRoof()
        builder.buildDoors()
        builder.buildGason()
        builder.buildGarage()
    }
}