package com.example.medhaparashar.creditcard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        android.widget.EditText editText_cardbalance;
        android.widget.TextView textView_cardbalance;
        Button compute ;
        compute = (Button)findViewById(R.id.compute);

        compute.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                android.widget.EditText editText_cardbalance = (android.widget.EditText) findViewById(R.id.card_balance_text);
                android.widget.TextView textView_cardbalance = (TextView) findViewById(R.id.card_balance);
                String text_cardbalance = editText_cardbalance.getText().toString();
                Float text_cardbalance_f = Float.parseFloat(text_cardbalance);
                android.widget.Toast.makeText(getApplicationContext(), text_cardbalance, android.widget.Toast.LENGTH_SHORT).show();

            }
        });



    }
}
