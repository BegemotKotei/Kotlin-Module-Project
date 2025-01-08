package note.model

import archive.ArchiveDto

class NoteManager {
    val archives = mutableListOf<ArchiveDto>()

    fun addArchive(archive: ArchiveDto) {
        archives.add(archive)
    }
}