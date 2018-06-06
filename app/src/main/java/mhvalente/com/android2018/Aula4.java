package mhvalente.com.android2018;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Aula4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aula4);

        final EditText ed_vl1 = (EditText) findViewById(R.id.ed_campo1);
        final EditText ed_vl2 = (EditText) findViewById(R.id.ed_campo2);
        final Button bt_calcular = (Button) findViewById(R.id.bt_calcular);

        final RadioGroup rgEscolha = (RadioGroup) findViewById(R.id.rg_escolhaop);
        final TextView lbResultado = (TextView) findViewById(R.id.lb_resultado_calc);

        final Button bt_resto = (Button) findViewById(R.id.bt_resto);
        final Button bt_mod = (Button) findViewById(R.id.bt_mod);

        bt_calcular.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String valor1 = ed_vl1.getText().toString();
                String valor2 = ed_vl2.getText().toString();

                if (valor1.equals("")){
                    Toast.makeText(Aula4.this, "O campo Valor 1 deve ser preenchido", Toast.LENGTH_SHORT).show();
                    ed_vl1.requestFocus();

                } else if (valor2.equals("")) {
                    Toast.makeText(Aula4.this, "O campo Valor 2 deve ser preenchido", Toast.LENGTH_SHORT).show();
                    ed_vl2.requestFocus();

                } else {
                    Double vl1 = Double.parseDouble(valor1);
                    Double vl2 = Double.parseDouble(valor2);
                    Double resultado = 0.0;

                    if (rgEscolha.getCheckedRadioButtonId() == R.id.rb_somar) {
                        resultado = vl1 + vl2;

                    } else if (rgEscolha.getCheckedRadioButtonId() == R.id.rb_subtrair) {
                        resultado = vl1 - vl2;

                    } else if (rgEscolha.getCheckedRadioButtonId() == R.id.rb_multiplicar) {
                        resultado = vl1 * vl2;
                    } else if (rgEscolha.getCheckedRadioButtonId() == R.id.rb_dividir) {
                        if (vl2 > vl1) {
                            resultado = 0.0;
                        } else {
                            resultado = vl1/vl2;
                        }
                    }

                    lbResultado.setText(resultado + "");
                }
            }
        });

        bt_resto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String valor1 = ed_vl1.getText().toString();
                String valor2 = ed_vl2.getText().toString();

                Double vl1 = Double.parseDouble(valor1);
                Double vl2 = Double.parseDouble(valor2);
                Double resultado = 0.0;

                resultado = vl1 % vl2;

                lbResultado.setText(resultado + "");

            }
        });

        bt_mod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String valor1 = ed_vl1.getText().toString();
                Double vl1 = Double.parseDouble(valor1);

                Double resultado = 0.0;

                resultado = Math.abs(vl1);

                lbResultado.setText(resultado + "");
            }
        });
    }
}
