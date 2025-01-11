package note.menu

import note.model.NoteDto

class NoteDisplayMenu(private val note: NoteDto) {
    fun show() {
        println("Заметка: ${note.title}")
        println(note.content)
        println("Нажмите любую клавишу для возвращения.")
        readLine()
    }
}