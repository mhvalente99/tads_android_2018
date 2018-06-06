package mhvalente.com.android2018;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Aula7 extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aula7);

        //Button bt1 = new Button(this);
        //bt1.setText("Botao 1");
        //bt1.setWidth(200);
        //bt1.setHeight(200);

        //bt1.setOnClickListener(this);
        //setContentView(bt1);

        final Button bt_tela1 = (Button) findViewById(R.id.bt_tela1);
        final Button bt_tela2 = (Button) findViewById(R.id.bt_tela2);

        final Intent ia71 = new Intent(this, Aula7_2.class);
        final Intent ia72 = new Intent(this, Aula7_3.class);

        bt_tela1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(ia71);
            }
        });

        bt_tela2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(ia72);
            }
        });


    }
}
