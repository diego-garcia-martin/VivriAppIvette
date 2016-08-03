package non.vivriapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Recetas02 extends AppCompatActivity {
    TextView textView;
    LinearLayout layout;
    String receta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recetas02);
        layout = (LinearLayout)findViewById(R.id.layout_recetas02);

        Intent intent = getIntent();
        String receta = intent.getStringExtra(RecetasActivity.EXTRA_RECETA);


    }
}
