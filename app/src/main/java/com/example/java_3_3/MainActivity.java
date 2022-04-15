package com.example.java_3_3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ArrayList<String> contacts;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loadData();
        recyclerView = findViewById(R.id.recycler_view);
        ContactAdapter adapter = new ContactAdapter(contacts);
        recyclerView.setAdapter(adapter);

    }
    private void loadData(){
        contacts = new ArrayList<>();
        contacts.add("+996508211606");
        contacts.add("+996508211606");
        contacts.add("+996508211606");
        contacts.add("+996508211606");
        contacts.add("+996508211606");
        contacts.add("+996508211606");
        contacts.add("+996508211606");
        contacts.add("+996508211606");
        contacts.add("+996508211606");
        contacts.add("+996508211606");
        contacts.add("+996508211606");
        contacts.add("+996508211606");
        contacts.add("+996508211606");
        contacts.add("+996508211606");
        contacts.add("+996508211606");
        contacts.add("+996508211606");
        contacts.add("+996508211606");
    }
}