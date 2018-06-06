package mhvalente.com.android2018;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Aula8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aula8);

        final Button bt1 = (Button) findViewById(R.id.bt1_aula8);
        bt1.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it1 = new Intent(Aula8.this, Aula8_2.class);
                startActivity(it1);
            }
        });

        final Button bt2 = (Button) findViewById(R.id.bt2_aula8);
        bt2.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it2 = new Intent(Aula8.this, Aula8_3.class);
                startActivity(it2);
            }
        });

    }
}
