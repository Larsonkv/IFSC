package br.com.rbeninca.listafrutas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;

public class ListagemFrutasRecyclerViewActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    FrutaController frutaController;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listagem_frutas_recycler_view);

        FrutaController frutaController = new FrutaController();

        recyclerView= findViewById(R.id.recylerView);

        //Configuracoes RecycleView
        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        //Configuracao do adapter para recycleView
        FrutaAdapterRecyclerView frutaAdapterRecyclerView = new FrutaAdapterRecyclerView(
                getApplicationContext(),
                R.layout.template_item_fruta,
                frutaController.FRUTAS
        );

        //FrutaAdapterListView frutaAdapterListView =new FrutaAdapterListView(
        //        getApplicationContext(),
        //        R.layout.template_item_fruta,
        //        frutaController.FRUTAS
        //);

        recyclerView.setAdapter(frutaAdapterRecyclerView);
    }
}
