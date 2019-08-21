package com.belajar.soalintent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class InfoOrder extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_order);

        TextView tvName = findViewById(R.id.tv_name_info);
        TextView tvAddres = findViewById(R.id.tv_addres_info);
        TextView tvType = findViewById(R.id.tv_type_info);
        TextView order = findViewById(R.id.order_info);
        TextView tvOrder = findViewById(R.id.tv_order_info);

        Bundle bundle = getIntent().getExtras();
        String name = bundle.getString("name");
        String addres = bundle.getString("addres");
        String type = bundle.getString("type");
        String orders = bundle.getString("orderaction");
        String pesanan = bundle.getString("order");

        tvName.setText(name);
        tvAddres.setText(addres);
        tvType.setText(type);
        order.setText(pesanan);
        tvOrder.setText(orders);





    }
}
