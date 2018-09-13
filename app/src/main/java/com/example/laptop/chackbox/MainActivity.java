package com.example.laptop.chackbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private CheckBox milkChackBox, sugerCheckBox, waterCheckBox;
    private Button showButton;
    private TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        milkChackBox = findViewById(R.id.milkChackId);
        sugerCheckBox = findViewById(R.id.sugerChackId);
        waterCheckBox = findViewById(R.id.waterChackId);

        showButton = findViewById(R.id.btnId);

        resultTextView = findViewById(R.id.resultTextViewId);

        showButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                StringBuilder stringBuilder = new StringBuilder();

                if (milkChackBox.isChecked()) {


                    String value = milkChackBox.getText().toString();

                    stringBuilder.append(value + "is Checked"+"\n");

                }

                if (sugerCheckBox.isChecked()) {

                    String value = sugerCheckBox.getText().toString();

                    stringBuilder.append(value +"is Checked"+"\n");


                }


                if(waterCheckBox.isChecked()){

                    String value = waterCheckBox.getText().toString();

                    stringBuilder.append(value + "is Checked"+"\n");
                }

                else{

                    Toast.makeText(MainActivity.this,"You didn't Checked anything",Toast.LENGTH_SHORT).show();
                }

                resultTextView.setText(stringBuilder);


            }




        });





    }
}
