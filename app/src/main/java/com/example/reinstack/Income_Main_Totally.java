package com.example.reinstack;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.reinstack.databinding.ActivityIncomeMainTotallyBinding;

import java.util.ArrayList;

public class Income_Main_Totally extends AppCompatActivity {
    ActivityIncomeMainTotallyBinding binding;

    Spinner selct_incsrc_spiner;

    ArrayList<String> arrayIDs1 = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityIncomeMainTotallyBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.incomesavebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String amount = binding.useramountadd.getText().toString().trim();
                String description = binding.userincomedescription.getText().toString().trim();
            }
        });



        selct_incsrc_spiner = findViewById(R.id.select_incomesource_spinner);

        //spinner
        arrayIDs1.add(0,"Select Payment Method");
        arrayIDs1.add("Cash");
        arrayIDs1.add("Debit Card");
        arrayIDs1.add("NET BANKING");
        arrayIDs1.add("ATM");


        ArrayAdapter<String> spinnerAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item,arrayIDs1);
        selct_incsrc_spiner.setAdapter(spinnerAdapter);

        selct_incsrc_spiner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String data = parent.getItemAtPosition(position).toString();
                Toast.makeText(getApplicationContext(),data,Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }

        });

        MyBDHelper dbHelper = new MyBDHelper(this);



    }
}