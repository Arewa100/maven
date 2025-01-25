package org.noteapp.noteapllication.dtos;

import lombok.Data;
import org.springframework.cglib.core.Local;

import java.time.LocalDate;

@Data
public class CreateFileRequest {
    private String fileName;
    private String password;
    private boolean isLocked;
    private LocalDate dateOfCreation = LocalDate.now();
}
