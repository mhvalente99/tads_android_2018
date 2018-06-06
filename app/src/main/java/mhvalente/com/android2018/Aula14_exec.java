package mhvalente.com.android2018;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class Aula14_exec extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aula14_exec);

        final EditText edNome = (EditText) findViewById(R.id.ed_nome14);
        final EditText edEndereco = (EditText) findViewById(R.id.ed_endereco14);
        final EditText edCelular = (EditText) findViewById(R.id.ed_celular);

        final CheckBox ckPressao = (CheckBox) findViewById(R.id.ckPressao);
        final CheckBox ckCardiaco = (CheckBox) findViewById(R.id.ckCardiaco);
        final CheckBox ckFumante = (CheckBox) findViewById(R.id.ckFumante);
        final CheckBox ckAlergico = (CheckBox) findViewById(R.id.ckAlergico);

        final Button btCadastrar = (Button) findViewById(R.id.bt_cadastrar_14);

        btCadastrar.setOnClickListener(new View.OnClickListener() {
            String inPressao, inCardiaco, inFumante, inAlergico;
            String nome, celular, endereco;

            @Override
            public void onClick(View v) {
                nome = edNome.getText().toString();
                celular = edCelular.getText().toString();
                endereco = edEndereco.getText().toString();

                if (ckPressao.isChecked()){
                    inPressao = "Pressao Alta";
                } else {
                    inPressao = "";
                }

                if (ckCardiaco.isChecked()) {
                    inCardiaco = "Cardiaco";
                } else {
                    inCardiaco = "";
                }

                if (ckFumante.isChecked()) {
                    inFumante = "Fumante";
                } else {
                    inFumante = "";
                }

                if (ckAlergico.isChecked()){
                    inAlergico = "Alergico";
                } else {
                    inAlergico = "";
                }

                Intent i1 = new Intent(Aula14_exec.this, Aula14_exec_view.class);
                Bundle params = new Bundle();

                params.putString("nome", nome);
                params.putString("endereco", endereco);
                params.putString("celular", celular);
                params.putString("pressao", inPressao);
                params.putString("cardiaco", inCardiaco);
                params.putString("fumante", inFumante);
                params.putString("alergico", inAlergico);

                i1.putExtras(params);

                startActivity(i1);

            }
        });


    }
}
