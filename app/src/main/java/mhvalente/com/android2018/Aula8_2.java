package mhvalente.com.android2018;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.media.Image;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Aula8_2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aula8_2);

        getSupportActionBar().setTitle("Imagem - Tela 1");

        ImageView imgRails = (ImageView) findViewById(R.id.img_rails);
        imgRails.setImageResource(R.drawable.rails);

        final Button btVerMaisRails = findViewById(R.id.bt_rails_ver_mais);
        btVerMaisRails.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://rubyonrails.org");
                Intent it = new Intent(Intent.ACTION_VIEW, uri);

                startActivity(it);
            }
        });
    }
}
