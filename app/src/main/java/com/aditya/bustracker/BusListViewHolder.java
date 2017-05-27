package com.aditya.bustracker;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Aditya on 5/21/2017.
 */

public class BusListViewHolder extends RecyclerView.ViewHolder{

    private View thisView;
    public BusListViewHolder(View itemView) {
        super(itemView);
        this.thisView = itemView;
    }

    public void setValue(String value) {
        TextView item1 = (TextView) thisView.findViewById(android.R.id.text1);
        item1.setText(value);
    }
}
