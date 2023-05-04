package com.example.pma;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.pma.Prikaz;
import com.example.pma.R;

public class Adapter  extends RecyclerView.Adapter<Adapter.ViewHolder>{

    Turizam[] turizam;
    Context contect;

    public Adapter(Turizam[] turizam, MainActivity2 activity){
        this.turizam = turizam;
        this.contect = activity;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater li = LayoutInflater.from(parent.getContext());
        View view = li.inflate(R.layout.tur_mesta,parent,false);
        ViewHolder vh = new ViewHolder(view);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Turizam turLista = turizam[position];
        holder.naslov.setText(turLista.getNaziv());
        holder.datum.setText(turLista.getDatum());
        holder.ocena.setText(turLista.getOcena());
        holder.slika.setImageResource(turLista.getSlika());
        holder.cv.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view){
                Intent i = new Intent(view.getContext(),Prikaz.class);
                i.putExtra("naziv",turLista.getNaziv());
                i.putExtra("opis",turLista.getOpis());
                i.putExtra("slika",turLista.getSlika());
                view.getContext().startActivity(i);
            }
        });
    }

    @Override
    public int getItemCount() {
        return turizam.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView slika;
        TextView naslov;
        TextView datum;
        TextView ocena;
        CardView cv;



        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            slika = itemView.findViewById(R.id.slika);
            naslov = itemView.findViewById(R.id.naslov);
            datum = itemView.findViewById(R.id.dani);
            ocena = itemView.findViewById(R.id.ocena);
            cv = itemView.findViewById(R.id.cv);
        }
    }


}
