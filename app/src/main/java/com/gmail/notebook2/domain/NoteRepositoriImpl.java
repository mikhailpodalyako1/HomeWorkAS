package com.gmail.notebook2.domain;

import com.gmail.notebook2.R;

import java.util.ArrayList;
import java.util.List;

public class NoteRepositoriImpl implements NoteRepository {
    @Override
    public List<Note> getNoties(){
        ArrayList<Note> result = new ArrayList<>();
        result.add(new Note(R.string.name, R.string.description, R.string.date));
        return result;
    }
}
