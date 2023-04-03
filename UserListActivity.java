package com.example.android4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class UserListActivity extends AppCompatActivity {

    private UserStorage userStorage;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_students);

        userStorage = UserStorage.getInstance();

        recyclerView = findViewById(R.id.rv_StudentList);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new UserListAdapter(getApplicationContext(), userStorage.getUsers()));
    }
}