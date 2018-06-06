package mhvalente.com.android2018;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Aula10 extends AppCompatActivity {

    private Integer tpConversao = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aula10);

        getSupportActionBar().setTitle("Calculadora Dolar <-> Real");

        final ImageView imgLogo = (ImageView) findViewById(R.id.imgLogo10);
        imgLogo.setImageResource(R.drawable.dolar);

        final EditText edVlCotacao = (EditText) findViewById(R.id.ed_campo10);
        final EditText edQtCotacao = (EditText) findViewById(R.id.ed_campoqt10);
        final TextView lbResultado = (TextView) findViewById(R.id.lb_resultado_10);

        final Button btRealDolar = (Button) findViewById(R.id.bt_real_dolar10);
        final Button btDolarReal = (Button) findViewById(R.id.bt_dolar_real10);
        final Button btCalcular = (Button) findViewById(R.id.bt_calcular10);

        final TextView lbCotacao = (TextView) findViewById(R.id.lb_cotacao);
        final TextView lbQtCotacao = (TextView) findViewById(R.id.lb_qtcotacao);
        final TextView lbValorTotal = (TextView) findViewById(R.id.lb_vltotal10);

        btRealDolar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                lbCotacao.setText("R$ 1 Real");
                lbQtCotacao.setText("$ Quantidade de Dolares");
                lbValorTotal.setText("R$ Valor Total");
                tpConversao =1; //Real Dolar
            }
        });

        btDolarReal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lbCotacao.setText("$ 1 Dolar");
                lbQtCotacao.setText("R$ Quantidade de Reais");
                lbValorTotal.setText("$ Valor Total");
                tpConversao =2;
            }
        });

        btCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double vlCotacao = 0.0;
                Double qtCotacao = 0.0;

                vlCotacao = Double.parseDouble(String.valueOf(edVlCotacao.getText()));
                qtCotacao = Double.parseDouble(String.valueOf(edQtCotacao.getText()));

                Double resultado = 0.0;

                if (tpConversao == 0) {
                    Toast.makeText(Aula10.this, "Escolha um tipo de conversão", Toast.LENGTH_SHORT).show();
                } else if (tpConversao == 1) {
                    resultado = qtCotacao * vlCotacao;
                } else if (tpConversao == 2) {
                    resultado = qtCotacao / vlCotacao;
                }

                lbResultado.setText("" + resultado);


            }
        });
    }
}
