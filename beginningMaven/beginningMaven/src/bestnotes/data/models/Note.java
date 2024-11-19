package data.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Document
public class Note {
    private String title;
    private String body;
    private String fileName;
    @Id
    private long noteId;
    private LocalDate creationDate;
}
