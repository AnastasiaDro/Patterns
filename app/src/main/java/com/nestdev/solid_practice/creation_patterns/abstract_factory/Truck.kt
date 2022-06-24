package com.nestdev.solid_practice.creation_patterns.abstract_factory

import android.util.Log
import com.nestdev.solid_practice.creation_patterns.AbstractBoxesFactory

class Truck (newFactory: AbstractBoxesFactory) {
    private val factory = newFactory
    private val truckBody = ArrayList<AbstractParentBox>()
    private val TAG = "Truck"

    fun addParentBoxes(num: Int, parentBox: AbstractParentBox) {
        for (i in 0..num) {
            truckBody.add(factory.createParentBox(parentBox))
        }
    }

    //Идея в том, чтобы перебирать большие коробки и класть в них в зависимости от того,
    //свободны ли они маленькие коробки
    fun addChildBoxes(box: AbstractChildBox) {
        var index = 0
        while (index < truckBody.size) {
            try {
                truckBody[index].putChildBoxInside(box)
                Log.d(TAG, "added into the box #${index}")
                return
            } catch (e: ArrayIndexOutOfBoundsException) {
                Log.d(TAG, "full box is #${index}")
                index++
            }
        }
    }
}
