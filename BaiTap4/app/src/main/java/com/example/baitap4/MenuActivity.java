package com.example.baitap4;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MenuActivity extends AppCompatActivity {

    ListView listViewMenu;
    String[] foods = {
            "Pizza - 80.000đ",
            "Hamburger - 50.000đ",
            "Trà sữa - 40.000đ",
            "Khoai tây chiên - 30.000đ",
            "Sushi - 120.000đ",
            "Mì Ramen - 90.000đ"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        listViewMenu = findViewById(R.id.listViewMenu);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, foods);

        listViewMenu.setAdapter(adapter);

        listViewMenu.setOnItemClickListener((parent, view, position, id) -> {
            String item = foods[position];
            Toast.makeText(MenuActivity.this, "Bạn chọn: " + item, Toast.LENGTH_SHORT).show();
        });
    }
}