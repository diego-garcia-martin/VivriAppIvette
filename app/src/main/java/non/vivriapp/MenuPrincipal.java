package non.vivriapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.PopupMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

public class MenuPrincipal extends AppCompatActivity {
    private ImageButton testimonios;
    private ImageButton comoPreparar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_principal);
        testimonios = (ImageButton)findViewById(R.id.btn_testimonios);
        comoPreparar = (ImageButton)findViewById(R.id.btn_como);
        testimonios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://retovivri.com/historias-vivri-new-englishh/"));
                startActivity(intent);
            }
        });

    }

    public void paisCompras(View view){
        PopupMenu popupMenu = new PopupMenu(this, view);
        MenuInflater inflater = popupMenu.getMenuInflater();
        inflater.inflate(R.menu.menu_compras, popupMenu.getMenu());
        popupMenu.show();

        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                if(item.getItemId() == R.id.comprasMexico){
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://it.vivri.com/shop/index.php?SPONSORID=70683&pais=1&display=1#modal1"));
                    startActivity(intent);
                }
                else if(item.getItemId() == R.id.comprasUSA){
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://it.vivri.com/shop/index.php?SPONSORID=70683&pais=2&display=1#modal1"));
                    startActivity(intent);
                }
                return true;
            }
        });
    }

    public void paisInscribete(View view){
        PopupMenu popupMenu = new PopupMenu(this, view);
        MenuInflater inflater = popupMenu.getMenuInflater();
        inflater.inflate(R.menu.menu_inscribete, popupMenu.getMenu());
        popupMenu.show();

        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                if(item.getItemId() == R.id.inscribeteMexico){
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://it.vivri.com/inscripciones/enrollmentmx.php?DealerID=70683"));
                    startActivity(intent);
                }
                else if(item.getItemId() == R.id.inscribeteUSA){
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://it.vivri.com/inscripciones/enrollmentus.php?DealerID=70683"));
                    startActivity(intent);
                }
                return true;
            }
        });
    }

    public void abrirComo(View view){
        Intent intent = new Intent(this, ComoPreparar.class);
        startActivity(intent);
    }

    public void open_video(View view){
        Intent intent = new Intent(this, Videos_activity.class);
        startActivity(intent);
    }

    public void abrir_recetas(View view){
        Intent intent = new Intent (this, RecetasActivity.class);
        startActivity(intent);
    }

    public void abrir_reto(View view){
        Intent intent = new Intent(this, Reto_Vivri.class);
        startActivity(intent);
    }
}
