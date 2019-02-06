package com.example.loteria;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button i1, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16;
    TextView txt1;
    int c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        i1 = findViewById(R.id.i1);
        i2 = findViewById(R.id.i2);
        i3 = findViewById(R.id.i3);
        i4 = findViewById(R.id.i4);
        i5 = findViewById(R.id.i5);
        i6 = findViewById(R.id.i6);
        i7 = findViewById(R.id.i7);
        i8 = findViewById(R.id.i8);
        i9 = findViewById(R.id.i9);
        i10 = findViewById(R.id.i10);
        i11 = findViewById(R.id.i11);
        i12 = findViewById(R.id.i12);
        i13 = findViewById(R.id.i13);
        i14 = findViewById(R.id.i14);
        i15 = findViewById(R.id.i15);
        i16 = findViewById(R.id.i16);
        txt1 = findViewById(R.id.txt1);

        i1.setOnClickListener(this);
        i2.setOnClickListener(this);
        i3.setOnClickListener(this);
        i4.setOnClickListener(this);
        i5.setOnClickListener(this);
        i6.setOnClickListener(this);
        i7.setOnClickListener(this);
        i8.setOnClickListener(this);
        i9.setOnClickListener(this);
        i10.setOnClickListener(this);
        i11.setOnClickListener(this);
        i12.setOnClickListener(this);
        i13.setOnClickListener(this);
        i14.setOnClickListener(this);
        i15.setOnClickListener(this);
        i16.setOnClickListener(this);


    }
    @Override
    public void onClick(View v) {
        c++;
        switch (v.getId())
        {

            case R.id.i1:
                i1.setText("●");break;
            case R.id.i2:
                i2.setText("●");break;
            case R.id.i3:
                i3.setText("●");break;
            case R.id.i4:
                i4.setText("●");break;
            case R.id.i5:
                i5.setText("●");break;
            case R.id.i6:
                i6.setText("●");break;
            case R.id.i7:
                i7.setText("●");break;
            case R.id.i8:
                i8.setText("●");break;
            case R.id.i9:
                i9.setText("●");break;
            case R.id.i10:
                i10.setText("●");break;
            case R.id.i12:
                i12.setText("●");break;
            case R.id.i11:
                i11.setText("●");break;
            case R.id.i13:
                i13.setText("●");break;
            case R.id.i14:
                i14.setText("●");break;
            case R.id.i15:
                i15.setText("●");break;
            case R.id.i16:
                i16.setText("●");break;

        }
    }
    


}