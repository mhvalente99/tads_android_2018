package mhvalente.com.android2018;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Aula8_3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aula8_3);

        getSupportActionBar().setTitle("Imagem - Tela 2");

        ImageView imgReact = (ImageView) findViewById(R.id.img_react);
        imgReact.setImageResource(R.drawable.react);

        final Button btVerMaisReact = findViewById(R.id.bt_react_ver_mais);

        btVerMaisReact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://tableless.com.br/react-native-construa-aplicacaoes-moveis-nativas-com-javascript/");
                Intent it = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(it);
            }
        });

    }
}
