package mhvalente.com.android2018;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Aula19 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aula19);

        final EditText edUsuario = (EditText) findViewById(R.id.ed_usuario);
        final EditText edSenha = (EditText) findViewById(R.id.ed_senha);
        Button btAutenticar = (Button) findViewById(R.id.bt_autenticar);

        btAutenticar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nomeS = edUsuario.getText().toString();
                String senhaS = edSenha.getText().toString();

                //Validar com a senha zezinho
                if (senhaS.equals("zezinho")) {
                    Toast.makeText(Aula19.this, "Usuario autenticado", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(Aula19.this, "Usuario não autenticado", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
