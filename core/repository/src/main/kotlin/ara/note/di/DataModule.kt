package ara.note.di

import ara.note.data.localdatasource.NoteDao
import ara.note.data.localdatasource.NotebookDao
import ara.note.data.model.NoteModel
import ara.note.data.model.NotebookModel
import ara.note.data.repository.NoteRepositoryImpl
import ara.note.data.repository.NotebookRepositoryImpl
import ara.note.data.util.NoteDomainMapper
import ara.note.data.util.NotebookDomainMapper
import ara.note.domain.entity.Note
import ara.note.domain.entity.Notebook
import ara.note.domain.repository.NoteRepository
import ara.note.domain.repository.NotebookRepository
import ara.note.domain.util.Mapper
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DataModule {

    @Singleton
    @Provides
    fun provideNoteRepository(
        noteDao: NoteDao,
        noteDomainMapper: Mapper<NoteModel, Note>,
    ): NoteRepository = NoteRepositoryImpl(
        noteDao = noteDao,
        noteDomainMapper = noteDomainMapper,
    )

    @Singleton
    @Provides
    fun provideNotebookRepository(
        notebookDao: NotebookDao,
        notebookDomainMapper: Mapper<NotebookModel, Notebook>,
    ): NotebookRepository = NotebookRepositoryImpl(
        notebookDao = notebookDao,
        notebookDomainMapper = notebookDomainMapper,
    )

    @Singleton
    @Provides
    fun provideNoteDomainMapper(): Mapper<NoteModel, Note> = NoteDomainMapper()

    @Singleton
    @Provides
    fun provideNotebookDomainMapper(): Mapper<NotebookModel, Notebook> = NotebookDomainMapper()
}