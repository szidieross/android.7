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
        animals.add(new Animal("Dog", R.drawable.dog, 20));
        animals.add(new Animal("Cat", R.drawable.cat, 60));
        animals.add(new Animal("Giraffe", R.drawable.dog, 20));
        animals.add(new Animal("Horse", R.drawable.cat, 60));
        animals.add(new Animal("Lion", R.drawable.dog, 20));
        animals.add(new Animal("Octopus", R.drawable.cat, 60));
        animals.add(new Animal("Rabbit", R.drawable.dog, 20));
        animals.add(new Animal("Sheep", R.drawable.cat, 60));

        animalAdapter = new AnimalAdapter(this, animals);
        recyclerView.setAdapter(animalAdapter);
    }
}