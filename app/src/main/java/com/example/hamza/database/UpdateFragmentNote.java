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
public class UpdateFragmentNote extends android.support.v4.app.Fragment {

    private EditText id,note;
    private Button btn;

    public UpdateFragmentNote() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             final Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_update_fragment_note, container, false);
        id = view.findViewById(R.id.updateId);
        note = view.findViewById(R.id.updateNote);
        btn = view.findViewById(R.id.updateBtn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id1 = Integer.parseInt(id.getText().toString());
                String data = note.getText().toString();

                StikyNotes stikyNotes = new StikyNotes();
                stikyNotes.setId(id1);
                stikyNotes.setNote(data);
                MainActivity.myAppDatabase.myDao().updateNote(stikyNotes);
                Toast.makeText(getActivity(),"Note Updated------",Toast.LENGTH_SHORT).show();
                id.setText("");
                note.setText("");

            }
        });


        return view;
    }

}
