package org.noteapp.noteapllication.services.implementations;

import org.noteapp.noteapllication.data.models.File;
import org.noteapp.noteapllication.data.repositories.FileRepository;
import org.noteapp.noteapllication.dtos.CreatFileResponse;
import org.noteapp.noteapllication.dtos.CreateFileRequest;
import org.noteapp.noteapllication.services.interfaces.FileServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FileServicesImpl implements FileServices {

    @Autowired
    private FileRepository fileRepository;

    @Override
    public CreatFileResponse createFile(CreateFileRequest createFileRequest) {
        File file = new File();
        file.setFileName(createFileRequest.getFileName());
        file.setPassword(createFileRequest.getPassword());
        fileRepository.save(file);

        return null;
    }

    @Override
    public long count() {
        return fileRepository.count();
    }
}
