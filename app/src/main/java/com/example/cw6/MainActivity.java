package com.example.cw6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Item> items = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Item i1 = new Item("Cheese", R.drawable.cheese, 1.1);
        Item i2 = new Item("Choco" , R.drawable.chocolate, 2.2);
        Item i3 = new Item("Gahwa" , R.drawable.coffee, 3.3);
        Item i4 = new Item("Donut" , R.drawable.donut, 4.4);
        Item i5 = new Item("Bu6a6" , R.drawable.fries, 5.5);
        Item i6 = new Item("Honey" , R.drawable.honey, 6.6);

        items.add(i1);
        items.add(i2);
        items.add(i3);
        items.add(i4);
        items.add(i5);
        items.add(i6);

        ItemsAdapter itemsAdapter = new ItemsAdapter(this, 0, items);
        ListView listView = findViewById(R.id.listView);
        listView.setAdapter(itemsAdapter);
    }
}