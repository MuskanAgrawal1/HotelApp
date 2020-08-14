package com.example.hotel;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Context;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    Button order,add,sub;

    String mPrice[] = {"Rs.150","Rs.120","Rs.180","Rs.140"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            listView = findViewById(R.id.listView);
            add = (Button)findViewById(R.id.increase);
            sub = findViewById(R.id.decrease);
            order = findViewById(R.id.placeOrder);
            // now create an adapter class
        Bundle b = this.getIntent().getExtras();
        String[] mItem=b.getStringArray("Food");

        order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Order Placed Successfully", Toast.LENGTH_SHORT).show();
            }
        });

            MyAdapter adapter = new MyAdapter(this, mItem, mPrice);
            listView.setAdapter(adapter);
            // there is my mistake...
            // now again check this..

            // now set item click on list view
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    if (position ==  0) {
                        Toast.makeText(MainActivity.this, "Momos Selected", Toast.LENGTH_SHORT).show();
                    }
                    if (position ==  1) {
                        Toast.makeText(MainActivity.this, "Pizza Selected", Toast.LENGTH_SHORT).show();
                    }
                    if (position ==  2) {
                        Toast.makeText(MainActivity.this, "Sizzler Selected", Toast.LENGTH_SHORT).show();
                    }
                    if (position ==  3) {
                        Toast.makeText(MainActivity.this, "French Fries Selected", Toast.LENGTH_SHORT).show();
                    }
                    if (position ==  4) {
                        Toast.makeText(MainActivity.this, "Paav Bhaji Selected", Toast.LENGTH_SHORT).show();
                    }
                    if (position ==  5) {
                        Toast.makeText(MainActivity.this, "Burger Selected", Toast.LENGTH_SHORT).show();
                    }
                    if (position == 6) {
                        Toast.makeText(MainActivity.this, "American Chopsey Selected", Toast.LENGTH_SHORT).show();
                    }
                    if (position == 7) {
                        Toast.makeText(MainActivity.this, "Chole Bhature Selected", Toast.LENGTH_SHORT).show();
                    }
                    if (position ==  8) {
                        Toast.makeText(MainActivity.this, "Masala Dosa Selected", Toast.LENGTH_SHORT).show();
                    }
                    if (position ==  9) {
                        Toast.makeText(MainActivity.this, "Ice Cream Selected", Toast.LENGTH_SHORT).show();
                    }
                }
            });
            // so item click is done now check list view
        }


        }

