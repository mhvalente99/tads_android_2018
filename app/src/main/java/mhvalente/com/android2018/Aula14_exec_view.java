package mhvalente.com.android2018;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextClock;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Aula14_exec_view extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aula14_exec_view);

        final TextView txNome = findViewById(R.id.tx_nome);
        final TextView txCelular = findViewById(R.id.tx_celular14);
        final TextView txEndereco = findViewById(R.id.tx_endereco14);

        final TextView txPressao = findViewById(R.id.tx_pressao);
        final TextView txCardiaco = findViewById(R.id.tx_cardiaco);
        final TextView txFumante = findViewById(R.id.tx_fumante);
        final TextView txAlergico = findViewById(R.id.tx_alergico);

        Intent pesquisar = getIntent();

        if (pesquisar != null) {
            Bundle params = pesquisar.getExtras();

            if (params != null) {
                txNome.setText(params.getString("nome"));
                txEndereco.setText(params.getString("endereco"));
                txCelular.setText(params.getString("celular"));
                txPressao.setText(params.getString("pressao"));
                txCardiaco.setText(params.getString("cardiaco"));
                txFumante.setText(params.getString("fumante"));
                txAlergico.setText(params.getString("alergico"));
            }
        }
    }
}
