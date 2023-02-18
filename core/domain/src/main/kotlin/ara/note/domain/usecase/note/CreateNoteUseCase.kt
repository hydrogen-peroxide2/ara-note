package ara.note.domain.usecase.note

import ara.note.domain.entity.Note
import ara.note.domain.repository.NoteRepository
import ara.note.util.Result
import javax.inject.Inject

class CreateNoteUseCase @Inject constructor(
    private val noteRepository: NoteRepository,
) {
    suspend operator fun invoke(note: Note) =
        noteRepository.insert(note) is Result.Success
}
