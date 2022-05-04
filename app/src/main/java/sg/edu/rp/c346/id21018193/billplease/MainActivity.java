package sg.edu.rp.c346.id21018193.billplease;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    EditText etxt1;
    EditText etxt2;
    EditText etxt3;
    ToggleButton togbtn1;
    ToggleButton togbtn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etxt1 = findViewById(R.id.et1);
        etxt2 = findViewById(R.id.et2);
        etxt3 = findViewById(R.id.et3);
        togbtn1 = findViewById(R.id.tbtn1);
        togbtn2 = findViewById(R.id.tbtn2);

        String amount = etxt1.getText().toString();
        Integer.parseInt(amount);
        String amount2 = etxt2.getText().toString();
        Integer.parseInt(amount2);
        String amount3 = etxt3.getText().toString();
        Double.parseDouble(amount3);
    }





}