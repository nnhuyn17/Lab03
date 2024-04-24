package com.example.pagingexercise;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private EditText editTextKeyword;
    private Button searchButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize EditText and Button
        editTextKeyword = findViewById(R.id.editTextKeyword);
        searchButton = findViewById(R.id.tintuc_btn);

        searchButton.setOnClickListener(view -> {
            String keyword = editTextKeyword.getText().toString().trim();
            if (!keyword.isEmpty()) {
                Intent intent = new Intent(MainActivity.this, TinTucListActivity.class);
                intent.putExtra("keyword", keyword);
                startActivity(intent);
            }
        });
    }
}

