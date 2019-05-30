package com.example.buttondemo;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SettingActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText sosSetEt;
    private EditText btn1SetEt;
    private EditText btn2SetEt;
    private EditText btn3SetEt;
    private EditText btn4SetEt;
    private EditText btn5SetEt;
    private EditText btn6SetEt;
    private EditText btn7SetEt;
    private EditText btn8SetEt;
    private EditText btnDeleteSetEt;
    private EditText btnSendSetEt;
    private EditText btnOkSetEt;
    private Button saveBtn;
    private SharedPreferences sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
        sosSetEt = findViewById(R.id.sos_setting_et);
        btn1SetEt = findViewById(R.id.btn1_setting_et);
        btn2SetEt = findViewById(R.id.btn2_setting_et);
        btn3SetEt = findViewById(R.id.btn3_setting_et);
        btn4SetEt = findViewById(R.id.btn4_setting_et);
        btn5SetEt = findViewById(R.id.btn5_setting_et);
        btn6SetEt = findViewById(R.id.btn6_setting_et);
        btn7SetEt = findViewById(R.id.btn7_setting_et);
        btn8SetEt = findViewById(R.id.btn8_setting_et);
        btnDeleteSetEt = findViewById(R.id.btn_delete_setting_et);
        btnSendSetEt = findViewById(R.id.btn_send_setting_et);
        btnOkSetEt = findViewById(R.id.btn_ok_setting_et);
        saveBtn = findViewById(R.id.save_btn);
        saveBtn.setOnClickListener(this);
        sp = getSharedPreferences("setting", MODE_PRIVATE);
        sosSetEt.setText(sp.getString("sosBtn", ""));
        btn1SetEt.setText(sp.getString("btn1", ""));
        btn2SetEt.setText(sp.getString("btn2", ""));
        btn3SetEt.setText(sp.getString("btn3", ""));
        btn4SetEt.setText(sp.getString("btn4", ""));
        btn5SetEt.setText(sp.getString("btn5", ""));
        btn6SetEt.setText(sp.getString("btn6", ""));
        btn7SetEt.setText(sp.getString("btn7", ""));
        btn8SetEt.setText(sp.getString("btn8", ""));
        btnDeleteSetEt.setText(sp.getString("btnDelete", ""));
        btnSendSetEt.setText(sp.getString("btnSend", ""));
        btnOkSetEt.setText(sp.getString("btnOk", ""));
    }

    private void save() {
        SharedPreferences.Editor editor = sp.edit();
        editor.putString("sosBtn", sosSetEt.getText().toString());
        editor.putString("btn1", btn1SetEt.getText().toString());
        editor.putString("btn2", btn2SetEt.getText().toString());
        editor.putString("btn3", btn3SetEt.getText().toString());
        editor.putString("btn4", btn4SetEt.getText().toString());
        editor.putString("btn5", btn5SetEt.getText().toString());
        editor.putString("btn6", btn6SetEt.getText().toString());
        editor.putString("btn7", btn7SetEt.getText().toString());
        editor.putString("btn8", btn8SetEt.getText().toString());
        editor.putString("btnDelete", btnDeleteSetEt.getText().toString());
        editor.putString("btnSend", btnSendSetEt.getText().toString());
        editor.putString("btnOk", btnOkSetEt.getText().toString());
        editor.apply();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.save_btn:
                save();
                Intent intent = new Intent(SettingActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
                break;
        }
    }
}
