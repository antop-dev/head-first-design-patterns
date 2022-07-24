package chapter11.virtualproxy

import java.awt.Component
import java.awt.Graphics

interface State {

    val iconWidth: Int
    val iconHeight: Int
    fun paintIcon(c: Component, g: Graphics, x: Int, y: Int)

}
