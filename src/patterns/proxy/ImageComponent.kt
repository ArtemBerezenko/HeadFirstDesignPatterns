package patterns.proxy

import java.awt.Graphics
import javax.swing.Icon
import javax.swing.JComponent

class ImageComponent(var icon: Icon) : JComponent() {
    override fun paintComponent(g: Graphics) {
        super.paintComponent(g)
        val w = icon.iconWidth
        val h = icon.iconHeight
        val x = (800 - w)/2
        val y = (800 - h)/2
        icon.paintIcon(this, g, x, y)
    }
}