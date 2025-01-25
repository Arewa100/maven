package org.noteapp.noteapplication.services.implementations;

import org.noteapp.noteapllication.dtos.CreateFileRequest;
import org.junit.jupiter.api.Test;
import org.noteapp.noteapllication.services.interfaces.FileServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;


@DataMongoTest
public class FileServicesImplTest {

    @Autowired
    private FileServices fileServices;
    

//    @Autowired
//    private FileRepository fileRepository;

    @Test
    public void testThatToSave() {
        CreateFileRequest createFileRequest = new CreateFileRequest();
        fileServices.createFile(createFileRequest);
        assertEquals(1L, fileServices.count());
    }


}