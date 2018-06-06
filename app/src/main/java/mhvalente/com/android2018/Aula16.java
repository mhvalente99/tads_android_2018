package mhvalente.com.android2018;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Aula16 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aula16);

        Button btLer = (Button) findViewById(R.id.bt_lertexto);
        btLer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("com.google.zxing.client.android.SCAN");
                startActivityForResult(intent, 0);
            }
        });

        Button btExercicio = findViewById(R.id.bt_exec_aula16);
        btExercicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iexec = new Intent(Aula16.this, Aula16_Exercicio.class);
                startActivity(iexec);
            }
        });
    }

    public void onActivityResult(int requestCode, int resultCode, Intent intent) {
        if (requestCode == 0) {
            String numero = intent.getStringExtra("SCAN_RESULT");
            TextView textoResultado = (TextView) findViewById(R.id.tx_resultado);
            textoResultado.setText(numero);
        }
    }
}
