package com.example.hamza.myapplication121;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class Activity2 extends AppCompatActivity {

    TextView email_edit;
    TextView pass_edit;
    CheckBox check1;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        Button sign_in_button=(Button)findViewById(R.id.button);
         email_edit = (TextView) findViewById(R.id.editText5);
         pass_edit=(TextView)findViewById(R.id.editText3);
         check1 =(CheckBox)findViewById(R.id.chk1);

    }
    public void show(View view)
    {
        if(email_edit.getText().toString().isEmpty() || pass_edit.getText().toString().isEmpty())
        {
            if(email_edit.getText().toString().isEmpty())
            {
                Toast.makeText(this, "Please enter email!", Toast.LENGTH_SHORT).show();
            }
            else if(pass_edit.getText().toString().isEmpty())
            {
                Toast.makeText(this, "Please enter pasword!", Toast.LENGTH_SHORT).show();
            }
            else
            {
                Toast.makeText(this, "Please fill required fields!", Toast.LENGTH_SHORT).show();
            }

        }
        else
        {
             if(check1.isChecked())
             {
                 Toast.makeText(this,"email "+email_edit.getText().toString() +" "+pass_edit.getText().toString(), Toast.LENGTH_SHORT).show();

             }
             else
             {
                 Toast.makeText(this, "You should Check terms & conditions!", Toast.LENGTH_SHORT).show();
             }

        }

    }
}
