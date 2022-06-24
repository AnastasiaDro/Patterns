package com.nestdev.solid_practice.creation_patterns

import com.nestdev.solid_practice.creation_patterns.abstract_factory.AbstractChildBox
import com.nestdev.solid_practice.creation_patterns.abstract_factory.AbstractParentBox


/**
 *  EN: Provides a way to encapsulate a group of individual factories that have a common theme without specifying their concrete classes
 *
 *  RU: Предоставляет интерфейс для создания семейств взаимосвязанных или взаимозависимых объектов,
 *  не специфицируя их конкретных классов. Шаблон реализуется созданием абстрактного класса Factory, который представляет собой интерфейс
 *  для создания компонентов системы (например, для оконного интерфейса он может создавать окна и кнопки). Затем пишутся классы,
 *  реализующие этот интерфейс[2].
 *
 *  @author Anastasia Drogunova
 */


/**
 * Creation two types of boxes
 *
 * ParentBox - a big container in which
 * we can store a small boxes called "childBox"
 */
interface AbstractBoxesFactory {
    fun createParentBox(box: AbstractParentBox) : AbstractParentBox

    fun createChildBox(box: AbstractChildBox) : AbstractChildBox
}
