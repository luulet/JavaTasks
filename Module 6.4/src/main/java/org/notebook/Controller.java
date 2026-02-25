package org.notebook;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

import java.sql.SQLOutput;
import java.util.List;

public class Controller {
    NoteBook notebook = new NoteBook();

    @FXML
    private TextField inputTitle;

    @FXML
    private TextArea inputText;

    @FXML
    private VBox notelog;

    public void saveNote() {
        Note note = new Note(inputTitle.getText(), inputText.getText());
        notebook.addNote(note);
        updateNoteLog();
    }

    private void updateNoteLog() {
        notelog.getChildren().clear();

        List<Note> noteArr = notebook.getNotes();
        for (int i = 0; i < noteArr.size(); i++) {
            notelog.getChildren().add(
                    new Label(noteArr.get(i).getTitle() + "\n" +
                            noteArr.get(i).getContent())
            );
        }

    }
}