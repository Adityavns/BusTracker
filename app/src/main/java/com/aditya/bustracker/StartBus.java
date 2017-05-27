package com.aditya.bustracker;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class StartBus extends AppCompatActivity {

    Button startfromDepot;
    Button startfromInstitute;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_bus);
        startfromDepot = (Button) findViewById(R.id.startfromDepot);
        startfromInstitute = (Button) findViewById(R.id.startfromInstitute);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        startfromDepot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(StartBus.this,MapsActivity.class);
                i.putExtra("Values","Start from Depot");
                startActivity(i);
            }
        });

        startfromInstitute.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(StartBus.this,MapsActivity.class);
                i.putExtra("Values","Start from Institute");
                startActivity(i);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mainmenu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if(item.getItemId() == R.id.optionsClicked){
            startActivity(new Intent(StartBus.this,StartBusOptionsActivity.class));
        }
        else if (item.getItemId() == R.id.requestsClicked){
            startActivity(new Intent(StartBus.this,StartBusRequestsActivity.class));

        }else if (item.getItemId() == R.id.settingsClicked){
            startActivity(new Intent(StartBus.this,StartBusSettingsActivity.class));
        }
        return super.onOptionsItemSelected(item);
    }

}
