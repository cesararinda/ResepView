package com.cesara.resepview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    RecyclerView r1;
    String s1[],s2[],s3[];
    int imageResource[] = {R.drawable.sop,R.drawable.iga,R.drawable.rendang,R.drawable.lele,R.drawable.ayam};

    MyOwnAdapter ad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Menu Resep");
        r1 = (RecyclerView)findViewById(R.id.myRecycler);

        s1 = getResources().getStringArray(R.array.food_name);
        s2 = getResources().getStringArray(R.array.desc);
        s3 = getResources().getStringArray(R.array.cara);

        ad = new MyOwnAdapter(this, s1,s2,s3, imageResource);

        r1.setAdapter(ad);
        r1.setLayoutManager(new LinearLayoutManager(this));
    }
}
