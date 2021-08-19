package br.com.rbeninca.listafrutas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class ListagemFrutasListViewActivity extends AppCompatActivity {
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listagem_fruta_list_view);


        listView=findViewById(R.id.listView);


        FrutaController frutaController = new FrutaController();

        FrutaAdapterListView frutaAdapterListView =new FrutaAdapterListView(
                getApplicationContext(),
                R.layout.template_item_fruta,
                frutaController.FRUTAS
        );

        listView.setAdapter(frutaAdapterListView);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long l) {

                Intent intent = new Intent(getApplicationContext(), ExibeFrutas.class);

                intent.putExtra("id", i);
                startActivity(intent);
            }
        });




    }
}
