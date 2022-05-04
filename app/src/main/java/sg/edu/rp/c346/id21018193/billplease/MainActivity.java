package sg.edu.rp.c346.id21018193.billplease;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    EditText etxt1;
    EditText etxt2;
    EditText etxt3;
    ToggleButton togbtn1;
    ToggleButton togbtn2;
    RadioButton Rbtn1;
    RadioButton Rbtn2;
    Button split;
    Button reset;
    TextView total;
    TextView perpax;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etxt1 = findViewById(R.id.et1);
        etxt2 = findViewById(R.id.et2);
        etxt3 = findViewById(R.id.et3);
        togbtn1 = findViewById(R.id.tbtn1);
        togbtn2 = findViewById(R.id.tbtn2);
        Rbtn1 = findViewById(R.id.rbtn1);
        Rbtn2 = findViewById(R.id.rbtn2);
        split = findViewById(R.id.btn1);
        reset = findViewById(R.id.btn2);
        total = findViewById(R.id.tv6);
        perpax = findViewById(R.id.tv8);

        String amount = etxt1.getText().toString();
        Integer.parseInt(amount);
        String people = etxt2.getText().toString();
        Integer.parseInt(people);
        String discount = etxt3.getText().toString();
        Double.parseDouble(discount);

    }





}