package com.javatutor.tutor.javatutor;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;


public class WelcomeScreen extends Activity implements View.OnClickListener {

    Spinner subjects;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome_screen);

        //Populate the spinner with subjects
        subjects = (Spinner)findViewById(R.id.subjects);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.subjects, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        subjects.setAdapter(adapter);

        subjects.setSelection(0);

        //Register the listener
        subjects.setOnItemSelectedListener(new SubjectSelectedListener());

        //Set up the click listener
        View goButton = findViewById(R.id.btnGo);
        goButton.setOnClickListener(this);
    }



    @Override
    public void onClick(View v) {
        final String USN = subjects.getSelectedItem().toString();

        Intent i = new Intent();
        
        if(USN.equals("Java Basics (Study Mode)")) {
            //Basic study screen selected
            i = new Intent(this, JBasicStudy.class);
        }
        
        switch (v.getId()) {
            case R.id.btnGo:
                //Intent i = new Intent(this, JBasicStudy.class);
                //i.putExtra("getData",USN.toString());
                startActivity(i);
                break;
        }
    }
}
