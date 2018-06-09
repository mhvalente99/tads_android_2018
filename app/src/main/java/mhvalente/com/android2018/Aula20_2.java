package mhvalente.com.android2018;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Aula20_2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout l1 = new LinearLayout(this);
        l1.setOrientation(LinearLayout.VERTICAL);
        l1.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT
        ));

        l1.setPadding(10,10,10,10);


        TextView tNome = new TextView(this);

        tNome.setText("Nome: ");
        tNome.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
        ));

        l1.addView(tNome);


        EditText eNome = new EditText(this);
        eNome.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
        ));

        l1.addView(eNome);

        eNome.requestFocus();

        TextView tSenha = new TextView(this);
        tSenha.setText("Senha: ");
        tSenha.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
        ));

        l1.addView(tSenha);

        EditText eSenha = new EditText(this);
        eSenha.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
        ));

        l1.addView(eSenha);

        Button bLogin = new Button(this);
        bLogin.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
        ));
        bLogin.setText("MOSTRAR");
        bLogin.setGravity(Gravity.RIGHT);

        l1.addView(bLogin);

        //setContentView(R.layout.activity_aula20_2);
        setContentView(l1);
    }
}
