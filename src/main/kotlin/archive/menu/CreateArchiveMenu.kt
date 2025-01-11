package archive.menu

import archive.ArchiveDto
import note.model.NoteManager

class CreateArchiveMenu(private val noteManager: NoteManager) {

    fun show() {
        println("Создание архива:")
        print("Введите название архива: ")

        while (true) {
            val name = readLine() ?: ""
            if (name.isEmpty() || name.replace(" ", "").equals("")) {
                println(
                    "Название архива не может быть пустым. " +
                            "Попробуйте ввести название архива снова:"
                )
            } else {
                noteManager.addArchive(ArchiveDto(name))

                println("Архив создан. Нажмите любую клавишу для продолжения.")
                readLine()
                break;
            }
        }
    }
}