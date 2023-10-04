package com.example.condition;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
 public class MainActivity extends AppCompatActivity {

    EditText editText;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText);
        btn = findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String s = editText.getText().toString();
                int mynNum =Integer.parseInt(s);

                if (mynNum % 2 == 0){
                    Toast.makeText(MainActivity.this, mynNum+" is Even",Toast.LENGTH_LONG).show();
                }
                else {
                    Toast.makeText(MainActivity.this, mynNum + " is Odd", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}