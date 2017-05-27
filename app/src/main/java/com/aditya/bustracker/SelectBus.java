package com.aditya.bustracker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.aditya.bustracker.Models.InstitutionBus;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class SelectBus extends AppCompatActivity {
    TextView InstName;
    FirebaseDatabase database;
    DatabaseReference dbRef;
    RecyclerView myrecyclerview;
    Button submitbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bus_list);
        submitbtn = (Button) findViewById(R.id.busSubmit);
        database = FirebaseDatabase.getInstance();
        dbRef = database.getReference("Institution");
        myrecyclerview = (RecyclerView) findViewById(R.id.busRecyclerView);
        myrecyclerview.setLayoutManager(new LinearLayoutManager(this));
        InstName = (TextView) findViewById(R.id.institutionName);
        Intent i = getIntent();
        String instName = i.getStringExtra("key");
        InstName.setText(instName);
        Toast.makeText(SelectBus.this,dbRef.toString(),Toast.LENGTH_LONG).show();
        DatabaseReference collegeRef = dbRef.child(instName).child("bussesInfo");
        FirebaseRecyclerAdapter<InstitutionBus,BusListViewHolder> adapter  = new FirebaseRecyclerAdapter<InstitutionBus, BusListViewHolder>(InstitutionBus.class,android.R.layout.simple_list_item_1,BusListViewHolder.class,collegeRef) {
            @Override
            protected void populateViewHolder(BusListViewHolder viewHolder, InstitutionBus model, int position) {
                 viewHolder.setValue(model.getBusRegNumber());
            }
        };

        myrecyclerview.setHasFixedSize(true);
        myrecyclerview.setAdapter(adapter);


        submitbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SelectBus.this,BusDetails.class));
            }
        });
    }


}
