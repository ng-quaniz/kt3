package com.example.kt3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lv;
    ArrayList<String> arrayList;
    Boolean kt=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = (ListView) findViewById(R.id.lv);
        arrayList = new ArrayList<>();

        arrayList.add("Cộng");
        arrayList.add("Trừ");
        arrayList.add("Nhân");
        arrayList.add("Chia");
        arrayList.add("Logaric");
        arrayList.add("Bình phương");
        arrayList.add("Chia lấy dư");

        ArrayAdapter adapter = new ArrayAdapter(MainActivity.this, android.R.layout.simple_list_item_1,arrayList);
        lv.setAdapter(adapter);


        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(MainActivity.this, Detail.class);
                intent.putExtra("dulieu",arrayList.get(i));
                startActivity(intent);

            }
        });

    }
}