package mhvalente.com.android2018;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

public class Aula22 extends AppCompatActivity {

    private SeekBar skVermelho, skVerde, skAzul;
    private TextView barraCor, corSelecionada;
    private String[] hexCor = {"00", "00", "00"};

    public void mudaCor(){
        corSelecionada.setText("#" + hexCor[0] + hexCor[1] + hexCor[2]);
        barraCor.setBackgroundColor(Color.parseColor("#" + hexCor[0] + hexCor[1] + hexCor[2]));
    }

    public void acertaCor(int p, byte cor){
        String c = Integer.toHexString(p);
        hexCor[cor] = (c.length() == 2 ? "" : "0") + c;
        mudaCor();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aula22);

        skVermelho = findViewById(R.id.sk_vermelho);
        skVerde = findViewById(R.id.sk_verde);
        skAzul = findViewById(R.id.sk_azul);

        skVermelho.setOnSeekBarChangeListener(new EventoSeek((byte)0));
        skVerde.setOnSeekBarChangeListener(new EventoSeek((byte)1));
        skAzul.setOnSeekBarChangeListener(new EventoSeek((byte)2));

        corSelecionada = findViewById(R.id.tx_cor_selecionada);
        barraCor = findViewById(R.id.tx_barra_cor);

        mudaCor();
    }

    private class EventoSeek implements SeekBar.OnSeekBarChangeListener {
        private byte cor;

        public EventoSeek(byte cor) {
            this.cor = cor;
        }

        @Override
        public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
            acertaCor(progress, cor);
        }

        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {
        }
    }
}
