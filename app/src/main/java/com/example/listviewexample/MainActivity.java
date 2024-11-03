package com.example.listviewexample;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    Spinner spinner;
    AutoCompleteTextView autoCompleteTextView;
    ArrayList<String> arrNames = new ArrayList<>();
    ArrayList<String> arrIds = new ArrayList<>();
    ArrayList<String> arrLanguage = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // ListView

        listView = findViewById(R.id.listView);

        arrNames.add("Ram");
        arrNames.add("Raman");
        arrNames.add("Raj");
        arrNames.add("Ramesh");
        arrNames.add("Rahul");
        arrNames.add("Ramanujan");
        arrNames.add("Ravindra");
        arrNames.add("Rekha");
        arrNames.add("Rajesh");
        arrNames.add("Rajashree");
        arrNames.add("Ram");
        arrNames.add("Raman");
        arrNames.add("Raj");
        arrNames.add("Ramesh");
        arrNames.add("Rahul");
        arrNames.add("Ramanujan");
        arrNames.add("Ravindra");
        arrNames.add("Rekha");
        arrNames.add("Rajesh");
        arrNames.add("Rajashree");
        arrNames.add("Ram");
        arrNames.add("Raman");
        arrNames.add("Raj");
        arrNames.add("Ramesh");
        arrNames.add("Rahul");
        arrNames.add("Ramanujan");
        arrNames.add("Ravindra");
        arrNames.add("Rekha");
        arrNames.add("Rajesh");
        arrNames.add("Rajashree");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, arrNames);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0){
                    Toast.makeText(MainActivity.this, "Clicked First Item", Toast.LENGTH_SHORT).show();
                }
            }
        });

        // Spinner
        spinner = findViewById(R.id.spinner);

        arrIds.add("Aadhar Card");
        arrIds.add("Voter Id");
        arrIds.add("Pan Card");
        arrIds.add("Driving License");
        arrIds.add("Ration card");
        arrIds.add("Xth Score Card");
        arrIds.add("XIIth Score Card");

        ArrayAdapter<String> spinnerAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item,arrIds);
        spinner.setAdapter(spinnerAdapter);

        // AutoCompleteTextView
        autoCompleteTextView = findViewById(R.id.autoCompleteTextView);
        arrLanguage.add("C");
        arrLanguage.add("C++");
        arrLanguage.add("JAVA");
        arrLanguage.add("Python");
        arrLanguage.add("C#");
        arrLanguage.add("PHP");
        arrLanguage.add("SQL");
        arrLanguage.add("ML");
        arrLanguage.add("AI");
        arrLanguage.add(".NET");
        arrLanguage.add("JavaScript");

        ArrayAdapter<String> autoCompleteAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,arrLanguage);
        autoCompleteTextView.setAdapter(autoCompleteAdapter);
        autoCompleteTextView.setThreshold(1);
    }
}