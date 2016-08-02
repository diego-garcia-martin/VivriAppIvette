package non.vivriapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.lang.reflect.Array;

public class RecetasActivity extends AppCompatActivity {
    ListView lista_ensaladas, lista_pollo, lista_res, lista_cerdo, lista_pescado, lista_pastas, lista_arroz, lista_sopas, lista_bocadillos;
    ListAdapter adapter;
    String[] array_ensaladas, array_pollo, array_res, array_cerdo, array_pescado, array_pastas, array_arroz, array_sopas, array_bocadillos;

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

    }

    public void abrirFace(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/vivri.Ivettpaola/?pnref=story"));
        startActivity(intent);
    }
}
