package org.noteapp.noteapllication.services.interfaces;

import org.noteapp.noteapllication.dtos.CreatFileResponse;
import org.noteapp.noteapllication.dtos.CreateFileRequest;

public interface FileServices {
    CreatFileResponse createFile(CreateFileRequest createFileRequest);

    long count();
}
