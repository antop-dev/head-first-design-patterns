package chapter08

import java.awt.Graphics
import javax.swing.JFrame // JFrom.update() 메소드는 템플릿 메소드

class MyFrame(title: String) : JFrame(title) {

    init {
        defaultCloseOperation = EXIT_ON_CLOSE
        setSize(300, 300)
        isVisible = true
    }

    // 후크
    override fun paint(g: Graphics?) {
        super.paint(g)
        graphics?.drawString("내가 최고!!", 100, 100)
    }

}

fun main() {
    MyFrame("Head First Design Patterns")
}
