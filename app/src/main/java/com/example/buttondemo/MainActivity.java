package com.example.buttondemo;

import android.content.SharedPreferences;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button deleteBtn,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,sendBtn,okBtn,sosBtn;
    private EditText inputEt;
    private SharedPreferences sp;
    private boolean reverse1, reverse2, reverse3, reverse4, reverse5, reverse6, reverse7, reverse8;
    private boolean reverseSOS, reverseDelete, reverseSend, reverseOk;
    private int countSOS, count, count2, count3, count4, count5, count6, count7, count8, countDelete, countSend, countOk;
    private ScheduledExecutorService exec;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sp = getSharedPreferences("setting", MODE_PRIVATE);
        deleteBtn = findViewById(R.id.delete_btn);
        btn1 = findViewById(R.id.btn_1);
        btn2 = findViewById(R.id.btn_2);
        btn3 = findViewById(R.id.btn_3);
        btn4 = findViewById(R.id.btn_4);
        btn5 = findViewById(R.id.btn_5);
        btn6 = findViewById(R.id.btn_6);
        btn7 = findViewById(R.id.btn_7);
        btn8 = findViewById(R.id.btn_8);
        sendBtn = findViewById(R.id.send_btn);
        okBtn = findViewById(R.id.ok_btn);
        sosBtn = findViewById(R.id.sos_btn);
        inputEt = findViewById(R.id.input);

        deleteBtn.setOnClickListener(this);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        sendBtn.setOnClickListener(this);
        okBtn.setOnClickListener(this);
        sosBtn.setOnClickListener(this);

        exec = new ScheduledThreadPoolExecutor(12); // 12个线程
        // 按钮SOS
        exec.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                if (reverseSOS) {
                    sosBtn.setBackgroundResource(R.drawable.shape_corner_btn_black);
                    sosBtn.setTextColor(Color.parseColor("#ffffff"));
                    reverseSOS = false;
                } else {
                    sosBtn.setBackgroundResource(R.drawable.shape_corner_btn_white);
                    sosBtn.setTextColor(Color.parseColor("#000000"));
                    reverseSOS = true;
                    countSOS++;
                }
            }
        }, Integer.valueOf(sp.getString("sosBtn", "1000000")),
                Integer.valueOf(sp.getString("sosBtn", "1000000")), TimeUnit.MILLISECONDS);

        // 按钮1
        exec.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                if (reverse1) {
                    btn1.setBackgroundResource(R.drawable.shape_corner_btn_black);
                    btn1.setTextColor(Color.parseColor("#ffffff"));
                    reverse1 = false;
                } else {
                    btn1.setBackgroundResource(R.drawable.shape_corner_btn_white);
                    btn1.setTextColor(Color.parseColor("#000000"));
                    reverse1 = true;
                    count++;
                }
            }
        }, Integer.valueOf(sp.getString("btn1", "1000000")), Integer.valueOf(sp.getString("btn1", "1000000")), TimeUnit.MILLISECONDS);

        // 按钮2
        exec.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                if (reverse2) {
                    btn2.setBackgroundResource(R.drawable.shape_corner_btn_black);
                    btn2.setTextColor(Color.parseColor("#ffffff"));
                    reverse2 = false;
                } else {
                    btn2.setBackgroundResource(R.drawable.shape_corner_btn_white);
                    btn2.setTextColor(Color.parseColor("#000000"));
                    reverse2 = true;
                    count2++;
                }
            }
        }, Integer.valueOf(sp.getString("btn2", "1000000")),
                Integer.valueOf(sp.getString("btn2", "1000000")), TimeUnit.MILLISECONDS);

        // 按钮3
        exec.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                if (reverse3) {
                    btn3.setBackgroundResource(R.drawable.shape_corner_btn_black);
                    btn3.setTextColor(Color.parseColor("#ffffff"));
                    reverse3 = false;
                } else {
                    btn3.setBackgroundResource(R.drawable.shape_corner_btn_white);
                    btn3.setTextColor(Color.parseColor("#000000"));
                    reverse3 = true;
                    count3++;
                }
            }
        }, Integer.valueOf(sp.getString("btn3", "1000000")),
                Integer.valueOf(sp.getString("btn3", "1000000")), TimeUnit.MILLISECONDS);

        // 按钮4
        exec.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                if (reverse4) {
                    btn4.setBackgroundResource(R.drawable.shape_corner_btn_black);
                    btn4.setTextColor(Color.parseColor("#ffffff"));
                    reverse4 = false;
                } else {
                    btn4.setBackgroundResource(R.drawable.shape_corner_btn_white);
                    btn4.setTextColor(Color.parseColor("#000000"));
                    reverse4 = true;
                    count4++;
                }
            }
        }, Integer.valueOf(sp.getString("btn4", "1000000")),
                Integer.valueOf(sp.getString("btn4", "1000000")), TimeUnit.MILLISECONDS);

        // 按钮5
        exec.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                if (reverse5) {
                    btn5.setBackgroundResource(R.drawable.shape_corner_btn_black);
                    btn5.setTextColor(Color.parseColor("#ffffff"));
                    reverse5 = false;
                } else {
                    btn5.setBackgroundResource(R.drawable.shape_corner_btn_white);
                    btn5.setTextColor(Color.parseColor("#000000"));
                    reverse5 = true;
                    count5++;
                }
            }
        }, Integer.valueOf(sp.getString("btn5", "1000000")),
                Integer.valueOf(sp.getString("btn5", "1000000")), TimeUnit.MILLISECONDS);

        // 按钮6
        exec.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                if (reverse6) {
                    btn6.setBackgroundResource(R.drawable.shape_corner_btn_black);
                    btn6.setTextColor(Color.parseColor("#ffffff"));
                    reverse6 = false;
                } else {
                    btn6.setBackgroundResource(R.drawable.shape_corner_btn_white);
                    btn6.setTextColor(Color.parseColor("#000000"));
                    reverse6 = true;
                    count6++;
                }
            }
        }, Integer.valueOf(sp.getString("btn6", "1000000")),
                Integer.valueOf(sp.getString("btn6", "1000000")), TimeUnit.MILLISECONDS);

        // 按钮7
        exec.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                if (reverse7) {
                    btn7.setBackgroundResource(R.drawable.shape_corner_btn_black);
                    btn7.setTextColor(Color.parseColor("#ffffff"));
                    reverse7 = false;
                } else {
                    btn7.setBackgroundResource(R.drawable.shape_corner_btn_white);
                    btn7.setTextColor(Color.parseColor("#000000"));
                    reverse7 = true;
                    count7++;
                }
            }
        }, Integer.valueOf(sp.getString("btn7", "1000000")),
                Integer.valueOf(sp.getString("btn7", "1000000")), TimeUnit.MILLISECONDS);

        // 按钮8
        exec.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                if (reverse8) {
                    btn8.setBackgroundResource(R.drawable.shape_corner_btn_black);
                    btn8.setTextColor(Color.parseColor("#ffffff"));
                    reverse8 = false;
                } else {
                    btn8.setBackgroundResource(R.drawable.shape_corner_btn_white);
                    btn8.setTextColor(Color.parseColor("#000000"));
                    reverse8 = true;
                    count8++;
                }
            }
        }, Integer.valueOf(sp.getString("btn8", "1000000")),
                Integer.valueOf(sp.getString("btn8", "1000000")), TimeUnit.MILLISECONDS);

        // 按钮“清除”
        exec.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                if (reverseDelete) {
                    deleteBtn.setBackgroundResource(R.drawable.shape_corner_btn_black);
                    deleteBtn.setTextColor(Color.parseColor("#ffffff"));
                    reverseDelete = false;
                } else {
                    deleteBtn.setBackgroundResource(R.drawable.shape_corner_btn_white);
                    deleteBtn.setTextColor(Color.parseColor("#000000"));
                    reverseDelete = true;
                    countDelete++;
                }
            }
        }, Integer.valueOf(sp.getString("btnDelete", "1000000")),
                Integer.valueOf(sp.getString("btnDelete", "1000000")), TimeUnit.MILLISECONDS);

        // 按钮“发送”
        exec.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                if (reverseSend) {
                    sendBtn.setBackgroundResource(R.drawable.shape_corner_btn_black);
                    sendBtn.setTextColor(Color.parseColor("#ffffff"));
                    reverseSend = false;
                } else {
                    sendBtn.setBackgroundResource(R.drawable.shape_corner_btn_white);
                    sendBtn.setTextColor(Color.parseColor("#000000"));
                    reverseSend = true;
                    countSend++;
                }
            }
        }, Integer.valueOf(sp.getString("btnSend", "1000000")),
                Integer.valueOf(sp.getString("btnSend", "1000000")), TimeUnit.MILLISECONDS);

        // 按钮“确定”
        exec.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                if (reverseOk) {
                    okBtn.setBackgroundResource(R.drawable.shape_corner_btn_black);
                    okBtn.setTextColor(Color.parseColor("#ffffff"));
                    reverseOk = false;
                } else {
                    okBtn.setBackgroundResource(R.drawable.shape_corner_btn_white);
                    okBtn.setTextColor(Color.parseColor("#000000"));
                    reverseOk = true;
                    countOk++;
                }
            }
        }, Integer.valueOf(sp.getString("btnOk", "1000000")), Integer.valueOf(sp.getString("btnOk", "1000000")), TimeUnit.MILLISECONDS);

//        exec.schedule(new Runnable() {
//            @Override
//            public void run() {
//                runOnUiThread(new Runnable() {
//                    @Override
//                    public void run() {
//                        countTv.setText("count:" + count);
//                        count2Tv.setText("count2:" + count2);
//                    }
//                });
//            }
//        }, 10000, TimeUnit.MILLISECONDS);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_1:
                inputEt.setText(inputEt.getText().toString()+btn1.getText().toString());
                break;
            case R.id.btn_2:
                inputEt.setText(inputEt.getText().toString()+btn2.getText().toString());
                break;
            case R.id.btn_3:
                inputEt.setText(inputEt.getText().toString()+btn3.getText().toString());
                break;
            case R.id.btn_4:
                inputEt.setText(inputEt.getText().toString()+btn4.getText().toString());
                break;
            case R.id.btn_5:
                inputEt.setText(inputEt.getText().toString()+btn5.getText().toString());
                break;
            case R.id.btn_6:
                inputEt.setText(inputEt.getText().toString()+btn6.getText().toString());
                break;
            case R.id.btn_7:
                inputEt.setText(inputEt.getText().toString()+btn7.getText().toString());
                break;
            case R.id.btn_8:
                inputEt.setText(inputEt.getText().toString()+btn8.getText().toString());
                break;
            case R.id.delete_btn:
                inputEt.setText("");
                break;
            case R.id.send_btn:
                inputEt.setText(inputEt.getText().toString()+sendBtn.getText().toString());
                break;
            case R.id.ok_btn:
                inputEt.setText(inputEt.getText().toString()+okBtn.getText().toString());
                break;
            case R.id.sos_btn:
                inputEt.setText(inputEt.getText().toString()+"sos");
                break;
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        exec.shutdown();
    }
}
