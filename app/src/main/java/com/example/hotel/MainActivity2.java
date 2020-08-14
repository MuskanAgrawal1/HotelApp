package com.example.hotel;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.drawable.Drawable;
import android.media.audiofx.AudioEffect;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {
    RecyclerView verticalRV;
    VerticalRVAdapter adapter;
    ArrayList<VerticalModel> arrayListVertical=new ArrayList<>();
    String[] titleMain={"Starters","Main Course","Sea Food","Beverages","Dessert"};
    String[] Menu={"Momos","Pizza","Burger","French Fries","Sizzler","Pasta"};
    String[] MainC={"Naan","Paneer","Biryani"};
    String[] SeaF={"Fish","Prawn","Oysters","Crab"};
    String[] Beve={"Coke","Fanta","Sprite","Orange Juice","Coke","Fanta","Sprite","Orange Juice"};
    String[] Dess={"Gulab Jamun","IceCream","Pastry","Jalebi","Laddu","Rasmalai"};
   String[] img={"R.drawable.pasta", "R.drawable.pasta", "R.drawable.pasta", "R.drawable.pasta", "R.drawable.pasta"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        verticalRV = (RecyclerView) findViewById(R.id.recycle);
        verticalRV.setHasFixedSize(true);
        verticalRV.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));

        arrayListVertical = new ArrayList<>();
        adapter = new VerticalRVAdapter(this, arrayListVertical);
        verticalRV.setAdapter(adapter);
        setData();
        //vertical adapter
    }

    public void setData() {

        for (int i = 0; i < titleMain.length; i++) {
            VerticalModel verticalModel = new VerticalModel();
            verticalModel.setTitle(titleMain[i]);
            ArrayList<HorizontalModel> arraylist = new ArrayList<>();

            if(titleMain[i]=="Starters")
            {
            for (int j = 0; j < Menu.length; j++) {
                HorizontalModel horizontalModel = new HorizontalModel();
                horizontalModel.setDescription("Description");
                horizontalModel.setName(Menu[j]);
                arraylist.add(horizontalModel);
            }}
            if(titleMain[i]=="Main Course")
            {
                for (int j = 0; j < MainC.length; j++) {
                    HorizontalModel horizontalModel = new HorizontalModel();
                    horizontalModel.setDescription("Description" + j);
                    horizontalModel.setName(MainC[j]);
                    arraylist.add(horizontalModel);
                }}
            if(titleMain[i]=="Sea Food")
            {
                for (int j = 0; j < SeaF.length; j++) {
                    HorizontalModel horizontalModel = new HorizontalModel();
                    horizontalModel.setDescription("Description" + j);
                    horizontalModel.setName(SeaF[j]);
                    arraylist.add(horizontalModel);
                }}
            if(titleMain[i]=="Beverages")
            {
                for (int j = 0; j < Beve.length; j++) {
                    HorizontalModel horizontalModel = new HorizontalModel();
                    horizontalModel.setDescription("Description" + j);
                    horizontalModel.setName(Beve[j]);
                    arraylist.add(horizontalModel);
                }}
            if(titleMain[i]=="Dessert")
            {
                for (int j = 0; j < Dess.length; j++) {
                    HorizontalModel horizontalModel = new HorizontalModel();
                    horizontalModel.setDescription("Description" + j);
                    horizontalModel.setName(Dess[j]);
                    arraylist.add(horizontalModel);
                }}
            verticalModel.setArrayList(arraylist);

            arrayListVertical.add(verticalModel);
        }
        adapter.notifyDataSetChanged();

    }
}