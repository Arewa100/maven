package data.models;

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
public class Note {
    private String title;
    private String body;
    private String fileName;
    private long noteId;
    private LocalDate creationDate;
}
