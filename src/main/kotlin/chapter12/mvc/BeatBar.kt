package chapter12.mvc

import java.awt.BorderLayout
import javax.swing.JLabel
import javax.swing.JProgressBar
import javax.swing.border.EmptyBorder
import kotlin.concurrent.thread

class BeatBar : JProgressBar(0, 100) {
    private val progressLabel: JLabel = JLabel("offline").apply {
        horizontalAlignment = JLabel.CENTER
        verticalAlignment = JLabel.CENTER
        border = EmptyBorder(5, 5, 5, 5)
    }

    var text: String
        get() = progressLabel.text
        set(value) {
            progressLabel.text = value
        }

    init {
        value = 0
        layout = BorderLayout(5, 5)
        add(progressLabel)

        // 값이 100이 됐을 떄 75로 만들어줌으로써 비트가 치는 것 처럼 보이게 한다.
        thread {
            while (true) {
                if (value == 100) {
                    Thread.sleep(20)
                    val v = (value.toDouble() * 0.75).toInt()
                    value = v
                    repaint()
                }
                Thread.sleep(30)
            }
        }
    }
}
