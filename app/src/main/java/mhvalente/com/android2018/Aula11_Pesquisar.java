package mhvalente.com.android2018;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Aula11_Pesquisar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aula11__pesquisar);

        final TextView txNome = findViewById(R.id.tx_nome);
        final TextView txEndereco = findViewById(R.id.tx_endereco);
        final TextView txCidade = findViewById(R.id.tx_cidade);

        Intent pesquisar = getIntent();

        if (pesquisar != null) {
            Bundle params = pesquisar.getExtras();

            if (params != null) {
                txNome.setText(params.getString("nome"));
                txEndereco.setText(params.getString("endereco"));
                txCidade.setText(params.getString("cidade"));
            }
        }
    }
}
