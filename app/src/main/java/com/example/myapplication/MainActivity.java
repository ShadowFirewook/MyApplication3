package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import androidx.core.view.ContentInfoCompat;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.ContentInfo;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.button);
        EditText email = findViewById(R.id.email_text);
        EditText password= findViewById(R.id.password);
        TextView textView = findViewById(R.id.textView2);
        TextView textView1 = findViewById(R.id.textView3);
        CardView cardView = findViewById(R.id.email);
        CardView cardView1 = findViewById(R.id.cardView);
        TextView textView4 = findViewById(R.id.textView4);
        TextView textView5 = findViewById(R.id.textView5);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (email.getText().toString().equals(null) && password.getText().toString().equals(null)){
                    button.setBackgroundColor(getColor(R.color.orange));
                }
                if (email.getText().toString().equals("admin") && password.getText().toString().equals("admin")){
                    Toast.makeText(MainActivity.this,"Вы успешно зарегистрировались",Toast.LENGTH_LONG);
                    button.setVisibility(View.GONE);
                    textView.setVisibility(View.GONE);
                    textView1.setVisibility(View.GONE);
                    cardView.setVisibility(View.GONE);
                    cardView1.setVisibility(View.GONE);
                    textView4.setVisibility(View.GONE);
                    textView5.setVisibility(View.GONE);
                }else {
                    Toast.makeText(MainActivity.this,"Неправильный логин и пароль",Toast.LENGTH_LONG);
                }
            }
        });
    }
}
