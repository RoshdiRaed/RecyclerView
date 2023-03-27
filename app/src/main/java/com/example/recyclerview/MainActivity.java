package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView rv = findViewById(R.id.recyclerView);
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("1","Roshdi","Raed",R.drawable.image));
        employees.add(new Employee("2","Roshdi","Raed",R.drawable.image));
        employees.add(new Employee("3","Roshdi","Raed",R.drawable.image));
        employees.add(new Employee("4","Roshdi","Raed",R.drawable.image));
        employees.add(new Employee("5","Roshdi","Raed",R.drawable.image));
        employees.add(new Employee("6","Roshdi","Raed",R.drawable.image));

        MyAdapter ma = new MyAdapter(this,employees);

        RecyclerView.LayoutManager lm = new LinearLayoutManager(this);
        rv.setLayoutManager(lm);
        rv.setAdapter(ma);

    }
}