package com.example.rubens.projetoolx;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.rubens.projetoolx.model.Anuncio;

import io.objectbox.Box;

/**
 * Created by rubens on 09/02/2018.
 */

public class AdicionarActivity extends AppCompatActivity {

    private EditText edNome;
    private EditText edPreco;
    private Button btSalvar;
    private Anuncio anuncio;
    private Box<Anuncio> boxAnuncio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.adicionar_activity);
        Intent intent=getIntent();
        boxAnuncio=((App) getApplication()).getBoxStore().boxFor(Anuncio.class);
        long id=intent.getLongExtra("IdAnuncio",-1);

        binding();

        if(id!=-1){
            //String nome=edNome.getText().toString();
            //String preco=edPreco.getText().toString();
            //double pc=Double.parseDouble(preco);

            //anuncio=new Anuncio(pc,nome);
            anuncio=boxAnuncio.get(id);

            edNome.setText(anuncio.getNome());
            edPreco.setText(""+anuncio.getPreco());
        }
    }

    private void binding() {
        edNome=(EditText) findViewById(R.id.ed_nome);
        edPreco=(EditText)findViewById(R.id.ed_preco);
        btSalvar=(Button) findViewById(R.id.bt_salvar);
    }

    public void Salvar(View view) {
        String nome=edNome.getText().toString();
        String preco=edPreco.getText().toString();
        double pc=Double.parseDouble(preco);

        anuncio=new Anuncio(pc,nome);
        boxAnuncio.put(anuncio);

        Toast.makeText(this,"deu certo",Toast.LENGTH_SHORT).show();

        finish();

    }
}
