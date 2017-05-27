package com.aditya.bustracker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class SelectInst extends AppCompatActivity {


    Button confirmButton;
    AutoCompleteTextView enteredInstitution;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        confirmButton = (Button) findViewById(R.id.btnConfirm);
        enteredInstitution = (AutoCompleteTextView) findViewById(R.id.enteredInstitution);
        confirmButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(SelectInst.this,SelectBus.class);
                i.putExtra("key",enteredInstitution.getText().toString());
                startActivity(i);
            }
        });
    }
}
