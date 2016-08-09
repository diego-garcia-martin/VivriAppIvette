package non.vivriapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.lang.reflect.Array;

public class RecetasActivity extends AppCompatActivity {
    ListView lista_ensaladas, lista_pollo, lista_res, lista_cerdo, lista_pescado, lista_pastas, lista_arroz, lista_sopas, lista_bocadillos;
    ListAdapter adapter;
    String[] array_ensaladas, array_pollo, array_res, array_cerdo, array_pescado, array_pastas, array_arroz, array_sopas, array_bocadillos;
    public final static String EXTRA_RECETA="non.vivriapp.EXTRA_RECETA";
    String receta;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recetas);
        lista_ensaladas = (ListView)findViewById(R.id.lista_ensaladas);
        lista_pollo = (ListView)findViewById(R.id.lista_pollo);
        lista_res = (ListView)findViewById(R.id.lista_res);
        lista_cerdo = (ListView)findViewById(R.id.lista_cerdo);
        lista_pescado = (ListView)findViewById(R.id.lista_pescado);
        lista_pastas = (ListView)findViewById(R.id.lista_pastas);
        lista_arroz = (ListView)findViewById(R.id.lista_arroz);
        lista_sopas = (ListView)findViewById(R.id.lista_sopas);
        lista_bocadillos = (ListView)findViewById(R.id.lista_bocadillos);
        array_ensaladas =  getResources().getStringArray(R.array.nombres_ensaladas);
        array_pollo =  getResources().getStringArray(R.array.nombres_pollo);
        array_res =  getResources().getStringArray(R.array.nombres_res);
        array_cerdo =  getResources().getStringArray(R.array.nombres_cerdo);
        array_pescado =  getResources().getStringArray(R.array.nombres_pescado);
        array_pastas =  getResources().getStringArray(R.array.nombres_pasta);
        array_arroz =  getResources().getStringArray(R.array.nombres_arroz);
        array_sopas =  getResources().getStringArray(R.array.nombres_sopas);
        array_bocadillos =  getResources().getStringArray(R.array.nombres_bocadillos);


        adapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, array_ensaladas);
        lista_ensaladas.setAdapter(adapter);
        adapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, array_pollo);
        lista_pollo.setAdapter(adapter);
        adapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, array_res);
        lista_res.setAdapter(adapter);
        adapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, array_cerdo);
        lista_cerdo.setAdapter(adapter);
        adapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, array_pescado);
        lista_pescado.setAdapter(adapter);
        adapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, array_pastas);
        lista_pastas.setAdapter(adapter);
        adapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, array_arroz);
        lista_arroz.setAdapter(adapter);
        adapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, array_sopas);
        lista_sopas.setAdapter(adapter);
        adapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, array_bocadillos);
        lista_bocadillos.setAdapter(adapter);

        lista_ensaladas.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){
                    case 0:
                         intent=new Intent(getApplicationContext(), Recetas02.class);
                        receta="ensalada1";
                        intent.putExtra(EXTRA_RECETA, receta);
                        startActivity(intent);
                        break;
                    case 1: intent=new Intent(getApplicationContext(), Recetas02.class);
                        receta="ensalada2";
                        intent.putExtra(EXTRA_RECETA, receta);
                        startActivity(intent);
                        break;
                    case 2:
                         intent=new Intent(getApplicationContext(), Recetas02.class);
                        receta="ensalada3";
                        intent.putExtra(EXTRA_RECETA, receta);
                        startActivity(intent);
                        break;
                    case 3:
                         intent=new Intent(getApplicationContext(), Recetas02.class);
                        receta="ensalada4";
                        intent.putExtra(EXTRA_RECETA, receta);
                        startActivity(intent);
                        break;
                    case 4:
                         intent=new Intent(getApplicationContext(), Recetas02.class);
                        receta="ensalada5";
                        intent.putExtra(EXTRA_RECETA, receta);
                        startActivity(intent);
                        break;
                    case 5:
                         intent=new Intent(getApplicationContext(), Recetas02.class);
                        receta="ensalada6";
                        intent.putExtra(EXTRA_RECETA, receta);
                        startActivity(intent);
                        break;
                    case 6:
                         intent=new Intent(getApplicationContext(), Recetas02.class);
                        receta="ensalada7";
                        intent.putExtra(EXTRA_RECETA, receta);
                        startActivity(intent);
                        break;
                    case 7:
                         intent=new Intent(getApplicationContext(), Recetas02.class);
                        receta="ensalada8";
                        intent.putExtra(EXTRA_RECETA, receta);
                        startActivity(intent);
                        break;
                    case 8:
                         intent=new Intent(getApplicationContext(), Recetas02.class);
                        receta="ensalada9";
                        intent.putExtra(EXTRA_RECETA, receta);
                        startActivity(intent);
                        break;
                    case 9:
                         intent=new Intent(getApplicationContext(), Recetas02.class);
                        receta="ensalada10";
                        intent.putExtra(EXTRA_RECETA, receta);
                        startActivity(intent);
                        break;
                    default:
                        break;
                }

            }
        });

        lista_pollo.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){
                    case 0:
                         intent=new Intent(getApplicationContext(), Recetas02.class);
                        receta="pollo1";
                        intent.putExtra(EXTRA_RECETA, receta);
                        startActivity(intent);
                        break;
                    case 1: intent=new Intent(getApplicationContext(), Recetas02.class);
                        receta="pollo2";
                        intent.putExtra(EXTRA_RECETA, receta);
                        startActivity(intent);
                        break;
                    case 2:
                         intent=new Intent(getApplicationContext(), Recetas02.class);
                        receta="pollo3";
                        intent.putExtra(EXTRA_RECETA, receta);
                        startActivity(intent);
                        break;
                    case 3:
                         intent=new Intent(getApplicationContext(), Recetas02.class);
                        receta="pollo4";
                        intent.putExtra(EXTRA_RECETA, receta);
                        startActivity(intent);
                        break;
                    case 4:
                         intent=new Intent(getApplicationContext(), Recetas02.class);
                        receta="pollo5";
                        intent.putExtra(EXTRA_RECETA, receta);
                        startActivity(intent);
                        break;
                    case 5:
                         intent=new Intent(getApplicationContext(), Recetas02.class);
                        receta="pollo6";
                        intent.putExtra(EXTRA_RECETA, receta);
                        startActivity(intent);
                        break;
                    case 6:
                         intent=new Intent(getApplicationContext(), Recetas02.class);
                        receta="pollo7";
                        intent.putExtra(EXTRA_RECETA, receta);
                        startActivity(intent);
                        break;
                    case 7:
                         intent=new Intent(getApplicationContext(), Recetas02.class);
                        receta="pollo8";
                        intent.putExtra(EXTRA_RECETA, receta);
                        startActivity(intent);
                        break;
                    case 8:
                         intent=new Intent(getApplicationContext(), Recetas02.class);
                        receta="pollo9";
                        intent.putExtra(EXTRA_RECETA, receta);
                        startActivity(intent);
                        break;
                    case 9:
                         intent=new Intent(getApplicationContext(), Recetas02.class);
                        receta="pollo10";
                        intent.putExtra(EXTRA_RECETA, receta);
                        startActivity(intent);
                        break;
                    default:
                        break;
                }
            }
        });

        lista_res.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){
                    case 0:
                         intent=new Intent(getApplicationContext(), Recetas02.class);
                        receta="res1";
                        intent.putExtra(EXTRA_RECETA, receta);
                        startActivity(intent);
                        break;
                    case 1: intent=new Intent(getApplicationContext(), Recetas02.class);
                        receta="res2";
                        intent.putExtra(EXTRA_RECETA, receta);
                        startActivity(intent);
                        break;
                    case 2:
                         intent=new Intent(getApplicationContext(), Recetas02.class);
                        receta="res3";
                        intent.putExtra(EXTRA_RECETA, receta);
                        startActivity(intent);
                        break;
                    case 3:
                         intent=new Intent(getApplicationContext(), Recetas02.class);
                        receta="res4";
                        intent.putExtra(EXTRA_RECETA, receta);
                        startActivity(intent);
                        break;
                    case 4:
                         intent=new Intent(getApplicationContext(), Recetas02.class);
                        receta="res5";
                        intent.putExtra(EXTRA_RECETA, receta);
                        startActivity(intent);
                        break;
                    case 5:
                         intent=new Intent(getApplicationContext(), Recetas02.class);
                        receta="res6";
                        intent.putExtra(EXTRA_RECETA, receta);
                        startActivity(intent);
                        break;
                    case 6:
                         intent=new Intent(getApplicationContext(), Recetas02.class);
                        receta="res7";
                        intent.putExtra(EXTRA_RECETA, receta);
                        startActivity(intent);
                        break;
                    case 7:
                         intent=new Intent(getApplicationContext(), Recetas02.class);
                        receta="res8";
                        intent.putExtra(EXTRA_RECETA, receta);
                        startActivity(intent);
                        break;

                    default:
                        break;
                }
            }
        });

        lista_cerdo.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){
                    case 0:
                         intent=new Intent(getApplicationContext(), Recetas02.class);
                        receta="cerdo1";
                        intent.putExtra(EXTRA_RECETA, receta);
                        startActivity(intent);
                        break;
                    case 1: intent=new Intent(getApplicationContext(), Recetas02.class);
                        receta="cerdo2";
                        intent.putExtra(EXTRA_RECETA, receta);
                        startActivity(intent);
                        break;
                    case 2:
                         intent=new Intent(getApplicationContext(), Recetas02.class);
                        receta="cerdo3";
                        intent.putExtra(EXTRA_RECETA, receta);
                        startActivity(intent);
                        break;

                    default:
                        break;
                }
            }
        });

        lista_pescado.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){
                    case 0:
                         intent=new Intent(getApplicationContext(), Recetas02.class);
                        receta="pescado1";
                        intent.putExtra(EXTRA_RECETA, receta);
                        startActivity(intent);
                        break;
                    case 1: intent=new Intent(getApplicationContext(), Recetas02.class);
                        receta="pescado2";
                        intent.putExtra(EXTRA_RECETA, receta);
                        startActivity(intent);
                        break;
                    case 2:
                         intent=new Intent(getApplicationContext(), Recetas02.class);
                        receta="pescado3";
                        intent.putExtra(EXTRA_RECETA, receta);
                        startActivity(intent);
                        break;
                    case 3:
                         intent=new Intent(getApplicationContext(), Recetas02.class);
                        receta="pescado4";
                        intent.putExtra(EXTRA_RECETA, receta);
                        startActivity(intent);
                        break;
                    case 4:
                         intent=new Intent(getApplicationContext(), Recetas02.class);
                        receta="pescado5";
                        intent.putExtra(EXTRA_RECETA, receta);
                        startActivity(intent);
                        break;
                    case 5:
                         intent=new Intent(getApplicationContext(), Recetas02.class);
                        receta="pescado6";
                        intent.putExtra(EXTRA_RECETA, receta);
                        startActivity(intent);
                        break;
                    case 6:
                         intent=new Intent(getApplicationContext(), Recetas02.class);
                        receta="pescado7";
                        intent.putExtra(EXTRA_RECETA, receta);
                        startActivity(intent);
                        break;
                    case 7:
                         intent=new Intent(getApplicationContext(), Recetas02.class);
                        receta="pescado8";
                        intent.putExtra(EXTRA_RECETA, receta);
                        startActivity(intent);
                        break;
                    case 8:
                         intent=new Intent(getApplicationContext(), Recetas02.class);
                        receta="pescado9";
                        intent.putExtra(EXTRA_RECETA, receta);
                        startActivity(intent);
                        break;
                    case 9:
                         intent=new Intent(getApplicationContext(), Recetas02.class);
                        receta="pescado10";
                        intent.putExtra(EXTRA_RECETA, receta);
                        startActivity(intent);
                        break;
                    case 10:
                         intent=new Intent(getApplicationContext(), Recetas02.class);
                        receta="pescado11";
                        intent.putExtra(EXTRA_RECETA, receta);
                        startActivity(intent);
                        break;
                    case 11: intent=new Intent(getApplicationContext(), Recetas02.class);
                        receta="pescado12";
                        intent.putExtra(EXTRA_RECETA, receta);
                        startActivity(intent);
                        break;
                    case 12:
                         intent=new Intent(getApplicationContext(), Recetas02.class);
                        receta="pescado13";
                        intent.putExtra(EXTRA_RECETA, receta);
                        startActivity(intent);
                        break;
                    case 13:
                         intent=new Intent(getApplicationContext(), Recetas02.class);
                        receta="pescado14";
                        intent.putExtra(EXTRA_RECETA, receta);
                        startActivity(intent);
                        break;
                    case 14:
                         intent=new Intent(getApplicationContext(), Recetas02.class);
                        receta="pescado15";
                        intent.putExtra(EXTRA_RECETA, receta);
                        startActivity(intent);
                        break;
                    case 15:
                         intent=new Intent(getApplicationContext(), Recetas02.class);
                        receta="pescado16";
                        intent.putExtra(EXTRA_RECETA, receta);
                        startActivity(intent);
                        break;
                    case 16:
                         intent=new Intent(getApplicationContext(), Recetas02.class);
                        receta="pescado17";
                        intent.putExtra(EXTRA_RECETA, receta);
                        startActivity(intent);
                        break;
                    case 17:
                         intent=new Intent(getApplicationContext(), Recetas02.class);
                        receta="pescado18";
                        intent.putExtra(EXTRA_RECETA, receta);
                        startActivity(intent);
                        break;
                    case 18:
                         intent=new Intent(getApplicationContext(), Recetas02.class);
                        receta="pescado19";
                        intent.putExtra(EXTRA_RECETA, receta);
                        startActivity(intent);
                        break;
                    case 19:
                         intent=new Intent(getApplicationContext(), Recetas02.class);
                        receta="pescado20";
                        intent.putExtra(EXTRA_RECETA, receta);
                        startActivity(intent);
                        break;
                    case 20:
                         intent=new Intent(getApplicationContext(), Recetas02.class);
                        receta="pescado21";
                        intent.putExtra(EXTRA_RECETA, receta);
                        startActivity(intent);
                        break;
                    default:
                        break;
                }
            }
        });

        lista_pastas.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i) {
                    case 0:
                        intent = new Intent(getApplicationContext(), Recetas02.class);
                        receta = "pasta1";
                        intent.putExtra(EXTRA_RECETA, receta);
                        startActivity(intent);
                        break;
                    case 1:
                        intent = new Intent(getApplicationContext(), Recetas02.class);
                        receta = "pasta2";
                        intent.putExtra(EXTRA_RECETA, receta);
                        startActivity(intent);
                        break;
                    case 2:
                        intent = new Intent(getApplicationContext(), Recetas02.class);
                        receta = "pasta3";
                        intent.putExtra(EXTRA_RECETA, receta);
                        startActivity(intent);
                        break;
                    case 3:
                        intent = new Intent(getApplicationContext(), Recetas02.class);
                        receta = "pasta4";
                        intent.putExtra(EXTRA_RECETA, receta);
                        startActivity(intent);
                        break;
                    case 4:
                        intent = new Intent(getApplicationContext(), Recetas02.class);
                        receta = "pasta";
                        intent.putExtra(EXTRA_RECETA, receta);
                        startActivity(intent);
                        break;
                    case 5:
                        intent = new Intent(getApplicationContext(), Recetas02.class);
                        receta = "pasta6";
                        intent.putExtra(EXTRA_RECETA, receta);
                        startActivity(intent);
                        break;
                    case 6:
                        intent = new Intent(getApplicationContext(), Recetas02.class);
                        receta = "pasta7";
                        intent.putExtra(EXTRA_RECETA, receta);
                        startActivity(intent);
                        break;
                    default:
                        break;
                }

            }
        });

        lista_arroz.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){
                    case 0:
                        intent = new Intent(getApplicationContext(), Recetas02.class);
                        receta = "arroz1";
                        intent.putExtra(EXTRA_RECETA, receta);
                        startActivity(intent);
                        break;
                    case 1:
                        intent = new Intent(getApplicationContext(), Recetas02.class);
                        receta = "arroz2";
                        intent.putExtra(EXTRA_RECETA, receta);
                        startActivity(intent);
                        break;
                    case 2:
                        intent = new Intent(getApplicationContext(), Recetas02.class);
                        receta = "arroz3";
                        intent.putExtra(EXTRA_RECETA, receta);
                        startActivity(intent);
                        break;
                    case 3:
                        intent = new Intent(getApplicationContext(), Recetas02.class);
                        receta = "arroz4";
                        intent.putExtra(EXTRA_RECETA, receta);
                        startActivity(intent);
                        break;
                    case 4:
                        intent = new Intent(getApplicationContext(), Recetas02.class);
                        receta = "arroz5";
                        intent.putExtra(EXTRA_RECETA, receta);
                        startActivity(intent);
                        break;
                    case 5:
                        intent = new Intent(getApplicationContext(), Recetas02.class);
                        receta = "arroz6";
                        intent.putExtra(EXTRA_RECETA, receta);
                        startActivity(intent);
                        break;

                    default:
                        break;
                }
            }
        });

        lista_sopas.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){
                    case 0:
                        intent=new Intent(getApplicationContext(), Recetas02.class);
                        receta="sopa1";
                        intent.putExtra(EXTRA_RECETA, receta);
                        startActivity(intent);
                        break;
                    case 1: intent=new Intent(getApplicationContext(), Recetas02.class);
                        receta="sopa2";
                        intent.putExtra(EXTRA_RECETA, receta);
                        startActivity(intent);
                        break;
                    case 2:
                        intent=new Intent(getApplicationContext(), Recetas02.class);
                        receta="sopa3";
                        intent.putExtra(EXTRA_RECETA, receta);
                        startActivity(intent);
                        break;
                    case 3:
                        intent=new Intent(getApplicationContext(), Recetas02.class);
                        receta="sopa4";
                        intent.putExtra(EXTRA_RECETA, receta);
                        startActivity(intent);
                        break;
                    case 4:
                        intent=new Intent(getApplicationContext(), Recetas02.class);
                        receta="sopa5";
                        intent.putExtra(EXTRA_RECETA, receta);
                        startActivity(intent);
                        break;
                    case 5:
                        intent=new Intent(getApplicationContext(), Recetas02.class);
                        receta="sopa6";
                        intent.putExtra(EXTRA_RECETA, receta);
                        startActivity(intent);
                        break;
                    case 6:
                        intent=new Intent(getApplicationContext(), Recetas02.class);
                        receta="sopa7";
                        intent.putExtra(EXTRA_RECETA, receta);
                        startActivity(intent);
                        break;
                    case 7:
                        intent=new Intent(getApplicationContext(), Recetas02.class);
                        receta="sopa8";
                        intent.putExtra(EXTRA_RECETA, receta);
                        startActivity(intent);
                        break;
                    case 8:
                        intent=new Intent(getApplicationContext(), Recetas02.class);
                        receta="sopa9";
                        intent.putExtra(EXTRA_RECETA, receta);
                        startActivity(intent);
                        break;

                    default:
                        break;
                }

            }
        });

        lista_bocadillos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){
                    case 0:
                        intent=new Intent(getApplicationContext(), Recetas02.class);
                        receta="bocadillo1";
                        intent.putExtra(EXTRA_RECETA, receta);
                        startActivity(intent);
                        break;
                    case 1: intent=new Intent(getApplicationContext(), Recetas02.class);
                        receta="bocadillo2";
                        intent.putExtra(EXTRA_RECETA, receta);
                        startActivity(intent);
                        break;
                    case 2:
                        intent=new Intent(getApplicationContext(), Recetas02.class);
                        receta="bocadillo3";
                        intent.putExtra(EXTRA_RECETA, receta);
                        startActivity(intent);
                        break;
                    case 3:
                        intent=new Intent(getApplicationContext(), Recetas02.class);
                        receta="bocadillo4";
                        intent.putExtra(EXTRA_RECETA, receta);
                        startActivity(intent);
                        break;
                    case 4:
                        intent=new Intent(getApplicationContext(), Recetas02.class);
                        receta="bocadillo5";
                        intent.putExtra(EXTRA_RECETA, receta);
                        startActivity(intent);
                        break;
                    case 5:
                        intent=new Intent(getApplicationContext(), Recetas02.class);
                        receta="bocadillo6";
                        intent.putExtra(EXTRA_RECETA, receta);
                        startActivity(intent);
                        break;
                    case 6:
                        intent=new Intent(getApplicationContext(), Recetas02.class);
                        receta="bocadillo7";
                        intent.putExtra(EXTRA_RECETA, receta);
                        startActivity(intent);
                        break;
                    case 7:
                        intent=new Intent(getApplicationContext(), Recetas02.class);
                        receta="bocadillo8";
                        intent.putExtra(EXTRA_RECETA, receta);
                        startActivity(intent);
                        break;
                    case 8:
                        intent=new Intent(getApplicationContext(), Recetas02.class);
                        receta="bocadillo9";
                        intent.putExtra(EXTRA_RECETA, receta);
                        startActivity(intent);
                        break;
                    case 9:
                        intent=new Intent(getApplicationContext(), Recetas02.class);
                        receta="bocadillo10";
                        intent.putExtra(EXTRA_RECETA, receta);
                        startActivity(intent);
                        break;
                    case 10:
                        intent=new Intent(getApplicationContext(), Recetas02.class);
                        receta="bocadillo11";
                        intent.putExtra(EXTRA_RECETA, receta);
                        startActivity(intent);
                        break;
                    case 11:
                        intent=new Intent(getApplicationContext(), Recetas02.class);
                        receta="bocadillo12";
                        intent.putExtra(EXTRA_RECETA, receta);
                        startActivity(intent);
                        break;
                    case 12:
                        intent=new Intent(getApplicationContext(), Recetas02.class);
                        receta="bocadillo13";
                        intent.putExtra(EXTRA_RECETA, receta);
                        startActivity(intent);
                        break;
                    case 13:
                        intent=new Intent(getApplicationContext(), Recetas02.class);
                        receta="bocadillo14";
                        intent.putExtra(EXTRA_RECETA, receta);
                        startActivity(intent);
                        break;
                    case 14:
                        intent=new Intent(getApplicationContext(), Recetas02.class);
                        receta="bocadillo15";
                        intent.putExtra(EXTRA_RECETA, receta);
                        startActivity(intent);
                        break;
                    case 15:
                        intent=new Intent(getApplicationContext(), Recetas02.class);
                        receta="bocadillo16";
                        intent.putExtra(EXTRA_RECETA, receta);
                        startActivity(intent);
                        break;

                    default:
                        break;
                }

            }
        });

    }

    public void abrirFace(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/vivri.Ivettpaola/?pnref=story"));
        startActivity(intent);
    }
}
