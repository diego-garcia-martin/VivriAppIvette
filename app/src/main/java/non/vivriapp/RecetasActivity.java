package non.vivriapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ExpandableListView;

import java.util.HashMap;
import java.util.List;

public class RecetasActivity extends AppCompatActivity {
    HashMap <String , List<String>> categorias_recetas;
    List<String> recetas_lista;
    ExpandableListView expandableListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recetas);
    }

    public void abrirFace(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/vivri.Ivettpaola/?pnref=story"));
        startActivity(intent);
    }
}
