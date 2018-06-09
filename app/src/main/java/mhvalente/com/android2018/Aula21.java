package mhvalente.com.android2018;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.PasswordTransformationMethod;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;

public class Aula21 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_aula21);

        TableLayout tabela = new TableLayout(this);

        tabela.setLayoutParams(new TableLayout.LayoutParams(
                TableLayout.LayoutParams.MATCH_PARENT,
                TableLayout.LayoutParams.MATCH_PARENT));

        tabela.setColumnStretchable(1, true);
        tabela.setPadding(16, 16,16,16);

        TableRow linha1 = new TableRow(this);

        final TextView tNome = new TextView(this);
        tNome.setText("Nome: ");

        linha1.addView(tNome);

        final EditText eNome = new EditText(this);
        eNome.requestFocus();

        linha1.addView(eNome);

        TableRow linha2 = new TableRow(this);

        final TextView tSenha = new TextView(this);
        tSenha.setText("Senha: ");

        linha2.addView(tSenha);

        final EditText eSenha = new EditText(this);
        eSenha.setTransformationMethod(new PasswordTransformationMethod());

        linha2.addView(eSenha);

        TableRow linha3 = new TableRow(this);

        Button bValidar = new Button(this);
        bValidar.setText("Validar");

        linha3.setGravity(Gravity.RIGHT);
        linha3.addView(bValidar);

        TableRow linha4 = new TableRow(this);
        linha4.setGravity(Gravity.RIGHT);

        Button bParte2 = new Button(this);
        bParte2.setText("Parte 2");

        linha4.addView(bParte2);

        tabela.addView(linha1);
        tabela.addView(linha2);
        tabela.addView(linha3);
        tabela.addView(linha4);

        setContentView(tabela);

        bValidar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nome = eNome.getText().toString();
                String senha = eSenha.getText().toString();

                if (nome.equals("Ze") && senha.equals("123")){
                    Toast.makeText(Aula21.this, "Usuario autenticado", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(Aula21.this, "Usuario ou senha incorreto(s)", Toast.LENGTH_SHORT).show();
                }
            }
        });

        bParte2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2 = new Intent(Aula21.this, Aula21_2.class);
                startActivity(i2);
            }
        });
    }
}
