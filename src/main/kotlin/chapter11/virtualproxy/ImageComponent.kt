package chapter11.virtualproxy

import java.awt.Graphics
import java.net.URL
import javax.swing.*

class ImageComponent(var icon: Icon) : JComponent() {

    public override fun paintComponent(g: Graphics) {
        super.paintComponent(g)
        val w = icon.iconWidth
        val h = icon.iconHeight
        val x = (800 - w) / 2
        val y = (600 - h) / 2
        icon.paintIcon(this, g, x, y)
    }

}

fun main() {
    val albums = mapOf(
        "Buddha Bar" to "http://images.amazon.com/images/P/B00009XBYK.01.LZZZZZZZ.jpg",
        "Ima" to "http://images.amazon.com/images/P/B000005IRM.01.LZZZZZZZ.jpg",
        "Karma" to "http://images.amazon.com/images/P/B000005DCB.01.LZZZZZZZ.gif",
        "MCMXC a.D." to "http://images.amazon.com/images/P/B000002URV.01.LZZZZZZZ.jpg",
        "Northern Exposure" to "http://images.amazon.com/images/P/B000003SFN.01.LZZZZZZZ.jpg",
        "Selected Ambient Works, Vol. 2" to "http://images.amazon.com/images/P/B000002MNZ.01.LZZZZZZZ.jpg"
    )

    val initialURL = URL(albums["Selected Ambient Works, Vol. 2"])
    val imageComponent = ImageComponent(ImageProxy(initialURL))

    JFrame("Album Cover Viewer").apply frame@{
        jMenuBar = JMenuBar().apply {
            val menu = JMenu("Favorite Albums").apply {
                albums.forEach { (name, url) ->
                    val menuItem = JMenuItem(name).apply {
                        addActionListener {
                            imageComponent.icon = ImageProxy(URL(url))
                            this@frame.repaint()
                        }
                    }
                    add(menuItem)
                }
            }
            add(menu)
        }

        contentPane.add(imageComponent)
        defaultCloseOperation = JFrame.EXIT_ON_CLOSE
        setSize(800, 650)
        isVisible = true
    }
}
