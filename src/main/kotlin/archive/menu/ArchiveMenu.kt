package archive.menu

import note.menu.NoteMenu
import note.model.NoteManager

class ArchiveMenu(private val noteManager: NoteManager) {
    fun show() {
        while (true) {
            println("Выбор архива:")
            if (noteManager.archives.isEmpty()) {
                println("Нет доступных архивов.")
            } else {
                noteManager.archives.forEachIndexed { index, archive ->
                    println("${index + 1}. ${archive.title}")
                }
            }
            println("0. Назад.")

            when (readLine()) {
                "0" -> return
                else -> {
                    val index = readLine()?.toIntOrNull()
                    if (index != null && index in 1..noteManager.archives.size) {
                        val noteMenu = NoteMenu(noteManager.archives[index - 1])
                        noteMenu.show()
                    } else {
                        println("Некорректный выбор. Пробуйте снова.")
                    }
                }
            }
        }
    }
}