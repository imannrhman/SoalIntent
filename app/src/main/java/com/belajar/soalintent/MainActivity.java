package com.belajar.soalintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
public ImageButton btngomart,btngofood,btngosend,btngojek;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btngomart = findViewById(R.id.btn_gomart);
        btngomart.setOnClickListener(this);
        btngofood = findViewById(R.id.btn_gofood);
        btngofood.setOnClickListener(this);
        btngojek = findViewById(R.id.btn_gojek);
        btngojek.setOnClickListener(this);
        btngosend = findViewById(R.id.btn_gosend);
        btngosend.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        OrderType orderType = new OrderType();
        Intent intent;
        switch (view.getId()){
            case R.id.btn_gomart:
                orderType.setIdOrderType(R.id.btn_gomart);
                orderType.setNameOrderType("Mart Order");
                orderType.setOrderPicture(R.drawable.menu_gomart);
                orderType.setButtonColor(R.drawable.buttonbiru);
                intent = new Intent(MainActivity.this,OrderActivity.class);
                intent.putExtra(OrderActivity.EXTRA_ORDER_TYPE,orderType);
                startActivity(intent);
                break;
            case R.id.btn_gojek:
                orderType.setIdOrderType(R.id.btn_gojek);
                orderType.setNameOrderType("Ride Order");
                orderType.setOrderPicture(R.drawable.menu_goride);
                orderType.setButtonColor(R.drawable.buttonkuning);
                intent = new Intent(MainActivity.this,OrderActivity.class);
                intent.putExtra(OrderActivity.EXTRA_ORDER_TYPE,orderType);
                startActivity(intent);
                break;
            case R.id.btn_gofood:
                orderType.setIdOrderType(R.id.btn_gofood);
                orderType.setNameOrderType("Food Order");
                orderType.setOrderPicture(R.drawable.menu_gofood);
                orderType.setButtonColor(R.drawable.buttonmerah);
                intent = new Intent(MainActivity.this,OrderActivity.class);
                intent.putExtra(OrderActivity.EXTRA_ORDER_TYPE,orderType);
                startActivity(intent);
                break;
            case R.id.btn_gosend:
                orderType.setIdOrderType(R.id.btn_gosend);
                orderType.setNameOrderType("Send Order");
                orderType.setOrderPicture(R.drawable.menu_gosend);
                orderType.setButtonColor(R.drawable.buttonhijau);
                intent = new Intent(MainActivity.this,OrderActivity.class);
                intent.putExtra(OrderActivity.EXTRA_ORDER_TYPE,orderType);
                startActivity(intent);
                break;
        }
    }
}
