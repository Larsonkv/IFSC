package com.example.minhaaplicacao;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    SQLiteDatabase bd;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bd = openOrCreateDatabase( "meubd",MODE_PRIVATE, null);

        bd.execSQL("CREATE TABLE IF NOT EXISTS notas " +
                "(id integer primary key autoincrement," +
                "titulo varchar not null," +
                "texto varchar)"
        );

        ContentValues contentValues = new ContentValues();
        contentValues.put("titulo", "Felicidade");
        contentValues.put("texto", "Hora de programar");
        bd.insert("notas",null, contentValues);

        Cursor cursor = bd.rawQuery("SELECT * FROM notas",null );
        cursor.moveToFirst();
        String id, titulo, texto;

        ArrayList<String> arrayList = new ArrayList<>();

        while(!cursor.isAfterLast()){
            id = cursor.getString(cursor.getColumnIndex("id"));
            titulo = cursor.getString(cursor.getColumnIndex("titulo"));
            texto = cursor.getString(cursor.getColumnIndex("texto"));
            arrayList.add(id);
            arrayList.add(titulo);
            arrayList.add(texto);
            cursor.moveToNext();
        }

        listView  = findViewById(R.id.listview);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                getApplicationContext(),
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                arrayList);

        listView.setAdapter(adapter);
    }
}
