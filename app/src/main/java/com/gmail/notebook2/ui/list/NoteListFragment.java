package com.gmail.notebook2.ui.list;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.gmail.notebook2.R;
import com.gmail.notebook2.domain.Note;
import com.gmail.notebook2.domain.NoteRepositoriImpl;

import java.io.LineNumberInputStream;
import java.util.List;


public class NoteListFragment extends Fragment {
    private NoteRepositoriImpl noteRepository;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        noteRepository = new NoteRepositoriImpl();
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // создание вью для фрагмента
        return inflater.inflate(R.layout.fragment_note_list, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        LinearLayout noteList = view.findViewById(R.id.note_list_container);

        List<Note> notes = noteRepository.getNoties();
        for (Note note:notes){
            View itemView = LayoutInflater.from(requireContext()).inflate(R.layout.item_note, noteList, false);
            TextView noteName = itemView.findViewById(R.id.note_name);
            noteName.setText(note.getName());

            noteList.addView(itemView);
        }
    }

    @Override
    public void onStop() {
        super.onStop();
    }

    @Override
    public void onResume() {
        super.onResume();
    }

    @Override
    public void onStart() {
        super.onStart();
    }
}
