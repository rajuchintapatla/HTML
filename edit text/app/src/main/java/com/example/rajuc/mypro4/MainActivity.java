package com.example.rajuc.mypro4;

        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.CheckBox;
        import android.widget.EditText;
        import android.widget.TextView;
        import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText name = (EditText) findViewById(R.id.name);
        final EditText pass = (EditText) findViewById(R.id.pass);
        final Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView textshow = (TextView) findViewById(R.id.textView3);
                textshow.setText(name.getText().toString());
                TextView textshow1 = (TextView) findViewById(R.id.textView4);
                textshow1.setText(pass.getText().toString());

                Toast.makeText(MainActivity.this,"you have selected ",Toast.LENGTH_LONG).show();
            }


        });



    }
}
