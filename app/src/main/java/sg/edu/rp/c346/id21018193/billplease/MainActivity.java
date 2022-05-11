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

        if ((togbtn1 == true) && (togbtn2 == false)) {
            String endamt1= (amount + (amount * 0.07)) - (amount * discount);
            total.setText(endamt1);
            String eachpax= (endamt1 / etxt2);
            perpax.setText(eachpax);
            if (Rbtn1 == boolean isChecked; {
                System.out.println("Pay " + perpax + " in cash");
            }
            else {
                System.out.println("Pay " + perpax + " to 91234567");
            }
        }
        if ((togbtn1 == false) && (togbtn2 == true)) {
            String endamt2= (amount + (amount * 0.1)) - (amount * discount);
            total.setText(endamt2);
            String eachpax= (endamt2 / etxt2);
            perpax.setText(eachpax);
            if (Rbtn1 == boolean isChecked; {
                System.out.println("Pay " + perpax + " in cash");
            }
            else {
                System.out.println("Pay " + perpax + " to 91234567");
            }
        }
        if ((togbtn1 == true) && (togbtn2 == true)) {
            String endamt3= (amount + (amount * 0.07)+ (amount * 0.1)) - (amount * discount);
            total.setText(endamt3);
            String eachpax= (endamt3 / etxt2);
            perpax.setText(eachpax);
            if (Rbtn1 == boolean isChecked; {
                System.out.println("Pay " + perpax + " in cash");
            }
            else {
                System.out.println("Pay " + perpax + " to 91234567");
            }
        }
        else {
            String endamt4= amount - (amount * discount);
            total.setText(endamt4);
            String eachpax= (endamt4 / etxt2);
            perpax.setText(eachpax);
            if (Rbtn1 == boolean isChecked; {
                System.out.println("Pay " + perpax + " in cash");
            }
            else {
                System.out.println("Pay " + perpax + " to 91234567");
            }
        }
    }





}