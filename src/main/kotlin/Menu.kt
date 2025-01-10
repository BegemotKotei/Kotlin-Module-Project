import archive.menu.ArchiveMenu
import archive.menu.CreateArchiveMenu
import note.model.NoteManager

class Menu(private val noteManager: NoteManager) {
    fun show() {
        while (true) {
            println("Главное меню:")
            println("1. Выбор архива")
            println("2. Создание архива")
            println("0. Выход")

            when (readLine()) {
                "1" -> {
                    val archiveMenu = ArchiveMenu(noteManager)
                    archiveMenu.show()
                }

                "2" -> {
                    val createArchiveMenu = CreateArchiveMenu(noteManager)
                    createArchiveMenu.show()
                }

                "0" -> return
                else -> println("Неверный выбор. Попробуйте снова.")
            }
        }
    }
}