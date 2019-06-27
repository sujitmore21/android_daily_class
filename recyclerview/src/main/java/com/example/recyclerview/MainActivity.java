package com.example.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerview);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);

        recyclerView.setLayoutManager(layoutManager);

        List<Modelclass> modelclassList = new ArrayList<>();
        modelclassList.add(new Modelclass(R.drawable.ic_launcher_background,"user one","hello this user one"));
        modelclassList.add(new Modelclass(R.drawable.ic_launcher_background,"user two","hello this user two"));
        modelclassList.add(new Modelclass(R.drawable.ic_launcher_background,"user three","hello this user three"));
        modelclassList.add(new Modelclass(R.drawable.ic_launcher_background,"user four","hello this user four"));
        modelclassList.add(new Modelclass(R.drawable.ic_launcher_background,"user five","hello this user five"));
        modelclassList.add(new Modelclass(R.drawable.ic_launcher_background,"user six","hello this user six"));
        modelclassList.add(new Modelclass(R.drawable.ic_launcher_background,"user seven","hello this user seven"));

        Adapter adapter = new Adapter(modelclassList);
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }
}
