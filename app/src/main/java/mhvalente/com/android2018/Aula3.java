package mhvalente.com.android2018;

import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Aula3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aula3);

        final EditText ed_nome = (EditText) findViewById(R.id.ed_nome);
        final Button bt_limpar = (Button) findViewById(R.id.bt_limpar);
        final EditText ed_sobrenome = (EditText) findViewById(R.id.ed_sobrenome);
        final Button bt_mostrar = (Button) findViewById(R.id.bt_mostrar);
        final TextView lb_mostrar = (TextView) findViewById(R.id.ed_resultado);

        bt_mostrar.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {

                String nome1 = ed_nome.getText().toString();
                String nome2 = ed_sobrenome.getText().toString();

                if (nome1.equals("")) {
                    Toast.makeText(Aula3.this, "Digite o nome", Toast.LENGTH_SHORT).show();
                    ed_nome.requestFocus();
                } else if (nome2.equals("")){
                    Toast.makeText(Aula3.this, "Digite o sobrenome", Toast.LENGTH_SHORT).show();
                    ed_sobrenome.requestFocus();
                } else {
                    lb_mostrar.setText(nome1 + " " + nome2);
                }
            }
        });

        bt_limpar.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                ed_nome.setText("");
                ed_sobrenome.setText("");
                lb_mostrar.setText("");
                ed_nome.requestFocus();
            }
        });
    }
}
