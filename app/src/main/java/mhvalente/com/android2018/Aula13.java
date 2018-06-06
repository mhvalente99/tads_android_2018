package mhvalente.com.android2018;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Aula13 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aula13);

        getSupportActionBar().setTitle("Cotação Dolar <-> Real");

        final RadioGroup rgGroup = findViewById(R.id.rgCotacao);

        final TextView lbCot = findViewById(R.id.lb_cot);
        final EditText edVlCot = findViewById(R.id.ed_valuecot);
        final TextView lbQtCot = findViewById(R.id.lb_qtcot);
        final EditText edQtCot = findViewById(R.id.ed_qtcod);
        final Button btCalc = findViewById(R.id.bt_calcular_13);
        final TextView lbResult = findViewById(R.id.lb_result);

        rgGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.rbDolarToReal) {
                    lbCot.setText("Cotação $");
                    edVlCot.setHint("Cotação 1 $");

                    lbQtCot.setText("Quantidade $");
                    edQtCot.setHint("Quantide de $");
                } else if (checkedId == R.id.rbRealToDolar) {
                    lbCot.setText("Cotação $");
                    edVlCot.setHint("Cotação 1 $");

                    lbQtCot.setText("Quantidade R$");
                    edQtCot.setHint("Quantide de R$");
                }
            }
        });

        btCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edVlCot.getText().toString().equals("")) {
                    Toast.makeText(Aula13.this, "É necessario informar o valor da cotação", Toast.LENGTH_SHORT).show();
                    edVlCot.requestFocus();
                    return;
                }

                if (edQtCot.getText().toString().equals("")) {
                    Toast.makeText(Aula13.this, "É necessario informar a quantidade", Toast.LENGTH_SHORT).show();
                    edQtCot.requestFocus();
                    return;
                }

                Double vlCot = Double.parseDouble(edVlCot.getText().toString());
                Double qtCot = Double.parseDouble(edQtCot.getText().toString());
                Boolean tpEsc = false;
                Double resultado = 0.0;

                if (rgGroup.getCheckedRadioButtonId() == R.id.rbDolarToReal) {
                    tpEsc = true;
                    resultado = qtCot * vlCot;
                } else if (rgGroup.getCheckedRadioButtonId() == R.id.rbRealToDolar) {
                    tpEsc = false;
                    resultado = qtCot / vlCot;
                }

                if (tpEsc) {
                    lbResult.setText("R$ " + resultado);
                } else {
                    lbResult.setText("$ " + resultado);
                }
            }
        });

    }
}
