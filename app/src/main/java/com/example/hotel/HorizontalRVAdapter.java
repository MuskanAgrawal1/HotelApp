package com.example.hotel;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class HorizontalRVAdapter extends RecyclerView.Adapter<HorizontalRVAdapter.HorizontalRVViewHolder>{

    Context context;
    ArrayList<HorizontalModel> arrayList;
    public HorizontalRVAdapter(Context context,ArrayList<HorizontalModel> arrayList) {
        this.arrayList = arrayList;
        this.context = context;
    }

        @NonNull
    @Override
    public HorizontalRVViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_horizontal,parent,false);
            return new HorizontalRVViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HorizontalRVViewHolder holder, int position) {
        final HorizontalModel horizontalModel=arrayList.get(position);
        holder.tvtitle2.setText(horizontalModel.getName());
        holder.iv.setImageResource(R.drawable.pasta);
       holder.itemView.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Toast.makeText(context,horizontalModel.getName(),Toast.LENGTH_SHORT).show();
               if(horizontalModel.getName()=="Momos")
               {
                   Bundle b = new Bundle();
                   b.putStringArray("Food", new String[]{"Veg Steam Momos","Veg Fried Momos","Veg Chilly Momos","Chicken Steam Momos","Chicken Chilly Momos","Chicken Fry Momos"});
                   Intent in=new Intent(context, MainActivity.class);
                   in.putExtras(b);
                   context.startActivity(in);
               }
                else if(horizontalModel.getName()=="IceCreams")
               {
                   Bundle b = new Bundle();
                   b.putStringArray("Food", new String[]{"Chocolate IceCream","Mango IceCream","Vanilla IceCream","Strawberry IceCream","ButterScotch IceCream","American Nuts IceCream"});
                   Intent in=new Intent(context, MainActivity.class);
                   in.putExtras(b);
                   context.startActivity(in);
               }
               else if(horizontalModel.getName()=="Burger")
               {
                   Bundle b = new Bundle();
                   b.putStringArray("Food", new String[]{"Veg Burger","Paneer Burger","Chicken Burger","Cheese Burger"});
                   Intent in=new Intent(context, MainActivity.class);
                   in.putExtras(b);
                   context.startActivity(in);
               }
               else if(horizontalModel.getName()=="Pasta")
               {
                   Bundle b = new Bundle();
                   b.putStringArray("Food", new String[]{"Veg Alfredo White Sauce Pasta","Red Sauce Chilly Pasta","Chicken Red-Sauce Pasta","Chicken Alfredo White Sauce Pasta"});
                   Intent in=new Intent(context, MainActivity.class);
                   in.putExtras(b);
                   context.startActivity(in);
               }
               else if(horizontalModel.getName()=="Sweets")
               {
                   Bundle b = new Bundle();
                   b.putStringArray("Food", new String[]{"Gulab Jamun","Jalebi","Rasgulla","PanCake","Motichur Laddu"});
                   Intent in=new Intent(context, MainActivity.class);
                   in.putExtras(b);
                   context.startActivity(in);
               }
               else if(horizontalModel.getName()=="Pastries")
               {
                   Bundle b = new Bundle();
                   b.putStringArray("Food", new String[]{"Chocolate Truffle","Mango Pastry","Black Forest","White Forest","ButterScotch Pastry","Red Velvet Pastry"});
                   Intent in=new Intent(context, MainActivity.class);
                   in.putExtras(b);
                   context.startActivity(in);
               }
               else if(horizontalModel.getName()=="Mini-Cakes")
               {
                   Bundle b = new Bundle();
                   b.putStringArray("Food", new String[]{"Banana Muffins","Chocolate Tart"});
                   Intent in=new Intent(context, MainActivity.class);
                   in.putExtras(b);
                   context.startActivity(in);
               }
               else if(horizontalModel.getName()=="Pies")
               {
                   Bundle b = new Bundle();
                   b.putStringArray("Food", new String[]{"Chocolate Pie","Apple Pie","Lemon Tart"});
                   Intent in=new Intent(context, MainActivity.class);
                   in.putExtras(b);
                   context.startActivity(in);
               }
               else if(horizontalModel.getName()=="Soft-Drink")
               {
                   Bundle b = new Bundle();
                   b.putStringArray("Food", new String[]{"Coke","Fanta","Pepsi","Sprite","Mountain Dew"});
                   Intent in=new Intent(context, MainActivity.class);
                   in.putExtras(b);
                   context.startActivity(in);
               }
               else if(horizontalModel.getName()=="Pasta")
               {
                   Bundle b = new Bundle();
                   b.putStringArray("Food", new String[]{"Veg Alfredo White Sauce Pasta","Red Sauce Chilly Pasta","Chicken Red-Sauce Pasta","Chicken Alfredo White Sauce Pasta"});
                   Intent in=new Intent(context, MainActivity.class);
                   in.putExtras(b);
                   context.startActivity(in);
               }
           }
       });
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class HorizontalRVViewHolder extends RecyclerView.ViewHolder
    {
        ImageView iv;
        TextView tvtitle2;
        public HorizontalRVViewHolder(@NonNull View itemView) {
            super(itemView);
            iv=(ImageView)itemView.findViewById(R.id.ivThumb);
            tvtitle2=(TextView)itemView.findViewById(R.id.titlee);
        }
    }
}