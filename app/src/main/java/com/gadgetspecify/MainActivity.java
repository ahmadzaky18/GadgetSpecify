package com.gadgetspecify;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private ArrayList<ModelSpecify> specifyArrayList;
    private String[] nama = {
            "Apple",
            "Samsung",
            "Xiaomi",
            "Sony",
            "Nokia",
            "Oppo",
            "Huawei",
            "Honor",
            "Google",
            "Asus",

    };

    private int[] photo = {
            R.drawable.appleiphonexsnew,
            R.drawable.samsunggalaxya30s,
            R.drawable.xiaomiblackshark2pro,
            R.drawable.sonyxperia1,
            R.drawable.nokia31a,
            R.drawable.oppoa9,
            R.drawable.huaweinova5ipro,
            R.drawable.honor9x,
            R.drawable.googlepixel3xl,
            R.drawable.asusrogphone2,


    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addData();

        recyclerView = (RecyclerView) findViewById(R.id.specify);

        adapter = new AdapterSpecify(specifyArrayList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);

        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setAdapter(adapter);
        specifyArrayList.addAll(DataSpecify.getListData());
        showRecyclerList();
    }
    private void showSelectedHero(ModelSpecify modelSpecify) {
        Intent moveIntent = new Intent(MainActivity.this, DetailSpecify.class);
        startActivity(moveIntent);

    }
    private void showRecyclerList(){
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        AdapterSpecify adapterSpecify = new AdapterSpecify(specifyArrayList);
        recyclerView.setAdapter(adapterSpecify);
        adapterSpecify.setOnItemClickCallback(new AdapterSpecify.OnItemClickCallback() {
            @Override
            public void onItemClicked(ModelSpecify data) {
                showSelectedHero(data);

            }


        });
    }
    void addData() {
        specifyArrayList = new ArrayList<>();
        for (int i = 0; i < nama.length; i++) {
            ModelSpecify modelSpecify = new ModelSpecify();
            modelSpecify.setNama(nama[i]);
            modelSpecify.setPhoto(photo[i]);
            specifyArrayList.add(modelSpecify);
        }
    }


}


