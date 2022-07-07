package com.nestdev.solid_practice.creation_patterns.builder

class DesignProjectBuilder: Builder {

    var planBook = arrayListOf<String>()

    override fun buildWalls() {
        planBook.add("Build all walls")
    }

    override fun buildDoors() {
        planBook.add("Build all doors")
    }

    override fun buildWindows() {
        planBook.add("Build all windows")
    }

    override fun buildRoof() {
        planBook.add("Build roof")
    }

    override fun buildGarage() {
        planBook.add("Build garage")
    }

    override fun buildGason() {
        planBook.add("Build gason")
    }

    fun getResult() : ArrayList<String> {
        print("Design project is ")
        var i = 0
        for (items in planBook) {
            print(i++)
            println(items)
        }
       return planBook
    }
}