package non.vivriapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Videos_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_videos_activity);
    }

    public void open_video01(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=AmjTiu9Gsm0"));
        startActivity(intent);
    }

    public void open_video02(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=_BiXhyATMDs"));
        startActivity(intent);
    }

    public void open_video03(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=iLiwb-P93y8"));
        startActivity(intent);
    }

    public void open_video04(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=7yVNTCXHuzg"));
        startActivity(intent);
    }

    public void open_video05(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=aqpF5dYnoOA"));
        startActivity(intent);
    }

    public void open_video6(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=zip9SOhhB-Q"));
        startActivity(intent);
    }

    public void open_video07(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=gTW8IZv6XtE"));
        startActivity(intent);
    }

    public void open_video08(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=79D05wVPTk8"));
        startActivity(intent);
    }

    public void open_video09(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=xfSCsUPfddw"));
        startActivity(intent);
    }

    public void open_video10(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=3jEG08JbzPU"));
        startActivity(intent);
    }

    public void open_video11(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=X9WcQju0PHU"));
        startActivity(intent);
    }

    public void open_video12(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=43aVkHoZ4Ck"));
        startActivity(intent);
    }

    public void open_video13(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=ZV_Urye2Rb8"));
        startActivity(intent);
    }

    public void open_video14(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=9u7b93YCel4"));
        startActivity(intent);
    }

    public void open_video15(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=3GpWD6ScyRw"));
        startActivity(intent);
    }

    public void open_video16(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=Mc4LzjpX39c"));
        startActivity(intent);
    }

    public void open_video17(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=E9oZjQRiHt4"));
        startActivity(intent);
    }

    public void open_video18(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=nOewEYbHQKU"));
        startActivity(intent);
    }

    public void open_video19(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=b6pe5GBGHpY"));
        startActivity(intent);
    }

    public void open_video20(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=WJ0pRQbP8r0"));
        startActivity(intent);
    }

    public void abrir_canal(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/channel/UCGiBGRsFPFTro4QnpFT-KQg"));
        startActivity(intent);
    }
}
