package data.models;

import lombok.Data;

import java.time.LocalDate;

@Data
public class File {
    private String fileName;
    private String password;
    private boolean isLocked = true;
    private LocalDate dateOfCreation;
}
