package mhvalente.com.android2018;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Aula16_Exercicio extends AppCompatActivity {

    public static String codigo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aula16__exercicio);

        final EditText edNomeProd = findViewById(R.id.ed_nomepro);
        final EditText edQuantidade = findViewById(R.id.ed_quantidade);

        Button btLerCodigo = findViewById(R.id.bt_ler_codigo);
        Button btMostrarProd = findViewById(R.id.bt_mostrar_prod);

        btLerCodigo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("com.google.zxing.client.android.SCAN");
                startActivityForResult(intent, 0);
            }
        });

        btMostrarProd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nomePro = edNomeProd.getText().toString();
                String quantPro = edQuantidade.getText().toString();

                Toast.makeText(Aula16_Exercicio.this, "Nome: " + nomePro + ", Quantidade: " + quantPro + ", Codigo de Barras: " + codigo, Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void onActivityResult(int requestCode, int resultCode, Intent intent) {
        if (requestCode == 0) {
            TextView txCodigoBarras = findViewById(R.id.tx_codigo_barras);
            String numero = intent.getStringExtra("SCAN_RESULT");
            txCodigoBarras.setText(numero);
            codigo = numero;
        }
    }
}
