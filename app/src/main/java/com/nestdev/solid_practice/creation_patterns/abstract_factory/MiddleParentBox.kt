package com.nestdev.solid_practice.creation_patterns.abstract_factory

/**
 * A big box in which we can store small boxes (ChildBox)
 */
class MiddleParentBox: AbstractParentBox() {
    override val TAG = "MiddleParentBox"
    override val size = 1
    override var numOfBoxes = 0
}

