package com.nestdev.solid_practice.creation_patterns.abstract_factory

class BigParentBox: AbstractParentBox() {
    override val TAG = "ParentBigBox"
    override val size = 2
    override var numOfBoxes = 0
}
