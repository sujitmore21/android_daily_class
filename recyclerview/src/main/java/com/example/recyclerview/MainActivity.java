package com.example.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

import static com.example.recyclerview.Modelclass.AD_LAYOUT;
import static com.example.recyclerview.Modelclass.IMAGE_LAYOUT;
import static com.example.recyclerview.Modelclass.USER_INFO_LAYOUT;

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
        modelclassList.add(new Modelclass(USER_INFO_LAYOUT,R.drawable.ic_launcher_background,"sujit more","kajhkahfkahakhfkmzxcbkuefmvbkshdkkghkhkahkdghakhgdkauekvnksdhkkfhkakahfkakuebmcnmabkahkfakfkahfkahkfhiafihan,mnchauk,nkfhka lafsj;ks bakfhk"));
        modelclassList.add(new Modelclass(IMAGE_LAYOUT,R.mipmap.ic_launcher));
        modelclassList.add(new Modelclass(AD_LAYOUT,"Hello"));
        modelclassList.add(new Modelclass(IMAGE_LAYOUT,R.mipmap.ic_launcher));
        modelclassList.add(new Modelclass(AD_LAYOUT,"Hello"));
        modelclassList.add(new Modelclass(USER_INFO_LAYOUT,R.drawable.ic_launcher_background,"sujit more","kajhkahfkahakhfkmzxcbkuefmvbkshdkkghkhkahkdghakhgdkauekvnksdhkkfhkakahfkakuebmcnmabkahkfakfkahfkahkfhiafihan,mnchauk,nkfhka lafsj;ks bakfhk"));
        modelclassList.add(new Modelclass(USER_INFO_LAYOUT,R.drawable.ic_launcher_background,"sujit more","kajhkahfkahakhfkmzxcbkuefmvbkshdkkghkhkahkdghakhgdkauekvnksdhkkfhkakahfkakuebmcnmabkahkfakfkahfkahkfhiafihan,mnchauk,nkfhka lafsj;ks bakfhk"));
        modelclassList.add(new Modelclass(IMAGE_LAYOUT,R.mipmap.ic_launcher));
        modelclassList.add(new Modelclass(IMAGE_LAYOUT,R.mipmap.ic_launcher));
        modelclassList.add(new Modelclass(AD_LAYOUT,"Hello"));
        modelclassList.add(new Modelclass(IMAGE_LAYOUT,R.mipmap.ic_launcher_round));
        modelclassList.add(new Modelclass(AD_LAYOUT,"Hello"));

        Adapter adapter = new Adapter(modelclassList);
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }
}
