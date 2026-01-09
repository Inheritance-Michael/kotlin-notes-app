package com.notes.model
import java.time.Instant
data class Note(val id: String, val title: String, val content: String, val priority: Priority = Priority.MEDIUM, val createdAt: Instant = Instant.now())
