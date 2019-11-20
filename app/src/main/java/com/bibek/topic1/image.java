package com.bibek.topic1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;

public class image extends AppCompatActivity implements  View.OnClickListener{
RadioButton rdoPic2,rdoPic3;
ImageView imgPic;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);

        rdoPic2= findViewById((R.id.rdoPic2));
        rdoPic3=findViewById(R.id.rdoPic3);
        imgPic=findViewById(R.id.imgPic);
        rdoPic2.setOnClickListener(this );
        rdoPic3.setOnClickListener(this);

    }
    public void onClick(View V){
        switch (V.getId())
        {
            case R.id.rdoPic2:
                imgPic.setImageResource(R.drawable.pic2);
                break;
            case R.id.rdoPic3:
                imgPic.setImageResource(R.drawable.pic3);
                break;

        }

    }


}
