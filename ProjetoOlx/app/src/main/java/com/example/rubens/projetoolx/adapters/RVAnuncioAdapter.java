package com.example.rubens.projetoolx.adapters;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.PopupMenu;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.rubens.projetoolx.AdicionarActivity;
import com.example.rubens.projetoolx.model.Anuncio;
import com.example.rubens.projetoolx.R;

import java.util.List;

import io.objectbox.Box;

/**
 * Created by rubens on 10/02/2018.
 */

public class RVAnuncioAdapter extends RecyclerView.Adapter<RVAnuncioAdapter.ViewHolder> {

    private List<Anuncio> anuncio;
    private Context context;
    private Box<Anuncio> anuncioBox;

    public RVAnuncioAdapter(List<Anuncio> anuncio, Context context, Box<Anuncio> anuncioBox){
        this.anuncio=anuncio;
        this.context=context;
        this.anuncioBox=anuncioBox;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View view =inflater.inflate(R.layout.rv_anuncio,parent,false);
        RVAnuncioAdapter.ViewHolder vh=new RVAnuncioAdapter.ViewHolder(view);

        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Anuncio an=anuncio.get(position);

        holder.txtNome.setText(an.getNome());
        holder.txtPreco.setText(""+an.getPreco());

        Clicks(holder.itemView,an,position);

    }

    private void Clicks(final View itemView, final Anuncio an, final int position) {
        itemView.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {

                PopupMenu popup = new PopupMenu(context, v);
                popup.getMenuInflater().inflate(R.menu.popup_menu_lista, popup.getMenu());

                popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        switch (item.getItemId()) {
                            case R.id.it_editar:
                                editarItem(itemView, an, position);
                                break;
                            case R.id.it_remover:
                                removerItem(itemView, an, position);
                                break;
                        }
                        return false;
                    }
                });
                popup.show();
                return true;
            }

        });

    }

    private void editarItem(View itemView, Anuncio an, int position) {
        Intent it =new Intent(context,AdicionarActivity.class);
        it.putExtra("IdAnuncio",an.getId());

        context.startActivity(it);

        notifyItemChanged(position);
    }

    private void removerItem(View itemView, final Anuncio an, final int position) {
        AlertDialog.Builder alert=new AlertDialog.Builder(this.context);
        alert.setTitle("Edicao ou Remocao");
        alert.setMessage("Tem certera que quer remover: "+an.getNome()+"?");
        alert.setPositiveButton("SIM", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                anuncio.remove(an);
                anuncioBox.remove(an);
                notifyItemRemoved(position);
                notifyItemChanged(position,getItemCount());

            }
        });

        alert.setNegativeButton("NÃO", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(context, "OK", Toast.LENGTH_SHORT).show();
            }
        });
        alert.create().show();
    }

    @Override
    public int getItemCount(){
        return anuncio.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        private TextView txtNome;
        private TextView txtPreco;

        public ViewHolder(View itemView){
            super(itemView);

            txtNome= (TextView) itemView.findViewById(R.id.rv_id_nome);
            txtPreco= (TextView) itemView.findViewById(R.id.rv_id_preco);
        }
    }
}

