package sg.edu.rp.c346.id18037611.thebillcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ToggleButton;

import java.time.Clock;

public class MainActivity extends AppCompatActivity {


    EditText amt;
    EditText pax;
    EditText discount;

    ToggleButton svs1;
    ToggleButton gst1;

    TextView total;
    TextView each;

    Button split;
    Button reset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //EditText
        amt = findViewById(R.id.inputAmt);
        pax = findViewById(R.id.inputPax);
        discount = findViewById(R.id.inputDiscount);

        //Toggle Buttons
        svs1= findViewById(R.id.svs);
        gst1= findViewById(R.id.gst);

        //TextViews
        total = findViewById(R.id.total);
        each = findViewById(R.id.each);

        //Buttons
        split = findViewById(R.id.split);
        reset = findViewById(R.id.reset);


        //Calculations
         final double a = Integer.parseInt("amt");
         double b = Integer.parseInt("pax");

         final double x = a/b;




                //Toggle Buttons
        svs1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(svs1.isChecked()){
                    double service = a*0.1;
                   // double charge =  a + service;

                }
                else
                {
                    double noService = x;
                }
            }

        });
        gst1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(gst1.isChecked()){
                    double tax = a*0.07;
                }
                else
                {
                    double noTax= x;
                }
            }
        });

        total.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String response = "";
            }
        });



    }
}
