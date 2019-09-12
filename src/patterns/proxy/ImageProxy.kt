package patterns.proxy

import java.awt.Component
import java.awt.Graphics
import java.lang.Exception
import java.net.URL
import javax.swing.Icon
import javax.swing.ImageIcon

class ImageProxy(private val imageUrl: URL?): Icon {
    var imageIcon: ImageIcon? = null
    lateinit var retrievalThread: Thread
    var retrieving = false

    override fun getIconHeight(): Int = if (imageIcon != null) imageIcon?.iconWidth!! else 800

    override fun getIconWidth(): Int = if (imageIcon != null) imageIcon?.iconHeight!! else 600

    override fun paintIcon(c: Component?, g: Graphics?, x: Int, y: Int) {
        if (imageIcon != null) {
            imageIcon?.paintIcon(c, g, x, y)
        } else {
            g?.drawString("Loading CD cover, please wait...", x + 300, y + 190)
            if (!retrieving) {
                retrieving = true
                retrievalThread = Thread(Runnable {
                    try {
                        imageIcon = ImageIcon(imageUrl, "CD Cover")
                        c?.repaint()
                    } catch (e: Exception) {
                        e.printStackTrace()
                    }
                })
                retrievalThread.start()
            }
        }
    }
}