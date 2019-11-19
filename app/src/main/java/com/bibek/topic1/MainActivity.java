package com.bibek.topic1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText etfirst, etsecond;
    private Button btcalculate;
    private RadioButton rdosum, rdosub;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        etfirst = findViewById(R.id.etfirst);
        etsecond = findViewById(R.id.etsecond);
        btcalculate = findViewById(R.id.btcalculate);
        rdosum = findViewById(R.id.rdosum);
        rdosub = findViewById(R.id.rdosub);

    }

    private boolean validation() {
        boolean flag = true;
        if (TextUtils.isEmpty(etfirst.getText().toString())) {

            etfirst.setError("enter first number");
            etfirst.requestFocus();
            flag = false;
        } else if (TextUtils.isEmpty(etsecond.getText().toString())) {
            etsecond.setError("enter second number");
        }
        return flag;
    }


    @Override
    public void OnView(View V) {

        int first, second, result;
        if (validation()) {

            first = Integer.parseInt((etfirst.getText().toString()));
            second = Integer.parseInt((etsecond.getText().toString()));
            if (V.getId()==R.id.btcalculate){

            if (rdosum.isChecked()) {
                result = first + second;
            } else {
                result = first - second;
            }
            Toast.makeText(MainActivity.this, "Result is :"+result, Toast.LENGTH_SHORT).show();
         }
    }
    }
}
