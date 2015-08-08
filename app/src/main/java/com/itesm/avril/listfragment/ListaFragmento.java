package com.itesm.avril.listfragment;

import android.app.ListFragment;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import java.util.ArrayList;


public class ListaFragmento extends ListFragment {
    private PerrosListAdapter adapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);


        ArrayList<Perro> p =new ArrayList<Perro>();
        p.add(new Perro("Rocky" , "Silky Terrier", "Es un perro elegante, de cuerpo largo y talla baja, su longitud es del doble de la talla.")); //http://www.mascotarios.org/wp-content/gallery/australian-silky-terrier/australian-silky-terrier3.jpg
        p.add(new Perro("Mateo" , "Doberman"     , "Un perro de guardia y proteccion sin igual, aristrocratico y valeroso.")); //http://www.yourpurebredpuppy.com/dogbreeds/photos-CD/dobermanpinschersf2.jpg
        p.add(new Perro("Dixie" , "Dalmata"      , "Es un perro de cuerpo robusto, cabeza ancha, orejas colgantes bien pegadas a las mejillas, ojos oscuros, nariz ancha, mandibulas y cuello poderoso para sostener a la presa durante el cobro.")); //http://razascanofilas.site50.net/Dalmata/Dalmata2.jpg
        p.add(new Perro("Norton", "Chihuahua"    , "Esta es la raza mas pequena de todas las existentes con un peso que va de los 500 gramos a los 3 Kg. Su cuerpo es ligeramente mas largo que alto.")); // http://mascotafiel.com/wp-content/uploads/2014/04/chihuahua.jpg
        p.add(new Perro("Max"   , "Beagle"       ,"Es un perro de pequeno a mediano en tamano, es compacto y tiene una cabeza potente.")); //http://petful.supercopyeditors.netdna-cdn.com/wp-content/uploads/2014/03/Beagle-breed-profile.jpg


        p.add(new Perro("Paco"  , "Schnauzer"    , "Amigables y cariñosos, los schnauzer se integran bien dentro de la vida familiar y se llevarán bien con los niños, y otros perros, siempre y cuando estén correctamente socializados y entrenados.")); //http://www.dogwallpapers.net/wallpapers/nice-schnauzer-standard-dog-photo.jpg
        p.add(new Perro("Floopy", "Boxer"        , "Entre sus rasgos físicos se encuentran una cabeza fuerte, mandíbula inferior prognática, cuya presión mandibular es generalmente de 122 kg/cm hocico chato con una característica máscara negra"));  //http://perromasobediente.com/razas/images/boxer.jpg
        p.add(new Perro("pinky" , "Pug"          , "perro bajo y macizo de aspecto cuadrado y compacto, bien proporcionado y musculoso; la cabeza grande, redondeada y de aspecto sólido, está cubierta de pliegues; el hocico es cuadrado y chato; los ojos, grandes y oscuros; tiene las patas rectas y la cola rizada.")); //https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSf7dceKh7liqW7BeIv--3i_2bR6QJLTkY6RaFdQ0fpdmHhPUwS




        adapter = new PerrosListAdapter(getActivity(),p);
        setListAdapter(adapter);

        //Copiar C�digo
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        Perro r = (Perro) getListAdapter().getItem(position);
        DetalleFragment df = (DetalleFragment)
                this.getFragmentManager().findFragmentById(R.id.fragment2);
        if (df!=null && df.isInLayout()){
            df.setText(r);
        }
    }
}


