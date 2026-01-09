package com.notes.repository
import com.notes.model.Note
interface NoteRepository { suspend fun save(n: Note): Note; suspend fun findAll(): List<Note> }
