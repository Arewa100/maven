package services;

import dto.FileRequest;

public interface FileServices {
    String registerFile(FileRequest fileRequest);
    String login(String username, String password);
    String logout(String username, String password);
    String createNote(String fileName, String title, String body, String noteId);
    String updateNote(String fileName, String title, String body, String noteId);
    String deleteNote(String fileName, String noteId);
    String readNote(String fileName, String noteId);
}
