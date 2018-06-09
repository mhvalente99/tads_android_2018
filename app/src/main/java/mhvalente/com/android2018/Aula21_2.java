package mhvalente.com.android2018;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Aula21_2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aula21_2);

        LinearLayout layout = (LinearLayout) findViewById(R.id.ll1);

        EditText eText = new EditText(this);

        layout.addView(eText);

        for (int i = 0; i < 100; i++) {
            TextView t1 = new TextView(this);
            t1.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
            t1.setText("Linha: " + i);

            layout.addView(t1);
        }
    }
}
