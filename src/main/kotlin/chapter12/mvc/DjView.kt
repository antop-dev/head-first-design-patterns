package chapter12.mvc

import java.awt.Dimension
import java.awt.GridLayout
import java.awt.event.ActionEvent
import java.awt.event.ActionListener
import java.awt.event.WindowAdapter
import java.awt.event.WindowEvent
import javax.swing.*
import kotlin.system.exitProcess


class DjView(
    private val controller: ControllerInterface,
    private val model: BeatModelInterface
) : ActionListener, BeatObserver, BpmObserver {
    init {
        model.registerObserver(this as BeatObserver)
        model.registerObserver(this as BpmObserver)
        UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel")
        JFrame.setDefaultLookAndFeelDecorated(true)
    }

    /*
     * View & Control
     */

    private lateinit var beatBar: BeatBar
    private lateinit var bpmTextField: JSpinner
    private lateinit var setBpmButton: JButton
    private lateinit var increaseBpmButton: JButton
    private lateinit var decreaseBpmButton: JButton
    private lateinit var startMenuItem: JMenuItem
    private lateinit var stopMenuItem: JMenuItem

    fun createView() {
        JDialog().apply {
            jMenuBar = JMenuBar().apply {
                val menu = JMenu("DJ Control").apply menu@{
                    startMenuItem = JMenuItem("Start").apply { addActionListener { controller.start() } }
                    stopMenuItem = JMenuItem("Stop").apply { addActionListener { controller.stop() } }
                    val exitMenuItem = JMenuItem("Exit").apply { addActionListener { exitProcess(0) } }
                    add(startMenuItem)
                    add(stopMenuItem)
                    add(exitMenuItem)
                }
                add(menu)
            }


            val viewPanel = JPanel().apply {
                beatBar = BeatBar()
                add(beatBar)
            }

            val controlPanel = JPanel(GridLayout(3, 1)).apply {

                val enterPanel = JPanel(GridLayout(1, 2)).apply {
                    val bpmLabel = JLabel("Enter BPM:", SwingConstants.RIGHT).apply {
                        border = BorderFactory.createEmptyBorder(5, 5, 5, 5)
                    }

                    bpmTextField = JSpinner(SpinnerNumberModel(90, 0, 200, 1))
                    add(bpmLabel)
                    add(bpmTextField)
                }

                setBpmButton = JButton("Set").apply {
                    size = Dimension(10, 40)
                    addActionListener(this@DjView)
                }

                val buttonPanel = JPanel(GridLayout(1, 2)).apply {
                    increaseBpmButton = JButton(">>").apply { addActionListener(this@DjView) }
                    decreaseBpmButton = JButton("<<").apply { addActionListener(this@DjView) }
                    add(decreaseBpmButton)
                    add(increaseBpmButton)
                }

                add(enterPanel)
                add(setBpmButton)
                add(buttonPanel)
            }

            val mainPanel = JPanel().apply {
                layout = BoxLayout(this, BoxLayout.Y_AXIS)
                add(viewPanel)
                add(controlPanel)
            }

            title = "View"
            isResizable = false
            defaultCloseOperation = JDialog.DISPOSE_ON_CLOSE
            rootPane.defaultButton = setBpmButton
            contentPane.add(mainPanel)
            addWindowListener(object : WindowAdapter() {
                override fun windowClosed(e: WindowEvent?) {
                    exitProcess(0)
                }
            })
            pack()
            isVisible = true
        }
    }

    override fun updateBeat() {
        beatBar.value = 100
    }

    override fun updateBpm() {
        val bpm = model.bpm
        if (bpm == 0) {
            beatBar.text = "Offline"
        } else {
            beatBar.text = "BPM: $bpm"
        }

        bpmTextField.value = bpm
    }

    fun enableStopMenuItem() {
        stopMenuItem.isEnabled = true
    }

    fun disableStopMenuItem() {
        stopMenuItem.isEnabled = false
    }

    fun enableStartMenuItem() {
        startMenuItem.isEnabled = true
    }

    fun disableStartMenuItem() {
        startMenuItem.isEnabled = false
    }

    override fun actionPerformed(e: ActionEvent) {
        when (e.source) {
            setBpmButton -> {
                val bpm = bpmTextField.value as Number
                controller.setBpm(bpm.toInt())
            }

            increaseBpmButton -> controller.increaseBpm()
            decreaseBpmButton -> controller.decreaseBpm()
        }
    }

}
