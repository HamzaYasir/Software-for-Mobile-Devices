package com.example.hamza.database;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class ReadNoteFragment extends android.support.v4.app.Fragment {

    TextView info;

    public ReadNoteFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_read_note, container, false);

        info = view.findViewById(R.id.diplay_info);

        List<StikyNotes> notes = MainActivity.myAppDatabase.myDao().getNotes();

        String data = "";
        for(StikyNotes s :notes)
        {
            int id = s.getId();
            String value = s.getNote();
            data = data+"\n\n"+"ID:"+id+"\n Note:"+value+"\n";

        }


        info.setText(data);
        return view;
    }

}
