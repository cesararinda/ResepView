package com.cesara.resepview;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {
    ImageView imageView;
    TextView textView2;

    //int gbr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        textView2 = (TextView) findViewById(R.id.isi);
        imageView = (ImageView)findViewById(R.id.image);
//        imageView.setImageResource(R.drawable.dog);
        Bundle extras = getIntent().getExtras();
        //String title = extras.getString("tas");
        String isiku = extras.getString("cara");
        int gambarku = extras.getInt("gambar");
        String foodnameku = extras.getString("foodname");


        //textView1.setText(title);
        textView2.setText(isiku);
        imageView.setImageResource(gambarku);

           setTitle(foodnameku);
         ActionBar menu = getSupportActionBar();
        menu.setDisplayShowHomeEnabled(true);
        menu.setDefaultDisplayHomeAsUpEnabled(true);
    }
}
