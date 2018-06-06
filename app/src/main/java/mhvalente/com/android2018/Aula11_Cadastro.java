package mhvalente.com.android2018;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Aula11_Cadastro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aula11__cadastro);

        final Button btCadastrar = findViewById(R.id.bt_cadastrar);
        final EditText edNome = findViewById(R.id.ed_nome1);
        final EditText edCidade = findViewById(R.id.ed_cidade);
        final EditText edEndereco = findViewById(R.id.ed_endereco);

        btCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edNome.getText().toString().equals("")){
                    Toast.makeText(Aula11_Cadastro.this, "Preencha o campo nome", Toast.LENGTH_SHORT).show();
                    edNome.requestFocus();
                } else if (edEndereco.getText().toString().equals("")) {
                    Toast.makeText(Aula11_Cadastro.this, "Preencha o campo endereço", Toast.LENGTH_SHORT).show();
                    edEndereco.requestFocus();
                } else if (edCidade.getText().toString().equals("")) {
                    Toast.makeText(Aula11_Cadastro.this, "Preencha o campo cidade", Toast.LENGTH_SHORT).show();
                    edCidade.requestFocus();
                } else {

                    Intent pesq = new Intent(Aula11_Cadastro.this, Aula11_Pesquisar.class);
                    Bundle params = new Bundle();

                    String nome = edNome.getText().toString();
                    String cidade = edCidade.getText().toString();
                    String endereco = edEndereco.getText().toString();

                    params.putString("nome", nome);
                    params.putString("endereco", endereco);
                    params.putString("cidade", cidade);

                    pesq.putExtras(params);

                    startActivity(pesq);
                }
            }
        });
    }
}
