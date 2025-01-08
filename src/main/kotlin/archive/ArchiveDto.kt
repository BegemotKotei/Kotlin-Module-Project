package archive

import note.model.NoteDto

class ArchiveDto(val title: String) {
    val notes = mutableListOf<NoteDto>()
}