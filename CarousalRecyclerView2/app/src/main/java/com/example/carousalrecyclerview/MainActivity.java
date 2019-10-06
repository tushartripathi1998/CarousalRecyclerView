package com.example.carousalrecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<Fruits> allFruits;
    private FruitAdapter adapter;

    private int[] myImages = new int[]{R.drawable.apple, R.drawable.blue, R.drawable.mango, R.drawable.orange, R.drawable.pineapple, R.drawable.straw, R.drawable.water};
    private String[] myImageNames = new String[]{"apple", "blue", "mango", "orange", "pineapple", "straw", "water"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        allFruits = getFruits();
        recyclerView = findViewById(R.id.recyclerView);
        FruitAdapter adapter = new FruitAdapter(MainActivity.this, allFruits);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL, false));
    }

    private ArrayList<Fruits> getFruits(){
        ArrayList<Fruits> setFruits = new ArrayList<Fruits>();
        for(int i=0; i<7; i++)
        {
            Fruits fruit = new Fruits();
            fruit.setImage_drawable(myImages[i]);
            fruit.setName(myImageNames[i]);
            setFruits.add(fruit);
        }
        return setFruits;
    }
}
