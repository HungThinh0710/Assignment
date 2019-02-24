package com.hungthinh.hithzsoz.btvn_events;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText edtSoA, edtSoB;
    private Button btnSubmit, btnActivity;
    private TextView txtResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        anonymouseListener();
    }

    private void init() {
        edtSoA = (EditText) findViewById(R.id.edtSoA);
        edtSoB = (EditText) findViewById(R.id.edtSoB);
        txtResult = (TextView) findViewById(R.id.txtResult);
        btnSubmit = (Button) findViewById(R.id.btnAnonymous);
        btnActivity = (Button) findViewById(R.id.btnActivity);
        btnActivity.setOnClickListener(this);
    }


    public void onclickxml(View view) {
        double result = Double.parseDouble(edtSoA.getText().toString() + Double.parseDouble(edtSoB.getText().toString()));
        txtResult.setText(String.valueOf(result));
    }

    private void anonymouseListener() {
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double result = Double.parseDouble(edtSoA.getText().toString() + Double.parseDouble(edtSoB.getText().toString()));
                txtResult.setText(String.valueOf(result));
            }
        });
    }


    @Override
    public void onClick(View v) {
        double result = Double.parseDouble(edtSoA.getText().toString() + Double.parseDouble(edtSoB.getText().toString()));
        txtResult.setText(String.valueOf(result));
    }
}
