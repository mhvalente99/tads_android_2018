package mhvalente.com.android2018;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Aula17_2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aula17_2);

        final EditText edCampo1 = findViewById(R.id.ed_texto1);
        final EditText edCampo2 = findViewById(R.id.ed_texto2);
        final EditText edCampo3 = findViewById(R.id.ed_texto3);
        Button btLer = findViewById(R.id.bt_ler17);

        btLer.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                String campo1s = edCampo1.getText().toString();
                String campo2s = edCampo2.getText().toString();
                String campo3s = edCampo3.getText().toString();

                String resultado = campo1s + ", " + campo2s + ", " + campo3s;

                Toast.makeText(Aula17_2.this, resultado, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
