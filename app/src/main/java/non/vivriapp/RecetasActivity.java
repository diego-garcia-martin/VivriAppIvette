package non.vivriapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class RecetasActivity extends AppCompatActivity {
    ListView lista_ensaladas;
    ArrayAdapter<String> adapter;
    String[] array_ensaladas;

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
