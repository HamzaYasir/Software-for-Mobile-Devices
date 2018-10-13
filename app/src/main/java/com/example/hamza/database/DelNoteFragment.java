package com.example.hamza.database;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class DelNoteFragment extends android.support.v4.app.Fragment {

    private EditText idText;
    private Button delbtn;


    public DelNoteFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_del_note, container, false);
        idText = view.findViewById(R.id.delText);
        delbtn = view.findViewById(R.id.delButton);
        delbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int id = Integer.parseInt(idText.getText().toString());

                StikyNotes temp = new StikyNotes();
                temp.setId(id);
                MainActivity.myAppDatabase.myDao().delNote(temp);

                Toast.makeText(getActivity(),"Note successfuly removed",Toast.LENGTH_SHORT).show();
                idText.setText("");

            }
        });

        return view;

    }

}
