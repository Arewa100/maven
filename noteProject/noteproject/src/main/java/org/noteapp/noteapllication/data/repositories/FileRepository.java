package org.noteapp.noteapllication.data.repositories;

import org.noteapp.noteapllication.data.models.File;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileRepository extends MongoRepository<File, String> {
}
