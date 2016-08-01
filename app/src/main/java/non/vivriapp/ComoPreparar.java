package non.vivriapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.PopupWindow;

public class ComoPreparar extends AppCompatActivity {
    private PopupWindow popupWindow;
    private LinearLayout layout;
    private LayoutInflater layoutInflater;

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

    }
    public void descripcionPower(View view){

    }
    public void descripcionCleanse(View view){

    }
}
