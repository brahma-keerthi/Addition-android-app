package com.example.addition;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private TextView textView;
    private EditText editText1, editText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        textView = findViewById(R.id.textView);
        editText1 = findViewById(R.id.editTextNumberDecimal);
        editText2 = findViewById(R.id.editTextNumberDecimal2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Thanks for using", Toast.LENGTH_SHORT).show();
                String a = editText1.getText().toString();
                String b = editText2.getText().toString();
                double num1 = Double.parseDouble(a);
                double num2 = Double.parseDouble(b);
                double ans = num1 + num2;
                textView.setText(num1 + " + " + num2 + " = " + ans);
            }
        });
    }
}