package note.menu

import archive.ArchiveDto
import note.model.NoteDto

class CreateNoteMenu(private val archive: ArchiveDto) {
    fun show() {
        println("Создание заметки:")
        print("Введите заголовок: ")
        val title = readLine() ?: ""
        print("Введите текст заметки: ")
        val content = readLine() ?: ""

        archive.notes.add(NoteDto(title, content))

        println("Заметка создана! Нажмите любую клавишу для продолжения.")
        readLine()
    }
}