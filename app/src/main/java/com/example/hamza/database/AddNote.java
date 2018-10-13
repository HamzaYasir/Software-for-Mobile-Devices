package com.example.hamza.database;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class AddNote extends android.support.v4.app.Fragment {

    private EditText id,note;
    private Button btn;

    public AddNote() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_add_note, container, false);
        id = view.findViewById(R.id.editID);

        note = view.findViewById(R.id.editNote);

        btn = view.findViewById(R.id.Save);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int noteId = Integer.parseInt(id.getText().toString());
                String stikky = note.getText().toString();
                StikyNotes stikyNotes = new StikyNotes();
                stikyNotes.setId(noteId);
                stikyNotes.setNote(stikky);

                MainActivity.myAppDatabase.myDao().addNotes(stikyNotes);
                Toast.makeText(getActivity(),"Data is inserted succesfully!",Toast.LENGTH_SHORT).show();
                id.setText("");
                note.setText("");

            }
        });
        return view;
    }

}
