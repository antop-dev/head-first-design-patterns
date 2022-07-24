package chapter11.virtualproxy

import java.awt.Component
import java.awt.Graphics
import java.net.URL
import javax.swing.Icon
import javax.swing.ImageIcon

class ImageProxy(val imageUrl: URL) : Icon {
    @Volatile
    var imageIcon: ImageIcon? = null
        @Synchronized set

    val loaded: State
    var state: State

    init {
        loaded = ImageLoaded(this)
        state = ImageNotLoaded(this)
    }

    override fun paintIcon(c: Component, g: Graphics, x: Int, y: Int) {
        state.paintIcon(c, g, x, y)
    }

    override fun getIconWidth(): Int {
        return state.iconWidth
    }

    override fun getIconHeight(): Int {
        return state.iconHeight
    }

}
