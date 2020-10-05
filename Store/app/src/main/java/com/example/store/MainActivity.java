package com.example.store;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LinkedList<String> mWordList = new LinkedList<String>();

        mWordList.add("Television");
        mWordList.add("Radio");
        mWordList.add("Fridge");
        mWordList.add("Laptop");
        mWordList.add("Phone");
        mWordList.add("Car");
        mWordList.add("Couch");
        mWordList.add("Bathtub");
        mWordList.add("Oven");
        mWordList.add("Chair");
        mWordList.add("Light");
        mWordList.add("Dishwasher");

        RecyclerView mRecyclerView = findViewById(R.id.recyclerview);
        RecyclerView.Adapter mAdapter = new WordListAdapter(this, mWordList);
        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
