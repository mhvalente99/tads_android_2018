package mhvalente.com.android2018;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.nio.DoubleBuffer;

public class Aula9 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aula9);

        final TextView lbResultado = (TextView) findViewById(R.id.lb_resultado_9);
        final Button btCalcular = (Button) findViewById(R.id.bt_calcular9);

        final EditText edVlDolar = (EditText) findViewById(R.id.ed_campo9);
        final EditText edQtDolar = (EditText) findViewById(R.id.ed_campoqt9);

        btCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double vlDolar = Double.parseDouble(String.valueOf(edVlDolar.getText()));
                Double qtDolar = Double.parseDouble(String.valueOf(edQtDolar.getText()));
                Double resultado = 0.0;

                resultado = vlDolar * qtDolar;

                lbResultado.setText("R$ " + resultado);
            }
        });
    }
}
