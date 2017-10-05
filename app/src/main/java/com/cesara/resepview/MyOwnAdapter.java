package com.cesara.resepview;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by ASUS X550V on 28/09/2017.
 */

public class MyOwnAdapter extends RecyclerView.Adapter<MyOwnAdapter.MyOwnHolder> {

    String data1[],data2[],data3[];
    //data1 = food name
    //data2 = dekripsi foodname
    //data3 = cara
    int[] img;
    Context ctx;

    public MyOwnAdapter(Context ct, String s1[], String s2[], String[] s3, int i1[]){
        ctx = ct;
        data1=s1;
        data2=s2;
        data3=s3;
        img = i1;
    }

    @Override
    public MyOwnHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater myInflator = LayoutInflater.from(ctx);
        View myOwnView = myInflator.inflate(R.layout.my_row,parent,false);

        return new MyOwnHolder(myOwnView);

    }

    @Override
    public void onBindViewHolder(MyOwnHolder holder, int position) {
        holder.t1.setText(data1[position]);
        holder.t2.setText(data2[position]);
        holder.myImage.setImageResource(img[position]);


    }

    @Override
    public int getItemCount() {

        return data1.length;
    }

    public class MyOwnHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        TextView t1,t2;
        ImageView myImage;
      //  View mView;
        public MyOwnHolder(View itemView) {
            super(itemView);
            t1 = (TextView)itemView.findViewById(R.id.text1);
            t2 = (TextView)itemView.findViewById(R.id.text2);
            myImage = (ImageView)itemView.findViewById(R.id.myImage);
            itemView.setOnClickListener(this);

            //mView = itemView;
            //con = itemView.getContext();
        }

        @Override
        public void onClick(View v) {
            int position = getAdapterPosition();
            Toast.makeText(ctx, "Menu di posisi " + position, Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(ctx,Activity2.class);
            intent.putExtra("cara",data3[position]);
            intent.putExtra("foodname",data1[position]);
            intent.putExtra("gambar",img[position]);
            ctx.startActivity(intent);
        }
    }
}
