package com.belajar.soalintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.shapes.Shape;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class OrderActivity extends AppCompatActivity  {
public static String EXTRA_ORDER_TYPE = "extra_order_type";
public TextView tvAction;
public EditText etAction,etName,etAdrres;
public TextView tvOrderType;
public ImageView imgLogo;


@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);



        imgLogo = findViewById(R.id.img_order_type);
        tvOrderType = findViewById(R.id.order_name);
        final OrderType orderType = getIntent().getParcelableExtra(EXTRA_ORDER_TYPE);
        imgLogo.setImageResource(orderType.getOrderPicture());
        tvOrderType.setText(orderType.getNameOrderType());

        Button buttonDrawlable = findViewById(R.id.btn_order);
        buttonDrawlable.setBackground(getApplicationContext().getDrawable(orderType.getButtonColor()));


        etName = findViewById(R.id.user_name);
        etAdrres = findViewById(R.id.user_addres);
        etAction = findViewById(R.id.user_action);
        tvAction = findViewById(R.id.tv_action);

    if (orderType.getIdOrderType() == R.id.btn_gojek){

            tvAction.setText("Motor     :");
           etAction.setHint("Masukan Jenis Motor");
        }else if(orderType.getIdOrderType() == R.id.btn_gosend){

            tvAction.setText("Barang   :");
            etAction.setHint("Masukan Barang yang Dikirim");
        }



        Button btnOrder = findViewById(R.id.btn_order);
        btnOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(OrderActivity.this,InfoOrder.class);
                intent.putExtra("name",etName.getText().toString());
                intent.putExtra("addres",etAdrres.getText().toString());
                intent.putExtra("type",orderType.getNameOrderType().toString());
                intent.putExtra("orderaction",etAction.getText().toString());
                intent.putExtra("order",tvAction.getText().toString());

                startActivity(intent);
            }
        });

    }



}
