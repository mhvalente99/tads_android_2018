package mhvalente.com.android2018;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class Aula6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aula6);

        getSupportActionBar().setTitle("Imagens");

        ImageView img1 = findViewById(R.id.hulk);
        img1.setImageResource(R.drawable.hulk);

        ImageView img2 = findViewById(R.id.hulk2);
        img2.setImageResource(R.drawable.hulk);
    }
}
