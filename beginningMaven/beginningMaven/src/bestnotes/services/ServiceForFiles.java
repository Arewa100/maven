package services;

import data.models.File;
import data.repositories.FileRepository;
import dto.FileRequest;
import exceptions.FileExceptions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ServiceForFiles implements FileServices {
    @Autowired   //this is where i am
    private FileRepository fileRepository;


    @Override
    public String registerFile(FileRequest fileRequest) {
        if(fileRepository.findById(fileRequest.getFileName()).isPresent()) throw new FileExceptions("user exists...");
        File file = new File();
        file.setFileName(fileRequest.getFileName());
        file.setPassword(fileRequest.getPassword());
        fileRepository.save(file);
        return "registered successfully";
    }

    @Override
    public String login(String username, String password) {
        return "";
    }

    @Override
    public String logout(String username, String password) {
        return "";
    }

    @Override
    public String createNote(String fileName, String title, String body, String noteId) {
        return "";
    }

    @Override
    public String updateNote(String fileName, String title, String body, String noteId) {
        return "";
    }

    @Override
    public String deleteNote(String fileName, String noteId) {
        return "";
    }

    @Override
    public String readNote(String fileName, String noteId) {
        return "";
    }
}
