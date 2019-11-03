package com.example.finalwork;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openMonday(View btn){

        Button mon = findViewById(R.id.mon);
        String monday = (String) mon.getText();
        Intent mond = new Intent(this, TableActivity.class);
        mond.putExtra("day",monday);
        startActivity(mond);

    }

    public void openTuesday(View btn){

        Button tue = findViewById(R.id.tue);
        String tuesday = (String) tue.getText();
        Intent tues = new Intent(this, TableActivity.class);
        tues.putExtra("day",tuesday);
        startActivity(tues);

    }

    public void openWednesday(View btn){

        Button wed = findViewById(R.id.wed);
        String wednesday = (String) wed.getText();
        Intent wedn = new Intent(this, TableActivity.class);
        wedn.putExtra("day",wednesday);
        startActivity(wedn);

    }

    public void openThursday(View btn){

        Button thu = findViewById(R.id.thu);
        String thursday = (String) thu.getText();
        Intent thur = new Intent(this, TableActivity.class);
        thur.putExtra("day",thursday);
        startActivity(thur);

    }

    public void openFriday(View btn){

        Button fri = findViewById(R.id.fri);
        String friday = (String) fri.getText();
        Intent frid = new Intent(this, TableActivity.class);
        frid.putExtra("day",friday);
        startActivity(frid);

    }

}
