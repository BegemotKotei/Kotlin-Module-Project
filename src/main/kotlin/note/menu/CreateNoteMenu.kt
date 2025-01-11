package note.menu

import archive.ArchiveDto
import note.model.NoteDto

class CreateNoteMenu(private val archive: ArchiveDto) {
    fun show() {
        println("Создание заметки:")
        print("Введите заголовок: ")
        while (true) {
            val title = readLine() ?: ""
            if (title.isEmpty() || title.replace(" ", "").equals("")) {
                println(
                    "Название заметки не может быть пустым. " +
                            "Попробуйте ввести название заметки снова:"
                )
            } else {
                print("Введите текст заметки: ")
                while (true) {
                    val content = readLine() ?: ""
                    if (content.isEmpty() || content.replace(" ", "").equals("")) {
                        println(
                            "Заметка не может быть пустой. " +
                                    "Попробуйте ввести текст заметки снова:"
                        )
                    } else {
                        archive.notes.add(NoteDto(title, content))

                        println("Заметка создана! Нажмите любую клавишу для продолжения.")
                        readLine()
                        break
                    }
                }
                break
            }
        }
    }
}