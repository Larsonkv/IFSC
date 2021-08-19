package br.com.rbeninca.listafrutas;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.zip.Inflater;

public class FrutaAdapterListView extends ArrayAdapter<Fruta> {

    Context mContext;
    int mResource;
    public FrutaAdapterListView(@NonNull Context context, int resource, @NonNull Fruta[] objects) {
        super(context, resource,  objects);
        mContext=context;
        mResource=resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        //Criando  propriedade LayoutInflater
        LayoutInflater layoutInflater = LayoutInflater.from(mContext);
        convertView = layoutInflater.inflate(mResource,parent,false);

        //Associando elementos da view inflada a váriaveis locais
        TextView tvCodigo = (TextView) convertView.findViewById(R.id.tvCodigo);
        TextView tvNome = (TextView) convertView.findViewById(R.id.tvNome);
        TextView tvPreco =  (TextView) convertView.findViewById(R.id.tvPreco);
        TextView tvPrecoVenda =(TextView) convertView.findViewById(R.id.tvPrecoVenda);
        ImageView imgView = (ImageView) convertView.findViewById(R.id.imageView);


        //Recuperando objeto com dados na posição da coleção
        Fruta fruta = getItem(position);

        // Populando item da view


        NumberFormat nf = new DecimalFormat("#,###.00");

        tvCodigo.setText(Integer.toString(fruta.getCodigo()));
        tvNome.setText(fruta.getNome());
        tvPreco.setText(nf.format (fruta.getPreco()));
        tvPrecoVenda.setText(nf.format (fruta.getPreco_venda()));
        imgView.setImageResource(fruta.getImagem());


        return convertView;
    }
}