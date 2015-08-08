package com.itesm.avril.listfragment;

import android.app.Fragment;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Calendar;

public class DetalleFragment extends Fragment {

    TextView    textUno;

    //***DESCOMENTAR***


    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle saveInstanceState){

        View view       = inflater.inflate(R.layout.layout_detalle, container, false);
        textUno         = (TextView) view.findViewById(R.id.textView3);

        return view;
    }
    public void setText(Perro r){
        textUno.setText(r.getCaracteristicas());

    }
}
