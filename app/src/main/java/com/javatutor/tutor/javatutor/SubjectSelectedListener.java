package com.javatutor.tutor.javatutor;

import android.view.View;
import android.widget.AdapterView;

public class SubjectSelectedListener implements AdapterView.OnItemSelectedListener {

    public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
        String selected = parent.getItemAtPosition(pos).toString();
    }

    public void onNothingSelected(AdapterView parent) {
        // Do nothing.
    }
}