package mhvalente.com.android2018;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class Aula5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aula5);

        getSupportActionBar().setTitle("Calculadora");

        final EditText ed1 = (EditText) findViewById(R.id.ed_campo15);
        final EditText ed2 = (EditText) findViewById(R.id.ed_campo25);
        final Button bt_calc = (Button) findViewById(R.id.bt_calcular_5);
        final Button bt_limp = (Button) findViewById(R.id.bt_limpar_5);
        final TextView lb_resultado = (TextView) findViewById(R.id.lb_resultado_5);


        bt_calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ed1.getText().equals("")){
                    Toast.makeText(Aula5.this, "Preencha o campo Valor 1", Toast.LENGTH_SHORT).show();
                    ed1.requestFocus();
                }
                else if (ed2.getText().equals("")){
                    Toast.makeText(Aula5.this, "Preencha o campo Valor 2", Toast.LENGTH_SHORT).show();
                    ed2.requestFocus();
                } else {

                    double vl1 = Double.parseDouble(ed1.getText().toString());
                    double vl2 = Double.parseDouble(ed2.getText().toString());

                    lb_resultado.setText(String.format("%.2f", vl1 + vl2));

                    try {
                        Thread.sleep(5000);


                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        bt_limp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lb_resultado.setText("");
                ed1.setText("");
                ed2.setText("");

                ed1.requestFocus();
            }
        });
    }
}
