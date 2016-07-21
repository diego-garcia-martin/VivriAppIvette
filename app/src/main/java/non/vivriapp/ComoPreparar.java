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
        layout = (LinearLayout)findViewById(R.id.layout_como);
        layoutInflater = (LayoutInflater)getApplicationContext().getSystemService(LAYOUT_INFLATER_SERVICE);
        ViewGroup container = (ViewGroup)layoutInflater.inflate(R.layout.shake_layout,null);
        popupWindow = new PopupWindow(container, 1200, 1800, true);
        popupWindow.showAtLocation(layout, Gravity.NO_GRAVITY, 150, 200);

        container.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                popupWindow.dismiss();
                return true;
            }
        });
    }
    public void descripcionPower(View view){
        layout = (LinearLayout)findViewById(R.id.layout_como);
        layoutInflater = (LayoutInflater)getApplicationContext().getSystemService(LAYOUT_INFLATER_SERVICE);
        ViewGroup container = (ViewGroup)layoutInflater.inflate(R.layout.power_layout,null);
        popupWindow = new PopupWindow(container, 1250, 1900, true);
        popupWindow.showAtLocation(layout, Gravity.NO_GRAVITY, 150, 200);

        container.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                popupWindow.dismiss();
                return true;
            }
        });
    }
    public void descripcionCleanse(View view){
        layout = (LinearLayout)findViewById(R.id.layout_como);
        layoutInflater = (LayoutInflater)getApplicationContext().getSystemService(LAYOUT_INFLATER_SERVICE);
        ViewGroup container = (ViewGroup)layoutInflater.inflate(R.layout.cleanse_layout,null);
        popupWindow = new PopupWindow(container, 1250, 1600, true);
        popupWindow.showAtLocation(layout, Gravity.NO_GRAVITY, 150, 200);

        container.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                popupWindow.dismiss();
                return true;
            }
        });
    }
}
