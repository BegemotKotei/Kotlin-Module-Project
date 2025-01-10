package note.menu

import archive.ArchiveDto

class NoteMenu(private val archive: ArchiveDto) {
    fun show() {
        while (true) {
            println("Заметки в архиве '${archive.title}':")
            if (archive.notes.isEmpty()) {
                println("Нет доступных заметок.")
            } else {
                archive.notes.forEachIndexed { index, note ->
                    println("${index + 1}. ${note.title}")
                }
            }
            println("2. Создать заметку.")
            println("0. Назад.")


            when (val userInput = readLine()) {
                "2" -> {
                    val createNoteMenu = CreateNoteMenu(archive)
                    createNoteMenu.show()
                }

                "0" -> return

                else -> {
                    val index = userInput?.toIntOrNull()
                    if (index != null && index in 1..archive.notes.size) {
                        val noteDisplayMenu = NoteDisplayMenu(archive.notes[index - 1])
                        noteDisplayMenu.show()
                    } else {
                        println("Неверный выбор. Попробуйте снова.")
                    }
                }
            }
        }
    }
}