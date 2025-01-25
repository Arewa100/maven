package services;

import dto.FileRequest;
import exceptions.FileExceptions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.stereotype.Service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@DataMongoTest
public class ServiceForFilesTest {
    @Autowired
    private static FileServices fileService;

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