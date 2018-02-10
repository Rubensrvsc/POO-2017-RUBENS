package com.example.rubens.projetoolx;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.example.rubens.projetoolx.adapters.RVAnuncioAdapter;
import com.example.rubens.projetoolx.model.Anuncio;

import java.util.List;

import io.objectbox.Box;

public class MainActivity extends AppCompatActivity {
    private FloatingActionButton Fab;
    private RecyclerView rvAnuncio;
    private Box<Anuncio> anuncioBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        anuncioBox=((App) getApplication()).getBoxStore().boxFor(Anuncio.class);

        rvAnuncio=(RecyclerView) findViewById(R.id.rv_anuncio);

    }

    @Override
    protected void onResume() {
        super.onResume();

        List<Anuncio> anunciar=anuncioBox.getAll();
        RVAnuncioAdapter adapter=new RVAnuncioAdapter(anunciar,this,anuncioBox);

        rvAnuncio.setAdapter(adapter);
        rvAnuncio.setLayoutManager(new LinearLayoutManager(this));

    }

    public void Adicionar(View view) {
        Fab=(FloatingActionButton) findViewById(R.id.fab);
        Intent it=new Intent(this,AdicionarActivity.class);
        startActivity(it);
    }
}
