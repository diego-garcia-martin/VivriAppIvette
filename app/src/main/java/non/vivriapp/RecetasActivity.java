package non.vivriapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class RecetasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recetas);
    }
    public void abrirEnsaladas(View view){
        Intent intent = new Intent(this, Recetas02.class);
        startActivity(intent);
    }
    public void abrirPollo(View view){
        Intent intent = new Intent(this, Recetas02.class);
        startActivity(intent);
    }
    public void abrirRes(View view){
        Intent intent = new Intent(this, Recetas02.class);
        startActivity(intent);
    }
    public void abrirCerdo(View view){
        Intent intent = new Intent(this, Recetas02.class);
        startActivity(intent);
    }
    public void abrirPastas(View view){
        Intent intent = new Intent(this, Recetas02.class);
        startActivity(intent);
    }
    public void abrirPescados(View view){
        Intent intent = new Intent(this, Recetas02.class);
        startActivity(intent);
    }
    public void abrirBocadillos(View view){
        Intent intent = new Intent(this, Recetas02.class);
        startActivity(intent);
    }
    public void abrirFace(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/vivri.Ivettpaola/?pnref=story"));
        startActivity(intent);
    }
}
