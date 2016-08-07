package non.vivriapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Reto_Vivri extends AppCompatActivity {
    public final static String EXTRA_MESSAGE = "non.vivriApp.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reto__vivri);
    }

    public void video_Reto(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=fkja0mAf8P4"));
        startActivity(intent);
    }
    public void abrirTips(View view){
        Intent intent = new Intent(this, Reto2.class);
        String message = "tips";
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
    public void abrirPlato(View view){
        Intent intent = new Intent(this, Reto2.class);
        String message = "plato";
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
    public void abrirAlimentos(View view){
        Intent intent = new Intent(this, Reto2.class);
        String message = "alimentos";
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

}
