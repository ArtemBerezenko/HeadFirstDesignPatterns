package patterns.proxy

import java.awt.event.ActionEvent
import java.awt.event.ActionListener
import java.net.MalformedURLException
import java.net.URL
import java.util.*
import javax.swing.JFrame
import javax.swing.JMenu
import javax.swing.JMenuBar
import javax.swing.JMenuItem

class ImageProxyTestDrive {
    var imageComponent: ImageComponent? = null
    private val frame = JFrame("CD Cover Viewer")
    private val initialURL: URL
    private val menuBar: JMenuBar = JMenuBar()
    val menu: JMenu = JMenu("Favorite CDs")
    private val cds = Hashtable<String, String>()

    init {
        cds["Ambient"] = "http://images.amazon.com/images/P/B000003S2K.01.LZZZZZZZ.jpg"
        cds["Buddha Bar"] = "http://images.amazon.com/images/P/B00009XBYK.01.LZZZZZZZ.jpg"
        initialURL = URL(cds["Buddha Bar"])
        menuBar.add(menu)
        frame.jMenuBar = menuBar

        cds.keys.forEach {  name ->
            val menuItem = JMenuItem(name)
            menu.add(menuItem)
            menuItem.addActionListener(ActionListener { event: ActionEvent? ->
                imageComponent?.icon = ImageProxy(getCDUrl(event?.actionCommand!!))
            })
        }

        val icon = ImageProxy(initialURL)
        imageComponent = ImageComponent(icon)
        with(frame) {
            contentPane.add(imageComponent)
            defaultCloseOperation = JFrame.EXIT_ON_CLOSE
            setSize(800, 600)
            isVisible = true
        }
    }

    private fun getCDUrl(name: String): URL? = try {
        URL(cds[name])
    } catch (e: MalformedURLException) {
        e.printStackTrace()
        null
    }

}

fun main() {
    val testDrive = ImageProxyTestDrive()
}