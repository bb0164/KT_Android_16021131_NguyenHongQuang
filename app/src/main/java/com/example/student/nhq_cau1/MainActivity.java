package com.example.student.nhq_cau1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edtA, edtB;
    Button btnTong;
    Button btnHieu;
    TextView textViewTong;
    TextView textViewHieu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtA = (EditText) findViewById(R.id.edtA);
        edtB = (EditText) findViewById(R.id.edtB);
        textViewTong = (TextView) findViewById(R.id.textViewTong);
        textViewHieu = (TextView) findViewById(R.id.textViewHieu);
        btnTong = (Button) findViewById(R.id.btnTong);
        btnHieu = (Button) findViewById(R.id.btnHieu);

        btnTong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int num_a = Integer.parseInt(edtA.getText().toString());
                int num_b = Integer.parseInt(edtB.getText().toString());
                int tong = num_a+ num_b;

                textViewTong.setText("Tổng là: "+String.valueOf(tong));

            }
        });

        btnHieu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view2) {
                int num_a = Integer.parseInt(edtA.getText().toString());
                int num_b = Integer.parseInt(edtB.getText().toString());
                int hieu = num_a- num_b;

                textViewHieu.setText("Hiệu là: "+String.valueOf(hieu));

            }
        });
    }
}
