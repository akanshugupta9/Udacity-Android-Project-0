package com.example.familyangel.project0;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void buttonOnClick(View v) {

        switch (v.getId()) {

            case R.id.movie_app:
                Toast.makeText(getApplicationContext(), R.string.movie_app, Toast.LENGTH_SHORT).show();
                break;

            case R.id.material_app:
                // do your code
                Toast.makeText(getApplicationContext(), R.string.material_app, Toast.LENGTH_SHORT).show();
                break;

            case R.id.bib_app:
                // do your code
                Toast.makeText(getApplicationContext(), R.string.bib_app, Toast.LENGTH_SHORT).show();
                break;

            case R.id.ubiq_app:
                // do your code
                Toast.makeText(getApplicationContext(), R.string.ubiq_app, Toast.LENGTH_SHORT).show();
                break;

            case R.id.caps_app:
                // do your code
                Toast.makeText(getApplicationContext(), R.string.caps_app, Toast.LENGTH_SHORT).show();
                break;

            case R.id.stock_app:
                // do your code
                Toast.makeText(getApplicationContext(), R.string.stock_app, Toast.LENGTH_SHORT).show();
                break;

            default:
                break;
        }

    }
}
