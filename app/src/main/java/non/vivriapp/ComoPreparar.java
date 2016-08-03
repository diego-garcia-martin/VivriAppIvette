package non.vivriapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ComoPreparar extends AppCompatActivity {
    public final static String EXTRA_MESSAGE2 = "non.vivriapp.EXTRA_MESSAGE2";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_como_preparar);
    }

    public void videoComo(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=zcv5XGRN3lc"));
        startActivity(intent);
    }

    public void videoPreguntas(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=djrUrn0-xd4"));
        startActivity(intent);
    }
    public void descripcionShake(View view){
        Intent intent = new Intent(this, Como_Preparar2.class);
        String message = "shake";
        intent.putExtra(EXTRA_MESSAGE2, message);
        startActivity(intent);
    }
    public void descripcionPower(View view){
        Intent intent = new Intent(this, Como_Preparar2.class);
        String message = "power";
        intent.putExtra(EXTRA_MESSAGE2, message);
        startActivity(intent);
    }
    public void descripcionCleanse(View view){
        Intent intent = new Intent(this, Como_Preparar2.class);
        String message = "cleanse";
        intent.putExtra(EXTRA_MESSAGE2, message);
        startActivity(intent);
    }
}
