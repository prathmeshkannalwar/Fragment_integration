package com.example.reinstack;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class Expense_Main_Totally extends AppCompatActivity {
 Spinner selct_cata_spiner;

 ArrayList<String> arrayIDs = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_expense_main_totally);

        selct_cata_spiner = findViewById(R.id.select_catagory_spinner);



        //spinner
        arrayIDs.add(0,"Select Category");
        arrayIDs.add("Food");
        arrayIDs.add("Transport");
        arrayIDs.add("Groceries");
        arrayIDs.add("Hospital");
        arrayIDs.add("Home Decor");
        arrayIDs.add("Education");
        arrayIDs.add("Society");
        arrayIDs.add("Insurance");
        arrayIDs.add("Daily Maintanance");

        ArrayAdapter<String> spinnerAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item,arrayIDs);
        selct_cata_spiner.setAdapter(spinnerAdapter);

        selct_cata_spiner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String data = parent.getItemAtPosition(position).toString();
                Toast.makeText(getApplicationContext(),data,Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


    }
}




