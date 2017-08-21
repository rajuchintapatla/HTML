
package com.example.rajuc.spinner;




import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<String> countries= new ArrayList<String>();
        countries.add("india");
        countries.add("america");
        countries.add("kakinada");
        countries.add("Uk");
        countries.add("canada");
        Spinner spinner=(Spinner)findViewById(R.id.spinner);
        ArrayAdapter arrayAdapter =  new ArrayAdapter(this,android.R.layout.simple_selectable_list_item,countries);



    }
}
