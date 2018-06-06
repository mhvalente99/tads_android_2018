package mhvalente.com.android2018;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Aula20 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aula20);

        final EditText edUsuario = (EditText) findViewById(R.id.edUsuario);
        final EditText edSenha = (EditText) findViewById(R.id.edSenha);
        Button btEntrar = (Button) findViewById(R.id.btLogin);
        Button btParte2 = findViewById(R.id.btParte2);

        btEntrar.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nome = edUsuario.getText().toString();
                String senha = edSenha.getText().toString();
                String msg = "";

                if (nome.equals("Ze") && (senha.equals("Bob"))){
                    msg = "Usuário Autenticado";
                } else {
                    msg = "Login ou senha incorreto(s)";
                }

                if (!msg.equals("")){
                    Toast.makeText(Aula20.this, msg, Toast.LENGTH_SHORT).show();
                }
            }
        });

        btParte2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2 = new Intent(Aula20.this, Aula20_2.class);
                startActivity(i2);
            }
        });
    }
}
