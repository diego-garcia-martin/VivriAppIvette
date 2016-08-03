package non.vivriapp;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Como_Preparar2 extends AppCompatActivity {
    ImageView imageView;
    TextView textView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_como__preparar2);
        LinearLayout layout = (LinearLayout) findViewById(R.id.content2);

        Intent intent = getIntent();
        String message = intent.getStringExtra(ComoPreparar.EXTRA_MESSAGE2);

        switch(message){
            case "shake":
                imageView = new ImageView(this);
                imageView.setImageResource(R.drawable.shakeinfo);
                imageView.setAdjustViewBounds(true);
                imageView.setMaxWidth(1000);
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                layout.addView(imageView);

                textView = new TextView(this);
                textView.setText(R.string.shake_titulo);
                textView.setTextColor(Color.WHITE);
                textView.setTextSize(22);
                textView.setPadding(0, 16, 0, 0);
                layout.addView(textView);
                textView = new TextView(this);
                textView.setText(R.string.shake_subtitulo);
                textView.setTextColor(Color.WHITE);
                textView.setTextSize(20);
                textView.setPadding(0, 16, 0, 0);
                layout.addView(textView);
                textView = new TextView(this);
                textView.setText(R.string.shake_texto);
                textView.setTextColor(Color.WHITE);
                textView.setTextSize(18);
                textView.setPadding(0, 16, 0, 0);
                layout.addView(textView);
                break;
            case "power":
                imageView = new ImageView(this);
                imageView.setImageResource(R.drawable.powerinfo);
                imageView.setAdjustViewBounds(true);
                imageView.setMaxWidth(1000);
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                layout.addView(imageView);

                textView = new TextView(this);
                textView.setText(R.string.power_titulo);
                textView.setTextColor(Color.WHITE);
                textView.setTextSize(22);
                textView.setPadding(0, 16, 0, 0);
                layout.addView(textView);
                textView = new TextView(this);
                textView.setText(R.string.power_subtitulo);
                textView.setTextColor(Color.WHITE);
                textView.setTextSize(20);
                textView.setPadding(0, 16, 0, 0);
                layout.addView(textView);
                textView = new TextView(this);
                textView.setText(R.string.power_texto);
                textView.setTextColor(Color.WHITE);
                textView.setTextSize(18);
                textView.setPadding(0, 16, 0, 0);
                layout.addView(textView);
                break;
            case "cleanse":
                imageView = new ImageView(this);
                imageView.setImageResource(R.drawable.cleanseinfo);
                imageView.setAdjustViewBounds(true);
                imageView.setMaxWidth(1000);
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                layout.addView(imageView);

                textView = new TextView(this);
                textView.setText(R.string.cleanse_titulo);
                textView.setTextColor(Color.WHITE);
                textView.setTextSize(22);
                textView.setPadding(0, 16, 0, 0);
                layout.addView(textView);
                textView = new TextView(this);
                textView.setText(R.string.cleanse_subtitulo);
                textView.setTextColor(Color.WHITE);
                textView.setTextSize(20);
                textView.setPadding(0, 16, 0, 0);
                layout.addView(textView);
                textView = new TextView(this);
                textView.setText(R.string.cleanse_texto);
                textView.setTextColor(Color.WHITE);
                textView.setTextSize(18);
                textView.setPadding(0, 16, 0, 0);
                layout.addView(textView);

                break;
            default:
                break;
        }
    }
}
