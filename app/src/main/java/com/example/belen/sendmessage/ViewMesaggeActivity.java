package com.example.belen.sendmessage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Esta clase recibe el mensaje del usuario
 */
public class ViewMesaggeActivity extends AppCompatActivity {
    private TextView txvViewMessage;
    private TextView txvViewUser;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_mesagge);
        txvViewMessage= (TextView)findViewById(R.id.txvViewMessage);
        txvViewUser= (TextView)findViewById(R.id.txvViewUser);

        txvViewMessage.setText(getIntent().getExtras().getString("message"));
        String viewUser= String.format(getResources().getString(R.string.txvViewUser), getIntent().getExtras().getString("user"));
        txvViewUser.setText(viewUser);
    }
}
