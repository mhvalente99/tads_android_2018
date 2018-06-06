package mhvalente.com.android2018;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //getActionBar().setTitle("Aulas Android - 2018");
        getSupportActionBar().setTitle("Aulas Android - 2018");

        final TextView aula1 = findViewById(R.id.aula1);

        aula1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Esta aula foi teorica :(", Toast.LENGTH_SHORT).show();
            }
        });


        final TextView aula2 = findViewById(R.id.aula2);
        final Intent aulai2 = new Intent(MainActivity.this, Aula2.class);

        aula2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(aulai2);
            }
        });

        final TextView text = findViewById(R.id.aula3);
        final Intent intent = new Intent(this, Aula3.class);

        text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent);
            }
        });

        final TextView aula4 = findViewById(R.id.aula4);
        final Intent aulai4 = new Intent(this, Aula4.class);

        aula4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startActivity(aulai4);
            }
        });

        final TextView aula5 = findViewById(R.id.aula5);
        final Intent aulai5 = new Intent(this, Aula5.class);

        aula5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(aulai5);
            }
        });

        final TextView aula6 = findViewById(R.id.aula6);
        final Intent aulai6 = new Intent(this, Aula6.class);

        aula6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(aulai6);
            }
        });

        final TextView aula7 = findViewById(R.id.aula7);
        final Intent aulai7 = new Intent(this, Aula7.class);

        aula7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(aulai7);
            }
        });

        final TextView aula8 = findViewById(R.id.aula8);
        final Intent aulai8 = new Intent(this, Aula8.class);

        aula8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(aulai8);
            }
        });


        final TextView aula9 = findViewById(R.id.aula9);
        final Intent aulai9 = new Intent(this, Aula9.class);

        aula9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(aulai9);
            }
        });

        final TextView aula10 = findViewById(R.id.aula10);
        final Intent aulai10 = new Intent(this, Aula10.class);

        aula10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(aulai10);
            }
        });

        final TextView aula11 = findViewById(R.id.aula11);
        final Intent aulai11 = new Intent(this, Aula11.class);

        aula11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(aulai11);
            }
        });

        final TextView aula12 = findViewById(R.id.aula12);
        final Intent aulai13 = new Intent(this, Aula13.class);

        aula12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(aulai13);
            }
        });

        final TextView aula14 = findViewById(R.id.aula13);
        final Intent aulai14 = new Intent(this, Aula14.class);

        aula14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(aulai14);
            }
        });

        final TextView aula15 = findViewById(R.id.aula14);
        final Intent aulai15 = new Intent(this, Aula15.class);

        aula15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(aulai15);
            }
        });

        final TextView aula16 = findViewById(R.id.aula15);
        final Intent aulai16 = new Intent(this, Aula16.class);

        aula16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(aulai16);
            }
        });

        final TextView aula17 = findViewById(R.id.aula16);
        final Intent aulai17 = new Intent(this, Aula17.class);

        aula17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(aulai17);
            }
        });

        final TextView aula18 = findViewById(R.id.aula17);
        final Intent aulai18 = new Intent(this, Aula18.class);

        aula18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(aulai18);
            }
        });

        final TextView aula19 = findViewById(R.id.aula19);
        final Intent aulai19 = new Intent(this, Aula19.class);

        aula19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(aulai19);
            }
        });

        final TextView aula20 = findViewById(R.id.aula20);
        final Intent aulai20 = new Intent(this, Aula20.class);

        aula20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(aulai20);
            }
        });
    }
}
