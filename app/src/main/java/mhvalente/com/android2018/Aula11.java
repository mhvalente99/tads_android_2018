package mhvalente.com.android2018;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Aula11 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aula11);

        final Button btLer = findViewById(R.id.bt_ler);

        btLer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Aula11.this, Aula11_2.class);
                Bundle params = new Bundle(); // Cria a associacao de varias string para passar para outra tela
                params.putString("msg", "Oi sou Goku");
                it.putExtras(params);

                startActivity(it);
            }
        });

        final  Button btExercicio = findViewById(R.id.exercicio);

        btExercicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent aula11ex = new Intent(Aula11.this, Aula11_Cadastro.class);
                startActivity(aula11ex);
            }
        });
    }
}
