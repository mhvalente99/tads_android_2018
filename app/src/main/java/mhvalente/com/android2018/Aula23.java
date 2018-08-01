package mhvalente.com.android2018;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class Aula23 extends AppCompatActivity {

    private EditText editItem;
    private List<String> dados = new ArrayList<String>();
    private ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aula23);

        montarTabs();

        ListView lstDados = findViewById(R.id.tabList);

        lstDados.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                removerItem(position);
            }
        });

        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, dados);

        lstDados.setAdapter(adapter);

        editItem = findViewById(R.id.ed_dsitem);

        findViewById(R.id.bt_inserir_item).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adicionarItem();
            }
        });


    }

    private void removerItem(int position) {

    }

    private void adicionarItem() {
        
    }

    private void montarTabs(){

    }
}
