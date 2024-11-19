package dto;

import lombok.Data;

@Data
public class FileRequest {
    private String fileName;
    private String password;
}