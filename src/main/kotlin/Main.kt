import note.model.NoteManager

fun main() {
    val noteManager = NoteManager()
    val mainMenu = Menu(noteManager)
    mainMenu.show()
}