package mhvalente.com.android2018;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class Aula11_2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aula11_2);

        Intent it = getIntent();

        if (it != null) {
            Bundle params = it.getExtras();

            if (params != null) {
                String msg = params.getString("msg");
                Toast.makeText(Aula11_2.this, msg, Toast.LENGTH_SHORT).show();
            }
        }
    }
}
