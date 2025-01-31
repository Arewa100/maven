package org.noteapp.noteapllication.data.repositories;

import org.noteapp.noteapllication.data.models.Note;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NoteRepository extends MongoRepository<Note, String> {
}
