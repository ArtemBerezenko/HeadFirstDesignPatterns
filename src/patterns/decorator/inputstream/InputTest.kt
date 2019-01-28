package patterns.decorator.inputstream

import java.io.BufferedInputStream
import java.io.FileInputStream
import java.io.IOException
import java.io.InputStream

fun main() {
    var c: Int = 0
    try {
        val `in`: InputStream = LowerCaseInputStream(BufferedInputStream(
                FileInputStream("C:\\Users\\Home\\IdeaProjects\\Head First Design Patterns\\src\\resources\\test")))
        while (c >= 0) {
            print(c.toChar())
            c = `in`.read()
        }
        `in`.close()
    } catch (e : IOException) {
        e.printStackTrace()
    }
}