package com.example.applearning;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button buttondel, buttonAdd, buttonSub, buttonDivision,
            buttonMul,buttonequal;
EditText edittext1,edittext2;
    boolean crunchifyAddition, mSubtract, crunchifyMultiplication, crunchifyDivision;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttondel = findViewById(R.id.buttonDel);
        buttonAdd = (Button) findViewById(R.id.buttonadd);
        buttonSub = (Button) findViewById(R.id.buttonsub);
        buttonMul = (Button) findViewById(R.id.buttonmul);
        buttonDivision = (Button) findViewById(R.id.buttondiv);
        buttonequal = (Button) findViewById(R.id.buttoneql);
        edittext1 = (EditText) findViewById(R.id.display);
        edittext2 = (EditText) findViewById(R.id.display1);





        buttondel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"tyfftfytuyftu",Toast.LENGTH_SHORT).show();
            }


        });
    }
}
