package archive.menu

import archive.ArchiveDto
import note.model.NoteManager

class CreateArchiveMenu(private val noteManager: NoteManager) {
    fun show() {
        println("Создание архива:")
        print("Введите название архива: ")
        val name = readLine() ?: ""
        noteManager.addArchive(ArchiveDto(name))
        println("Архив создан. Нажмите любую клавишу для продолжения.")
        readLine()
    }
}