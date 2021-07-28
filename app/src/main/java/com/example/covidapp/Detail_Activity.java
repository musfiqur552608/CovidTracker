package com.example.covidapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class Detail_Activity extends AppCompatActivity {

    private int positionC;

    TextView tvCountry,tvCases,tvRecovered,tvCritical,tvActive, tvTodayCases, tvTotalDeaths,tvTodayDeaths;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Intent intent = getIntent();
        positionC = intent.getIntExtra("position",0);

        getSupportActionBar().setTitle("Details of "+AffectedCountries.countryModelsList.get(positionC).getCountry());
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);



        tvCountry = findViewById(R.id.tvCountry);
        tvCases = findViewById(R.id.tvCases);
        tvRecovered = findViewById(R.id.tvRecovered);
        tvCritical = findViewById(R.id.tvCritical);
        tvActive = findViewById(R.id.tvActive);
        tvTodayCases = findViewById(R.id.tvTodayCases);
        tvTotalDeaths = findViewById(R.id.tvDeaths);
        tvTodayDeaths = findViewById(R.id.tvTodayDeaths);

        tvCountry.setText(AffectedCountries.countryModelsList.get(positionC).getCountry());
        tvCases.setText(AffectedCountries.countryModelsList.get(positionC).getCases());
        tvRecovered.setText(AffectedCountries.countryModelsList.get(positionC).getRecovered());
        tvCritical.setText(AffectedCountries.countryModelsList.get(positionC).getCritical());
        tvActive.setText(AffectedCountries.countryModelsList.get(positionC).getActive());
        tvTodayCases.setText(AffectedCountries.countryModelsList.get(positionC).getTodayCases());
        tvTotalDeaths.setText(AffectedCountries.countryModelsList.get(positionC).getDeaths());
        tvTodayDeaths.setText(AffectedCountries.countryModelsList.get(positionC).getTodayDeaths());


    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==android.R.id.home)
            finish();
        return super.onOptionsItemSelected(item);
    }
}