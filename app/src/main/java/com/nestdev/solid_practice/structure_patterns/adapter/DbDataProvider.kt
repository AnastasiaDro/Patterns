package com.nestdev.solid_practice.structure_patterns.adapter

data class DbDataProvider (val databaseName: String, val id: Int) {
    val dataArray = listOf<String>("from db1", "from db2", "from db3")
    fun getDataFromCursor() : String = dataArray[id]
}
