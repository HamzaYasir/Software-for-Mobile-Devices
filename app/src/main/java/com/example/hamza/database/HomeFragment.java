package com.example.hamza.database;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment implements View.OnClickListener{

private Button addnote,readnote,delnote,upNote;


    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        addnote = view.findViewById(R.id.addNote);
        readnote = view.findViewById(R.id.selectNote);
        delnote = view.findViewById(R.id.delNote);
        upNote = view.findViewById(R.id.updateNote);
        addnote.setOnClickListener(this);
        readnote.setOnClickListener(this);
        delnote.setOnClickListener(this);
        upNote.setOnClickListener(this);
        return view;

    }

    @Override
    public void onClick(View v) {

        switch (v.getId())
        {
            case R.id.addNote:
                 MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container,new AddNote())
                         .addToBackStack(null).commit();
                         break;
            case R.id.selectNote:
                 MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container,new ReadNoteFragment())
                         .addToBackStack(null).commit();
                 break;
            case R.id.delNote:
                MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container,new DelNoteFragment())
                        .addToBackStack(null).commit();
                break;
            case R.id.updateNote:
                MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container,new UpdateFragmentNote())
                        .addToBackStack(null).commit();
                break;
        }
    }
}
