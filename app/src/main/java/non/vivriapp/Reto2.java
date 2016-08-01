package non.vivriapp;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Reto2 extends AppCompatActivity {
    ImageView imageView;
    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reto2);
        LinearLayout layout = (LinearLayout) findViewById(R.id.content);

        Intent intent = getIntent();
        String message = intent.getStringExtra(Reto_Vivri.EXTRA_MESSAGE);



        switch (message){
            case "tips":
                imageView = new ImageView(this);
                imageView.setImageResource(R.drawable.tips1);
                imageView.setAdjustViewBounds(true);
                imageView.setMaxWidth(1000);
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                layout.addView(imageView);

                imageView = new ImageView(this);
                imageView.setImageResource(R.drawable.tips2);
                imageView.setAdjustViewBounds(true);
                imageView.setMaxWidth(1000);
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                layout.addView(imageView);

                break;
            case "plato":
                ImageView imageView = new ImageView(this);
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                imageView.setAdjustViewBounds(true);
                imageView.setMaxWidth(1000);
                imageView.setImageResource(R.drawable.plato);

                layout.addView(imageView);

                textView= new TextView(this);
                textView.setText(R.string.titulo_plato1);
                textView.setPadding(0,16,0,0);
                textView.setTextColor(Color.WHITE);
                textView.setTextSize(22);
                layout.addView(textView);
                textView= new TextView(this);
                textView.setText(R.string.texto_plato1);
                textView.setPadding(0,16,0,0);
                textView.setTextColor(Color.WHITE);
                textView.setTextSize(18);
                layout.addView(textView);
                textView= new TextView(this);
                textView.setText(R.string.titulo_plato2);
                textView.setPadding(0,16,0,0);
                textView.setTextColor(Color.WHITE);
                textView.setTextSize(22);
                layout.addView(textView);
                textView= new TextView(this);
                textView.setText(R.string.texto_plato2);
                textView.setPadding(0,16,0,0);
                textView.setTextColor(Color.WHITE);
                textView.setTextSize(18);
                layout.addView(textView);
                textView= new TextView(this);
                textView.setText(R.string.titulo_plato3);
                textView.setPadding(0,16,0,0);
                textView.setTextColor(Color.WHITE);
                textView.setTextSize(22);
                layout.addView(textView);
                textView= new TextView(this);
                textView.setText(R.string.texto_plato3);
                textView.setPadding(0,16,0,0);
                textView.setTextColor(Color.WHITE);
                textView.setTextSize(18);
                layout.addView(textView);
                textView= new TextView(this);
                textView.setText(R.string.titulo_plato4);
                textView.setPadding(0,16,0,0);
                textView.setTextColor(Color.WHITE);
                textView.setTextSize(22);
                layout.addView(textView);
                textView= new TextView(this);
                textView.setText(R.string.texto_plato4);
                textView.setPadding(0,16,0,0);
                textView.setTextColor(Color.WHITE);
                textView.setTextSize(18);
                layout.addView(textView);
                textView= new TextView(this);
                textView.setText(R.string.titulo_plato5);
                textView.setPadding(0,16,0,0);
                textView.setTextColor(Color.WHITE);
                textView.setTextSize(22);
                layout.addView(textView);
                textView= new TextView(this);
                textView.setText(R.string.texto_plato5);
                textView.setPadding(0,16,0,0);
                textView.setTextColor(Color.WHITE);
                textView.setTextSize(18);
                layout.addView(textView);
                textView= new TextView(this);
                textView.setText(R.string.titulo_plato6);
                textView.setPadding(0,16,0,0);
                textView.setTextColor(Color.WHITE);
                textView.setTextSize(22);
                layout.addView(textView);
                textView= new TextView(this);
                textView.setText(R.string.texto_plato6);
                textView.setPadding(0,16,0,0);
                textView.setTextColor(Color.WHITE);
                textView.setTextSize(18);
                layout.addView(textView);

                break;
            case "alimentos":
                imageView = new ImageView(this);
                imageView.setImageResource(R.drawable.alimentos1);
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                imageView.setAdjustViewBounds(true);
                imageView.setMaxWidth(1000);
                layout.addView(imageView);

                imageView = new ImageView(this);
                imageView.setImageResource(R.drawable.alimentos2);
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                imageView.setAdjustViewBounds(true);
                imageView.setMaxWidth(1000);
                layout.addView(imageView);

                imageView = new ImageView(this);
                imageView.setImageResource(R.drawable.alimentos3);
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                imageView.setAdjustViewBounds(true);
                imageView.setMaxWidth(1000);
                layout.addView(imageView);
                break;
            default:
                break;
        }





    }




}
