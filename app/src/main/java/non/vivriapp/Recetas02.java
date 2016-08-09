package non.vivriapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Recetas02 extends AppCompatActivity {
    TextView titulo, ingredientes, preparacion;
    LinearLayout layout;
    String receta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recetas02);
        layout = (LinearLayout)findViewById(R.id.layout_recetas02);
        titulo = (TextView)findViewById(R.id.txt_titulo_receta);
        ingredientes = (TextView)findViewById(R.id.txt_ingredientes);
        preparacion = (TextView)findViewById(R.id.txt_preparacion);

        Intent intent = getIntent();
        receta = intent.getStringExtra(RecetasActivity.EXTRA_RECETA);

        switch (receta){
            case "ensalada1":
                titulo.setText(R.string.ensalada01_titulo);
                ingredientes.setText(R.string.ensalada01_ingredientes);
                preparacion.setText(R.string.ensalada01_preparacion);
                break;
            case "ensalada2":
                titulo.setText(R.string.ensalada02_titulo);
                ingredientes.setText(R.string.ensalada02_ingredientes);
                preparacion.setText(R.string.ensalada02_preparacion);
                break;
            case "ensalada3":
                titulo.setText(R.string.ensalada03_titulo);
                ingredientes.setText(R.string.ensalada03_ingredientes);
                preparacion.setText(R.string.ensalada03_preparacion);
                break;
            case "ensalada4":
                titulo.setText(R.string.ensalada04_titulo);
                ingredientes.setText(R.string.ensalada04_ingredientes);
                preparacion.setText(R.string.ensalada04_preparacion);
                break;
            case "ensalada5":
                titulo.setText(R.string.ensalada05_titulo);
                ingredientes.setText(R.string.ensalada05_ingredientes);
                preparacion.setText(R.string.ensalada05_preparacion);
                break;
            case "ensalada6":
                titulo.setText(R.string.ensalada06_titulo);
                ingredientes.setText(R.string.ensalada06_ingredientes);
                preparacion.setText(R.string.ensalada06_preparacion);
                break;
            case "ensalada7":
                titulo.setText(R.string.ensalada07_titulo);
                ingredientes.setText(R.string.ensalada07_ingredientes);
                preparacion.setText(R.string.ensalada07_preparacion);
                break;
            case "ensalada8":
                titulo.setText(R.string.ensalada08_titulo);
                ingredientes.setText(R.string.ensalada08_ingredientes);
                preparacion.setText(R.string.ensalada08_preparacion);
                break;
            case "ensalada9":
                titulo.setText(R.string.ensalada09_titulo);
                ingredientes.setText(R.string.ensalada09_ingredientes);
                preparacion.setText(R.string.ensalada09_preparacion);
                break;
            case "ensalada10":
                titulo.setText(R.string.ensalada10_titulo);
                ingredientes.setText(R.string.ensalada10_ingredientes);
                preparacion.setText(R.string.ensalada10_preparacion);
                break;
            case "pollo1":
                titulo.setText(R.string.pollo01_titulo);
                ingredientes.setText(R.string.pollo01_ingredientes);
                preparacion.setText(R.string.pollo01_preparacion);
                break;
            case "pollo2":
                titulo.setText(R.string.pollo02_titulo);
                ingredientes.setText(R.string.pollo02_ingredientes);
                preparacion.setText(R.string.pollo02_preparacion);
                break;
            case "pollo3":
                titulo.setText(R.string.pollo03_titulo);
                ingredientes.setText(R.string.pollo03_ingredientes);
                preparacion.setText(R.string.pollo03_preparacion);
                break;
            case "pollo4":
                titulo.setText(R.string.pollo04_titulo);
                ingredientes.setText(R.string.pollo04_ingredientes);
                preparacion.setText(R.string.pollo04_preparacion);
                break;
            case "pollo5":
                titulo.setText(R.string.pollo05_titulo);
                ingredientes.setText(R.string.pollo05_ingredientes);
                preparacion.setText(R.string.pollo05_preparacion);
                break;
            case "pollo6":
                titulo.setText(R.string.pollo06_titulo);
                ingredientes.setText(R.string.pollo06_ingredientes);
                preparacion.setText(R.string.pollo06_preparacion);
                break;
            case "pollo7":
                titulo.setText(R.string.pollo07_titulo);
                ingredientes.setText(R.string.pollo07_ingredientes);
                preparacion.setText(R.string.pollo07_preparacion);
                break;
            case "pollo8":
                titulo.setText(R.string.pollo08_titulo);
                ingredientes.setText(R.string.pollo08_ingredientes);
                preparacion.setText(R.string.pollo08_preparacion);
                break;
            case "pollo9":
                titulo.setText(R.string.pollo09_titulo);
                ingredientes.setText(R.string.pollo09_ingredientes);
                preparacion.setText(R.string.pollo09_preparacion);
                break;
            case "pollo10":
                titulo.setText(R.string.pollo10_titulo);
                ingredientes.setText(R.string.pollo10_ingredientes);
                preparacion.setText(R.string.pollo10_preparacion);
                break;
            case "res1":
                titulo.setText(R.string.res01_titulo);
                ingredientes.setText(R.string.res01_ingredientes);
                preparacion.setText(R.string.res01_preparacion);
                break;
            case "res2":
                titulo.setText(R.string.res02_titulo);
                ingredientes.setText(R.string.res02_ingredientes);
                preparacion.setText(R.string.res02_preparacion);
                break;
            case "res3":
                titulo.setText(R.string.res03_titulo);
                ingredientes.setText(R.string.res03_ingredientes);
                preparacion.setText(R.string.res03_preparacion);
                break;
            case "res4":
                titulo.setText(R.string.res04_titulo);
                ingredientes.setText(R.string.res04_ingredientes);
                preparacion.setText(R.string.res04_preparacion);
                break;
            case "res5":
                titulo.setText(R.string.res05_titulo);
                ingredientes.setText(R.string.res05_ingredientes);
                preparacion.setText(R.string.res05_preparacion);
                break;
            case "res6":
                titulo.setText(R.string.res06_titulo);
                ingredientes.setText(R.string.res06_ingredientes);
                preparacion.setText(R.string.res06_preparacion);
                break;
            case "res7":
                titulo.setText(R.string.res07_titulo);
                ingredientes.setText(R.string.res07_ingredientes);
                preparacion.setText(R.string.res07_preparacion);
                break;
            case "res8":
                titulo.setText(R.string.res08_titulo);
                ingredientes.setText(R.string.res08_ingredientes);
                preparacion.setText(R.string.res08_preparacion);
                break;
            case "cerdo1":
                titulo.setText(R.string.cerdo01_titulo);
                ingredientes.setText(R.string.cerdo01_ingredientes);
                preparacion.setText(R.string.cerdo01_preparacion);
                break;
            case "cerdo2":
                titulo.setText(R.string.cerdo02_titulo);
                ingredientes.setText(R.string.cerdo02_ingredientes);
                preparacion.setText(R.string.cerdo02_preparacion);
                break;
            case "cerdo3":
                titulo.setText(R.string.cerdo03_titulo);
                ingredientes.setText(R.string.cerdo03_ingredientes);
                preparacion.setText(R.string.cerdo03_preparacion);
                break;
            case "pescado1":
                titulo.setText(R.string.pescado01_titulo);
                ingredientes.setText(R.string.pescado01_ingredientes);
                preparacion.setText(R.string.pescado01_preparacion);
                break;
            case "pescado2":
                titulo.setText(R.string.pescado02_titulo);
                ingredientes.setText(R.string.pescado02_ingredientes);
                preparacion.setText(R.string.pescado02_preparacion);
                break;
            case "pescado3":
                titulo.setText(R.string.pescado03_titulo);
                ingredientes.setText(R.string.pescado03_ingredientes);
                preparacion.setText(R.string.pescado03_preparacion);
                break;
            case "pescado4":
                titulo.setText(R.string.pescado04_titulo);
                ingredientes.setText(R.string.pescado04_ingredientes);
                preparacion.setText(R.string.pescado04_preparacion);
                break;
            case "pescado5":
                titulo.setText(R.string.pescado05_titulo);
                ingredientes.setText(R.string.pescado05_ingredientes);
                preparacion.setText(R.string.pescado05_preparacion);
                break;
            case "pescado6":
                titulo.setText(R.string.pescado06_titulo);
                ingredientes.setText(R.string.pescado06_ingredientes);
                preparacion.setText(R.string.pescado06_preparacion);
                break;
            case "pescado7":
                titulo.setText(R.string.pescado07_titulo);
                ingredientes.setText(R.string.pescado07_ingredientes);
                preparacion.setText(R.string.pescado07_preparacion);
                break;
            case "pescado8":
                titulo.setText(R.string.pescado08_titulo);
                ingredientes.setText(R.string.pescado08_ingredientes);
                preparacion.setText(R.string.pescado08_preparacion);
                break;
            case "pescado9":
                titulo.setText(R.string.pescado09_titulo);
                ingredientes.setText(R.string.pescado09_ingredientes);
                preparacion.setText(R.string.pescado09_preparacion);
                break;
            case "pescado10":
                titulo.setText(R.string.pescado10_titulo);
                ingredientes.setText(R.string.pescado10_ingredientes);
                preparacion.setText(R.string.pescado10_preparacion);
                break;
            case "pescado11":
                titulo.setText(R.string.pescado11_titulo);
                ingredientes.setText(R.string.pescado11_ingredientes);
                preparacion.setText(R.string.pescado11_preparacion);
                break;
            case "pescado12":
                titulo.setText(R.string.pescado12_titulo);
                ingredientes.setText(R.string.pescado12_ingredientes);
                preparacion.setText(R.string.pescado12_preparacion);
                break;
            case "pescado13":
                titulo.setText(R.string.pescado13_titulo);
                ingredientes.setText(R.string.pescado13_ingredientes);
                preparacion.setText(R.string.pescado13_preparacion);
                break;
            case "pescado14":
                titulo.setText(R.string.pescado14_titulo);
                ingredientes.setText(R.string.pescado14_ingredientes);
                preparacion.setText(R.string.pescado14_preparacion);
                break;
            case "pescado15":
                titulo.setText(R.string.pescado15_titulo);
                ingredientes.setText(R.string.pescado15_ingredientes);
                preparacion.setText(R.string.pescado15_preparacion);
                break;
            case "pescado16":
                titulo.setText(R.string.pescado16_titulo);
                ingredientes.setText(R.string.pescado16_ingredientes);
                preparacion.setText(R.string.pescado16_preparacion);
                break;
            case "pescado17":
                titulo.setText(R.string.pescado17_titulo);
                ingredientes.setText(R.string.pescado17_ingredientes);
                preparacion.setText(R.string.pescado17_preparacion);
                break;
            case "pescado18":
                titulo.setText(R.string.pescado18_titulo);
                ingredientes.setText(R.string.pescado18_ingredientes);
                preparacion.setText(R.string.pescado18_preparacion);
                break;
            case "pescado19":
                titulo.setText(R.string.pescado19_titulo);
                ingredientes.setText(R.string.pescado19_ingredientes);
                preparacion.setText(R.string.pescado19_preparacion);
                break;
            case "pescado20":
                titulo.setText(R.string.pescado20_titulo);
                ingredientes.setText(R.string.pescado20_ingredientes);
                preparacion.setText(R.string.pescado20_preparacion);
                break;
            case "pescado21":
                titulo.setText(R.string.pescado21_titulo);
                ingredientes.setText(R.string.pescado21_ingredientes);
                preparacion.setText(R.string.pescado21_preparacion);
                break;
            case "pasta1":
                titulo.setText(R.string.pasta01_titulo);
                ingredientes.setText(R.string.pasta01_ingredientes);
                preparacion.setText(R.string.pasta01_preparacion);
                break;
            case "pasta2":
                titulo.setText(R.string.pasta02_titulo);
                ingredientes.setText(R.string.pasta02_ingredientes);
                preparacion.setText(R.string.pasta02_preparacion);
                break;
            case "pasta3":
                titulo.setText(R.string.pasta03_titulo);
                ingredientes.setText(R.string.pasta03_ingredientes);
                preparacion.setText(R.string.pasta03_preparacion);
                break;
            case "pasta4":
                titulo.setText(R.string.pasta04_titulo);
                ingredientes.setText(R.string.pasta04_ingredientes);
                preparacion.setText(R.string.pasta04_preparacion);
                break;
            case "pasta5":
                titulo.setText(R.string.pasta05_titulo);
                ingredientes.setText(R.string.pasta05_ingredientes);
                preparacion.setText(R.string.pasta05_preparacion);
                break;
            case "pasta6":
                titulo.setText(R.string.pasta06_titulo);
                ingredientes.setText(R.string.pasta06_ingredientes);
                preparacion.setText(R.string.pasta06_preparacion);
                break;
            case "pasta7":
                titulo.setText(R.string.pasta07_titulo);
                ingredientes.setText(R.string.pasta07_ingredientes);
                preparacion.setText(R.string.pasta07_preparacion);
                break;
            case "arroz1":
                titulo.setText(R.string.arroz01_titulo);
                ingredientes.setText(R.string.arroz01_ingredientes);
                preparacion.setText(R.string.arroz01_preparacion);
                break;
            case "arroz2":
                titulo.setText(R.string.arroz02_titulo);
                ingredientes.setText(R.string.arroz02_ingredientes);
                preparacion.setText(R.string.arroz02_preparacion);
                break;
            case "arroz3":
                titulo.setText(R.string.arroz03_titulo);
                ingredientes.setText(R.string.arroz03_ingredientes);
                preparacion.setText(R.string.arroz03_preparacion);
                break;
            case "arroz4":
                titulo.setText(R.string.arroz04_titulo);
                ingredientes.setText(R.string.arroz04_ingredientes);
                preparacion.setText(R.string.arroz04_preparacion);
                break;
            case "arroz5":
                titulo.setText(R.string.arroz05_titulo);
                ingredientes.setText(R.string.arroz05_ingredientes);
                preparacion.setText(R.string.arroz05_preparacion);
                break;
            case "arroz6":
                titulo.setText(R.string.arroz06_titulo);
                ingredientes.setText(R.string.arroz06_ingredientes);
                preparacion.setText(R.string.arroz06_preparacion);
                break;
            case "bocadillo1":
                titulo.setText(R.string.bocadillo01_titulo);
                ingredientes.setText(R.string.bocadillo01_ingredientes);
                preparacion.setText(R.string.bocadillo01_preparacion);
                break;
            case "bocadillo2":
                titulo.setText(R.string.bocadillo02_titulo);
                ingredientes.setText(R.string.bocadillo02_ingredientes);
                preparacion.setText(R.string.bocadillo02_preparacion);
                break;
            case "bocadillo3":
                titulo.setText(R.string.bocadillo03_titulo);
                ingredientes.setText(R.string.bocadillo03_ingredientes);
                preparacion.setText(R.string.bocadillo03_preparacion);
                break;
            case "bocadillo4":
                titulo.setText(R.string.bocadillo04_titulo);
                ingredientes.setText(R.string.bocadillo04_ingredientes);
                preparacion.setText(R.string.bocadillo04_preparacion);
                break;
            case "bocadillo5":
                titulo.setText(R.string.bocadillo05_titulo);
                ingredientes.setText(R.string.bocadillo05_ingredientes);
                preparacion.setText(R.string.bocadillo05_preparacion);
                break;
            case "bocadillo6":
                titulo.setText(R.string.bocadillo06_titulo);
                ingredientes.setText(R.string.bocadillo06_ingredientes);
                preparacion.setText(R.string.bocadillo06_preparacion);
                break;
            case "bocadillo7":
                titulo.setText(R.string.bocadillo07_titulo);
                ingredientes.setText(R.string.bocadillo07_ingredientes);
                preparacion.setText(R.string.bocadillo07_preparacion);
                break;
            case "bocadillo8":
                titulo.setText(R.string.bocadillo08_titulo);
                ingredientes.setText(R.string.bocadillo08_ingredientes);
                preparacion.setText(R.string.bocadillo08_preparacion);
                break;
            case "bocadillo9":
                titulo.setText(R.string.bocadillo09_titulo);
                ingredientes.setText(R.string.bocadillo09_ingredientes);
                preparacion.setText(R.string.bocadillo09_preparacion);
                break;
            case "bocadillo10":
                titulo.setText(R.string.bocadillo10_titulo);
                ingredientes.setText(R.string.bocadillo10_ingredientes);
                preparacion.setText(R.string.bocadillo10_preparacion);
                break;
            case "bocadillo11":
                titulo.setText(R.string.bocadillo11_titulo);
                ingredientes.setText(R.string.bocadillo11_ingredientes);
                preparacion.setText(R.string.bocadillo11_preparacion);
                break;
            case "bocadillo12":
                titulo.setText(R.string.bocadillo12_titulo);
                ingredientes.setText(R.string.bocadillo12_ingredientes);
                preparacion.setText(R.string.bocadillo12_preparacion);
                break;
            case "bocadillo13":
                titulo.setText(R.string.bocadillo13_titulo);
                ingredientes.setText(R.string.bocadillo13_ingredientes);
                preparacion.setText(R.string.bocadillo13_preparacion);
                break;
            case "bocadillo14":
                titulo.setText(R.string.bocadillo14_titulo);
                ingredientes.setText(R.string.bocadillo14_ingredientes);
                preparacion.setText(R.string.bocadillo14_preparacion);
                break;
            case "bocadillo15":
                titulo.setText(R.string.bocadillo15_titulo);
                ingredientes.setText(R.string.bocadillo15_ingredientes);
                preparacion.setText(R.string.bocadillo15_preparacion);
                break;
            case "bocadillo16":
                titulo.setText(R.string.bocadillo16_titulo);
                ingredientes.setText(R.string.bocadillo16_ingredientes);
                preparacion.setText(R.string.bocadillo16_preparacion);
                break;
            case "sopa1":
                titulo.setText(R.string.sopa01_titulo);
                ingredientes.setText(R.string.sopa01_ingredientes);
                preparacion.setText(R.string.sopa01_preparacion);
                break;
            case "sopa2":
                titulo.setText(R.string.sopa02_titulo);
                ingredientes.setText(R.string.sopa02_ingredientes);
                preparacion.setText(R.string.sopa02_preparacion);
                break;
            case "sopa3":
                titulo.setText(R.string.sopa03_titulo);
                ingredientes.setText(R.string.sopa03_ingredientes);
                preparacion.setText(R.string.sopa03_preparacion);
                break;
            case "sopa4":
                titulo.setText(R.string.sopa04_titulo);
                ingredientes.setText(R.string.sopa04_ingredientes);
                preparacion.setText(R.string.sopa04_preparacion);
                break;
            case "sopa5":
                titulo.setText(R.string.sopa05_titulo);
                ingredientes.setText(R.string.sopa05_ingredientes);
                preparacion.setText(R.string.sopa05_preparacion);
                break;
            case "sopa6":
                titulo.setText(R.string.sopa06_titulo);
                ingredientes.setText(R.string.sopa06_ingredientes);
                preparacion.setText(R.string.sopa06_preparacion);
                break;
            case "sopa7":
                titulo.setText(R.string.sopa07_titulo);
                ingredientes.setText(R.string.sopa07_ingredientes);
                preparacion.setText(R.string.sopa07_preparacion);
                break;
            case "sopa8":
                titulo.setText(R.string.sopa08_titulo);
                ingredientes.setText(R.string.sopa08_ingredientes);
                preparacion.setText(R.string.sopa08_preparacion);
                break;
            case "sopa9":
                titulo.setText(R.string.sopa09_titulo);
                ingredientes.setText(R.string.sopa09_ingredientes);
                preparacion.setText(R.string.sopa09_preparacion);
                break;
            default:
                break;
        }


    }
}
