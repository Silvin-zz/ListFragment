package com.itesm.avril.listfragment;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class PerrosListAdapter extends BaseAdapter {

    Context context;
    List<Perro> rowItems;

    public PerrosListAdapter(Context context, List<Perro> rowItems) {
        this.context = context;
        this.rowItems = rowItems;
    }

    @Override
    public int getCount() {
        return rowItems.size();
    }

    @Override
    public Object getItem(int position) {
        return rowItems.get(position);
    }

    @Override
    public long getItemId(int position) {
        return rowItems.indexOf(getItem(position));
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if(convertView == null){
            LayoutInflater lay = (LayoutInflater) context.getSystemService(
                    Activity.LAYOUT_INFLATER_SERVICE);

            convertView = lay.inflate(R.layout.list_view, parent, false);
        }

        TextView nombre = (TextView)convertView.findViewById(R.id.textView);
        TextView raza = (TextView)convertView.findViewById(R.id.textView2);

        nombre.setTextColor(Color.BLACK);
        raza.setTextColor(Color.BLACK);

        Perro  r = rowItems.get(position);
        nombre.setText(r.getNombre());
        raza.setText(r.getRaza());

        return convertView;
    }


}
