package org.noteapp.noteapllication.data.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;


@Data
@Document("file")
public class File {
    @Id
    private String fileName;
    private String password;
    private boolean isLocked = true;
    private LocalDate dateOfCreation = LocalDate.now();
}
