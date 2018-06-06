package mhvalente.com.android2018;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toolbar;

public class Aula7_2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aula7_2);

        TextView t1 = new TextView(this);
        t1.setText("Activity 2");
        setContentView(t1);



    }
}
