package com.nestdev.solid_practice.creation_patterns.abstract_factory

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.nestdev.solid_practice.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("--------------------START BOX--------------------")
        val factory = BoxesFactoryImpl()
        val truck1 = Truck(factory)

        //положим 3 больших коробки и 2 средних
        truck1.addParentBoxes(2, factory.createParentBox(MiddleParentBox()))
        truck1.addParentBoxes(1, factory.createParentBox(BigParentBox()))

        truck1.addChildBoxes(factory.createChildBox(StrawberryBox()))
        truck1.addChildBoxes(factory.createChildBox(ChildOrangeBox()))

    }
}
