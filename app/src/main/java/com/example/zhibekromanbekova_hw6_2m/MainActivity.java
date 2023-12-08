package com.example.zhibekromanbekova_hw6_2m;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

public class MainActivity extends AppCompatActivity {
    private TextView Entrance, Welcome, Registration, Registration2, YourPassworld, ClicPassworld;
    private EditText Email, password;
    private Button Come;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Entrance = findViewById(R.id.Entrance);
        Welcome = findViewById(R.id.Welcome);
        Registration = findViewById(R.id.registration);
        Registration2 = findViewById(R.id.registration);
        YourPassworld = findViewById(R.id.yourPassworld);
        ClicPassworld = findViewById(R.id.clicPassworld);
        Email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        Come = findViewById(R.id.come);
        password.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (password.getText().toString().isEmpty()) {
                    Come.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.grey));
                } else {
                    Come.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.orange));
                }

            }
        });

        Email.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (Email.getText().toString().isEmpty()) {
                    Come.setBackgroundColor(Color.GRAY);
                } else {
                    Come.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.orange));
                }

            }
        });
        Come.setOnClickListener(v -> {
            if (Email.getText().toString().equals("admin") &&
                    password.getText().toString().equals("admin")) {
                Intent intent = new Intent(this, SecondActivity.class);
                startActivity(intent);
            } else {
                Toast.makeText(MainActivity.this,
                        "Wrong login or password"
                        , Toast.LENGTH_SHORT).show();
            }
        });
    }
}
