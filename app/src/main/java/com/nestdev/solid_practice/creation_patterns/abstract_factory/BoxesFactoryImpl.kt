package com.nestdev.solid_practice.creation_patterns.abstract_factory

import com.nestdev.solid_practice.creation_patterns.AbstractBoxesFactory

class BoxesFactoryImpl : AbstractBoxesFactory {

    override fun createChildBox(box: AbstractChildBox): AbstractChildBox {
        return box
    }

    override fun createParentBox(box: AbstractParentBox) : AbstractParentBox {
        return box
    }
}
