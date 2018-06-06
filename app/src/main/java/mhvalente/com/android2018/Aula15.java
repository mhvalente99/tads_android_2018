package mhvalente.com.android2018;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class Aula15 extends AppCompatActivity {

    protected static final String TAG = "estado";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aula15);

        Log.i(TAG, getClassName() + ". onCreate() chamado.");

        TextView t = new TextView(this);
        t.setText("Ciclo de Vida de uma activity");
        setContentView(t);
    }


    protected void onStart(){
        super.onStart();
        Log.i(TAG, getClassName() + ". onStart() chamado.");
    }

    protected void onRestart(){
        super.onRestart();
        Log.i(TAG, getClassName() + ". onRestart() chamado.");
    }

    protected void onResume(){
        super.onResume();
        Log.i(TAG, getClassName() + ". onResume() chamado");
    }

    protected  void onStop(){
        super.onStop();
        Log.i(TAG, getClassName() + ". onStop() chamado");
    }

    protected void onPause(){
        super.onPause();
        Log.i(TAG, getClassName() + ". onPause() chamado");
    }

    protected void onDestroy(){
        super.onDestroy();
        Log.i(TAG, getClassName() + ". onDestroy() chamado");
    }
    public String getClassName() {
        String s = getClass().getName();
        return s.substring(s.lastIndexOf("."));
    }
}
