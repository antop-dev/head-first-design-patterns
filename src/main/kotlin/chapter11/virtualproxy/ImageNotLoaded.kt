package chapter11.virtualproxy

import java.awt.Component
import java.awt.Graphics
import javax.swing.ImageIcon
import kotlin.concurrent.thread

class ImageNotLoaded(private val proxy: ImageProxy) : State {

    override val iconWidth: Int
        get() = 800

    override val iconHeight: Int
        get() = 600

    private var retrieving = false

    override fun paintIcon(c: Component, g: Graphics, x: Int, y: Int) {
        g.drawString("앨범 커버를 불러오는 중입니다. 잠시만 기다려주세요.", x + 300, y + 190)
        if (!retrieving) {
            retrieving = true
            thread {
                Thread.sleep(2000)
                proxy.imageIcon = ImageIcon(proxy.imageUrl, "Album Cover")
                proxy.state = proxy.loaded
                c.repaint()
            }
        }
    }

}
