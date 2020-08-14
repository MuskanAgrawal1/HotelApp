package com.example.hotel;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import static com.example.hotel.R.id.itemname;

public class MyAdapter extends ArrayAdapter<String> {
    Context context;
    String rItem[];
    String rPrice[];

    public MyAdapter(Context context, String[] rItem, String[] rPrice) {
        super(context , R.layout.activity_row, R.id.itemname, rItem);
        this.context = context;
        this.rItem = rItem;
        this.rPrice = rPrice;
    }


    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
            LayoutInflater layoutInflater = (LayoutInflater) context.getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row = layoutInflater.inflate(R.layout.activity_row, viewGroup, false);
            TextView myItem = row.findViewById(itemname);
            TextView myPrice = row.findViewById(R.id.price);

            // now set our resources on views
            myItem.setText(rItem[i]);
            myPrice.setText(rPrice[i]);

            return row;
        }
}
