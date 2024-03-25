package com.example.android7;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AnimalAdapter extends RecyclerView.Adapter<AnimalAdapter.AnimalViewHolder> {
    private List<Animal> animals;
    private Context context;

    public AnimalAdapter(Context context, List<Animal> animals) {
        this.context = context;
        this.animals = animals;
    }

    @NonNull
    @Override
    public AnimalViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_animal, parent, false);
        return new AnimalViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AnimalViewHolder holder, final int position) {
        final Animal animal = animals.get(position);
        holder.imageViewAnimal.setImageResource(animal.getImageResource());
        holder.textViewAnimalName.setText(animal.getName());
        holder.textViewAverageLifespan.setText("Average Lifespan: " + animal.getAverageLifespan() + " years");

        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = "Name: " + animal.getName() + ", " +
                        "average Lifespan: " + animal.getAverageLifespan() + " years";
                Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return animals.size();
    }

    public static class AnimalViewHolder extends RecyclerView.ViewHolder {
        CardView cardView;
        ImageView imageViewAnimal;
        TextView textViewAnimalName;
        TextView textViewAverageLifespan;

        public AnimalViewHolder(@NonNull View itemView) {
            super(itemView);
            cardView = itemView.findViewById(R.id.cardView);
            imageViewAnimal = itemView.findViewById(R.id.imageViewAnimal);
            textViewAnimalName = itemView.findViewById(R.id.textViewAnimalName);
            textViewAverageLifespan = itemView.findViewById(R.id.textViewAverageLifespan);
        }
    }
}
