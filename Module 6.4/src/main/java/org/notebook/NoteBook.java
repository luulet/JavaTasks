package org.notebook;

import java.util.ArrayList;
import java.util.List;

public class NoteBook {
    private List<Note> notebook = new ArrayList<>();

    public void addNote(Note note) {
        notebook.add(note);
    }

    public List getNotes() {
        return notebook;
    }

}
