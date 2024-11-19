package services;

import dto.FileRequest;
import exceptions.FileExceptions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ServiceForFilesTest {
    private FileServices fileService;

    @BeforeEach
    public void seTup() {
        fileService = new ServiceForFiles();
    }

    @Test
    public void testThatFileServiceCanRegisterDiary() {
        FileRequest fileRequest = new FileRequest();
        fileRequest.setFileName("ola");
        fileRequest.setPassword("password");
        assertEquals("registered successfully", fileService.registerFile(fileRequest));
    }

    @Test
    public void testToRegisterAnExistingFile() {
        FileRequest fileRequest = new FileRequest();
        fileRequest.setFileName("ola");
        fileRequest.setPassword("password");
        assertEquals("registered successfully", fileService.registerFile(fileRequest));
        assertThrows(FileExceptions.class, ()-> fileService.registerFile(fileRequest));
    }
}