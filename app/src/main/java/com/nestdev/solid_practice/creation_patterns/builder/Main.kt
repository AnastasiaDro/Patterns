package com.nestdev.solid_practice.creation_patterns.builder

fun main() {
    val director = Director()

    val designProjectBuilder = DesignProjectBuilder()
    val houseBuilder = HouseBuilder()
    director.buildSomething(designProjectBuilder)
    director.buildSomething(houseBuilder)

    val designProject = designProjectBuilder.getResult()
    val house = houseBuilder.getResult()

}