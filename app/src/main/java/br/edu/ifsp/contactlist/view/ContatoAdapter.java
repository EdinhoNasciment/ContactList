package br.edu.ifsp.contactlist.view;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import org.w3c.dom.Text;

import java.util.List;

import br.edu.ifsp.contactlist.R;
import br.edu.ifsp.contactlist.model.Contato;

public class ContatoAdapter extends ArrayAdapter<Contato> {

    public  ContatoAdapter(@NonNull Context context, @NonNull List<Contato> objects){
        super(context, R.layout.item_list_contato, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent){

        if(convertView == null){
            LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.item_list_contato, null);

        }

        TextView nome = (TextView) convertView.findViewById(R.id.text_nome);
        TextView fone = (TextView) convertView.findViewById(R.id.text_numero);
        Contato contato = getItem(position);
        nome.setText(contato.getNome());
        fone.setText(contato.getTelefone());
        Log.v("LISTA_CONTATOS","Inserido na listview: " + contato.toString());
        return convertView;
    }
}
