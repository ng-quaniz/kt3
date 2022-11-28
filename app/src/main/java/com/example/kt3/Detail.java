package com.example.kt3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;


public class Detail extends AppCompatActivity {
    TextView phep,kq;
    ImageButton dtback;
    EditText so1,so2;
    Button tinh;
    private int thuchien;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        double a ,b;

        dtback = (ImageButton) findViewById(R.id.dtback);
        so1 = (EditText) findViewById(R.id.so1);
        phep = (TextView) findViewById(R.id.phep);
        so2 = (EditText) findViewById(R.id.so2);
        tinh = (Button) findViewById(R.id.tinh);
        Intent intent= getIntent();
        phep.setText(intent.getStringExtra("dulieu"));
        kq = (TextView) findViewById(R.id.kq);

        thuchien = getIntent().getIntExtra("dulieu", 0);
        if (thuchien != 4) {
            tinh.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    double a, b;
                    a = Double.parseDouble(so1.getText().toString());
                    b = Double.parseDouble(so2.getText().toString());
                    switch (thuchien) {
                        case 0:
                            double cong = a + b;
                            kq.setText(cong + "");
                            break;
                        case 1:
                            double tru = a - b;
                            kq.setText(tru + "");
                            break;
                        case 2:
                            double nhan = a * b;
                            kq.setText(nhan + "");
                            break;
                        case 3:
                            double chia = a * 1.0 / b;
                            kq.setText(chia + "");
                            break;
                    }
                }
                    });
                }


                    dtback.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Intent intent = new Intent(Detail.this, MainActivity.class);
                            startActivity(intent);
                        }
                    });
                }

}