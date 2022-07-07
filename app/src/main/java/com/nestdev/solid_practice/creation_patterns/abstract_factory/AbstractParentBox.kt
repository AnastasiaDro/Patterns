package com.nestdev.solid_practice.creation_patterns.abstract_factory

import android.util.Log

abstract class AbstractParentBox {
    abstract val TAG: String

    abstract val size: Int
    abstract var numOfBoxes: Int

    private val parentBox = ArrayList<AbstractChildBox>()

    fun putChildBoxInside(childBox: AbstractChildBox) {
        if (size >= (numOfBoxes + childBox.placeSize)) {
            parentBox.add(childBox)
            childBox.takePlaceInParentBox(this)
            println("ParentBox is $TAG")
        } else {
            Log.d(TAG, "ParentBox is full!! size = $size Can't add new childBox ${childBox.TAG} with size ${childBox.placeSize} inside!")
            throw ArrayIndexOutOfBoundsException()
        }
    }

    fun increaseNumOfBoxesInside(newBoxesNum: Int) {
        numOfBoxes += newBoxesNum
    }
}
