package note.menu

import archive.ArchiveDto
import note.model.NoteDto

class CreateNoteMenu(private val archive: ArchiveDto) {
    fun show() {
        println("Создание заметки:")
        print("Введите заголовок: ")
        val title = readLine() ?: ""
        require(title.isNotEmpty()) { "Название заметки не может быть пустым." }
        print("Введите текст заметки: ")
        val content = readLine() ?: ""
        require(content.isNotEmpty()) { "Заметка не может быть пустой." }

        archive.notes.add(NoteDto(title, content))

        println("Заметка создана! Нажмите любую клавишу для продолжения.")
        readLine()
    }
}