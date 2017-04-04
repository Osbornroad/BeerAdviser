package com.gmail.osbornroad.beeradviser;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class FindBeerActivity extends Activity {

    TextView brands;
    Spinner color;
    String beerType;
    private BeerExpert expert = new BeerExpert();
    List<String> listBrands;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_beer);
    }

    public void onClickFindBeer(View view) {
        brands = (TextView) findViewById(R.id.brands);
        color = (Spinner) findViewById(R.id.color);
        beerType = String.valueOf(color.getSelectedItem());

        listBrands = expert.getBrands(beerType);
        StringBuilder sb = new StringBuilder();
        for(String temp : listBrands) {
            sb.append(temp);
            sb.append("\n");
        }
        brands.setText(sb);
    }
}
