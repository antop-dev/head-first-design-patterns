package chapter11.virtualproxy

import java.awt.Component
import java.awt.Graphics

class ImageLoaded(private val proxy: ImageProxy) : State {
    companion object {
        const val NOT_LOADED = "image not loaded."
    }

    override val iconWidth: Int
        get() {
            return proxy.imageIcon?.iconWidth ?: throw UnsupportedOperationException(NOT_LOADED)
        }

    override val iconHeight: Int
        get() = proxy.imageIcon?.iconHeight ?: throw UnsupportedOperationException(NOT_LOADED)

    override fun paintIcon(c: Component, g: Graphics, x: Int, y: Int) {
        proxy.imageIcon?.paintIcon(c, g, x, y) ?: throw UnsupportedOperationException(NOT_LOADED)
    }

}
