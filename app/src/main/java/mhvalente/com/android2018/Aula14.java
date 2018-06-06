package mhvalente.com.android2018;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class Aula14 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aula14);

        final Button btnSelecionar = (Button) findViewById(R.id.bt_selecionar);
        final CheckBox ckOp1 = (CheckBox) findViewById(R.id.ck_op1);
        final CheckBox ckOp2 = (CheckBox) findViewById(R.id.ck_op2);
        final CheckBox ckOp3 = (CheckBox) findViewById(R.id.ck_op3);

        final Button btnExercicio = (Button) findViewById(R.id.bt_exec_aula14);

        final Intent iexec14 = new Intent(this, Aula14_exec.class);

        btnSelecionar.setOnClickListener(new View.OnClickListener() {
            //@Override
            String situacao1, situacao2, situacao3;
            public void onClick(View v) {
                if (ckOp1.isChecked()){
                    situacao1 = "1";
                } else {
                    situacao1 = "0";
                }

                if (ckOp2.isChecked()) {
                    situacao2 = "1";
                } else {
                    situacao2 = "0";
                }

                String resultado = situacao1 + " - " + situacao2;

                Toast.makeText(Aula14.this, resultado, Toast.LENGTH_SHORT).show();
            }
        });

        btnExercicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(iexec14);
            }
        });

    }
}
