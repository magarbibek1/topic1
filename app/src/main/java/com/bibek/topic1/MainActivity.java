package com.bibek.topic1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button calculate;
    EditText num1,num2;
    RadioButton rdAdd, rdSub, rdMul, rdDiv;
    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1= findViewById(R.id.etFirst);
        num2= findViewById(R.id.etSecond);
        rdAdd= findViewById(R.id.rdAdd);
        rdSub= findViewById(R.id.rdSub);
        calculate= findViewById(R.id.btnCalculate);
        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int first,second,result;
                first=Integer.parseInt(num1.getText().toString());
                second=Integer.parseInt(num2.getText().toString());
                if(rdAdd.isChecked()){
                    calc cal=new calc(first,second);
                    result=cal.add();

                    Toast.makeText(MainActivity.this, "total sum is"+result, Toast.LENGTH_LONG).show();
                }else if  (rdSub.isChecked()){
                    calc cal=new calc(first,second);
                    result=cal.sub();
                    Toast.makeText(MainActivity.this, "total subtraction is"+result, Toast.LENGTH_LONG).show();


                }


            }

        });
    }
}