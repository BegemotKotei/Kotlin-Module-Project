package note.model

import archive.ArchiveDto

class NoteManager {
    private val _archives = mutableListOf<ArchiveDto>()

    val archives: List<ArchiveDto> = _archives

    fun addArchive(archive: ArchiveDto) {
        _archives.add(archive)
    }
}