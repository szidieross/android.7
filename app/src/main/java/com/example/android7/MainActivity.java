package com.example.android7;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private AnimalAdapter animalAdapter;
    private List<Animal> animals;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerViewAnimals);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        animals = new ArrayList<>();
        animals.add(new Animal("Dog", R.drawable.dog, 13));
        animals.add(new Animal("Cat", R.drawable.cat, 16));
        animals.add(new Animal("Giraffe", R.drawable.giraffe, 25));
        animals.add(new Animal("Horse", R.drawable.horse, 25));
        animals.add(new Animal("Lion", R.drawable.lion, 20));
        animals.add(new Animal("Octopus", R.drawable.octopus, 3));
        animals.add(new Animal("Rabbit", R.drawable.rabbit, 9));
        animals.add(new Animal("Sheep", R.drawable.sheep, 12));

        animalAdapter = new AnimalAdapter(this, animals);
        recyclerView.setAdapter(animalAdapter);
    }
}