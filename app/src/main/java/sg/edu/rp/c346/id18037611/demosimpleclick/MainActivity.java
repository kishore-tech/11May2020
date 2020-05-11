package sg.edu.rp.c346.id18037611.demosimpleclick;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View.OnClickListener;
import android.widget.ToggleButton;


public class MainActivity extends AppCompatActivity {


    TextView tvDisplay;
    Button btnDisplay;
    EditText etInput;
    ToggleButton tgbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvDisplay = findViewById(R.id.textViewDisplay);
        btnDisplay = findViewById(R.id.buttonDisplay);
        etInput = findViewById(R.id.editText);
        tgbtn = findViewById(R.id.toggleButton);

        btnDisplay.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                String stringResponse = etInput.getText().toString();
                tvDisplay.setText(stringResponse);
            }
        });

        tgbtn.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

                if(tgbtn.isChecked()){
                    etInput.setEnabled(true);
                }
                else
                    {
                        etInput.setEnabled(false);
                    }
            }
        });


    }
}
