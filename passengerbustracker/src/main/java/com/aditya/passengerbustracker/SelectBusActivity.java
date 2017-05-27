package com.aditya.passengerbustracker;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class SelectBusActivity extends AppCompatActivity {
RecyclerView bussesList;
    Button confirmButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_bus);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        bussesList= (RecyclerView) findViewById(R.id.recyclerview_busseslist);
        confirmButton = (Button) findViewById(R.id.button_bus_selected);
confirmButton.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        startActivity(new Intent(SelectBusActivity.this,PassengerDetails.class));
    }
});
    }

}
