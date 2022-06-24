package com.nestdev.solid_practice.creation_patterns.abstract_factory

import android.util.Log

/**
 * A small box  which we can put to the big boxes (ParentBox)
 */
abstract class AbstractChildBox {
    abstract val placeSize: Int
    abstract val TAG: String
    fun takePlaceInParentBox(parentBox: AbstractParentBox) {
        Log.d(TAG, "Added to the ParentBox ${parentBox.TAG}")
        parentBox.increaseNumOfBoxesInside(placeSize)
    }
}
