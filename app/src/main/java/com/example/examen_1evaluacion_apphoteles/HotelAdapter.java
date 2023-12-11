package com.example.examen_1evaluacion_apphoteles;


import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.view.LayoutInflater;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class HotelAdapter extends RecyclerView.Adapter<HotelAdapter.ViewHolder> {

    private List<Hotel> hotelList; // Reemplaza Hotel con tu clase de modelo

    public HotelAdapter(List<Hotel> hotelList) {
        this.hotelList = hotelList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_hotel, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Hotel hotel = hotelList.get(position);
        holder.hotelName.setText(hotel.getName());
        holder.hotelLocation.setText(hotel.getLocation());

        holder.hotelImage.setImageResource(hotel.getImageResourceId());

        holder.favoriteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(holder.itemView.getContext(), "Se ha añadido " + hotel.getName() + " a favoritos", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return hotelList.size();
    }

    //classe viewholder
    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView hotelName, hotelLocation;
        ImageView hotelImage;
        ImageButton favoriteButton; // Cambiado de Button a ImageButton

        public ViewHolder(View itemView) {
            super(itemView);
            hotelName = itemView.findViewById(R.id.hotelNombre);
            hotelLocation = itemView.findViewById(R.id.hotelLocalizacion);
            hotelImage = itemView.findViewById(R.id.hotelImagen);
            favoriteButton = itemView.findViewById(R.id.botonFavorito); // Ahora encuentra un ImageButton
        }
    }

}

