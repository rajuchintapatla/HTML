package com.example.rajuc.mypro1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView txtview;
                txtview =(TextView)findViewById(R.id.textView);
        txtview.setText("this is A JAVA project");


    }
}
