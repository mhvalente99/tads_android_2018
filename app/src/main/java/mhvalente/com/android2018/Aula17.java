package mhvalente.com.android2018;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Aula17 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aula17);

        final EditText edNome = (EditText) findViewById(R.id.ed_nome17);
        final EditText edEmail = (EditText) findViewById(R.id.ed_email);
        final EditText edObs = (EditText) findViewById(R.id.ed_obsevacao);
        final Button btEnviar = (Button) findViewById(R.id.bt_enviar17);
        final Button btParte2 = findViewById(R.id.bt_parte2);
        final Button btParte3 = findViewById(R.id.bt_parte3);

        btEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nome = edNome.getText().toString();
                String email = edEmail.getText().toString();
                String obs = edObs.getText().toString();

                String resultado = nome + ", " + email + ", " + obs;
                Toast.makeText(Aula17.this, resultado, Toast.LENGTH_SHORT).show();
            }
        });

        btParte2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent part2 = new Intent(Aula17.this, Aula17_2.class);
                startActivity(part2);
            }
        });

        btParte3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent part3 = new Intent(Aula17.this, Aula17_3.class);
                startActivity(part3);
            }
        });
    }
}
