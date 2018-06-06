package mhvalente.com.android2018;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Aula18 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aula18);

        Button btTela2 = findViewById(R.id.btTela2);
        Button btTela3 = findViewById(R.id.btTela3);

        btTela2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2 = new Intent(Aula18.this, Aula18_2.class);
                startActivity(i2);
            }
        });

        btTela3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i3 = new Intent(Aula18.this, Aula18_3.class);
                startActivity(i3);
            }
        });

    }
}
