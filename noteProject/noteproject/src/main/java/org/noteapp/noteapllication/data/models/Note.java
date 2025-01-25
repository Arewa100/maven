package org.noteapp.noteapllication.data.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@Document("note")
public class Note {
    @Id
    private String noteId;
    private String title;
    private String body;
    @DBRef
    private File fileName;
    private LocalDateTime creationDate = LocalDateTime.now();
}
