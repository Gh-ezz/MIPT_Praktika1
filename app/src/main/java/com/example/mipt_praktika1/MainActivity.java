package com.example.mipt_praktika1;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private TextView tvMessage;
    private Button btnShowText;
    private Button btnTextColor;
    private Button btnBgColor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // susiejame view'us
        tvMessage = findViewById(R.id.tvMessage);
        btnShowText = findViewById(R.id.btnShowText);
        btnTextColor = findViewById(R.id.btnTextColor);
        btnBgColor = findViewById(R.id.btnBgColor);

        // paspaudus mygtuką – pakeisti tekstą
        btnShowText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvMessage.setText(getString(R.string.hello));
            }
        });

        // paspaudus mygtuką – pakeisti teksto spalvą
        btnTextColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvMessage.setTextColor(Color.RED);
            }
        });

        // paspaudus mygtuką – pakeisti fono spalvą
        btnBgColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvMessage.setBackgroundColor(Color.YELLOW);
            }
        });
    }
}