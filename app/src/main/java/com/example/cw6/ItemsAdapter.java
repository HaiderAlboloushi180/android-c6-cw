package com.example.cw6;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class ItemsAdapter extends ArrayAdapter<Item> {
    List<Item> itemList;
    public ItemsAdapter(@NonNull Context context, int resource, @NonNull List<Item> objects) {
        super(context, resource, objects);
        itemList = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View view = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);

        Item currentItem = itemList.get(position);

        TextView itemName = view.findViewById(R.id.itemName);
        TextView itemPrice = view.findViewById(R.id.itemPrice);
        ImageView itemImg = view.findViewById(R.id.itemImage);

        itemName.setText(currentItem.getItemName());
        itemPrice.setText("" + currentItem.getItemPrice() + "KD");
        itemImg.setImageResource(currentItem.getItemImage());

        return view;
    }
}
