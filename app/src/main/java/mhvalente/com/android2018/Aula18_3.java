package mhvalente.com.android2018;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Aula18_3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aula18_3);

        final Button btComprar = findViewById(R.id.bt_comprar18);
        final TextView txProduto = findViewById(R.id.tx_dsproduto);

        btComprar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txProduto.setText("Teste de Novo Produto");
            }
        });


    }
}
