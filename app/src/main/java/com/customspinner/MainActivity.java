package com.customspinner;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatSpinner;

import android.os.Bundle;
import android.widget.ArrayAdapter;

public class MainActivity extends AppCompatActivity {

    AppCompatSpinner spinnerRegular,spinnerCustom;
    String[] companyList = {"Micromax LTE","Samsung","Motorola","Apple","HTC"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinnerRegular = findViewById(R.id.spinner_regular);
        spinnerCustom = findViewById(R.id.spinner_custom);

        //Regular Adapter
        ArrayAdapter<String> adapterRegular = new ArrayAdapter(this,android.R.layout.simple_spinner_item,companyList);
        spinnerRegular.setAdapter(adapterRegular);

        //Custom Adapter
        ArrayAdapter<String> adapterCustom = new ArrayAdapter(this,R.layout.spinner_text,companyList);
        adapterCustom.setDropDownViewResource(R.layout.spinner_dropdown);
        spinnerCustom.setAdapter(adapterCustom);

    }
}
