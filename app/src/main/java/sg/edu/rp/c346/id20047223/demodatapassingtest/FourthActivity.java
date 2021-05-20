package sg.edu.rp.c346.id20047223.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class FourthActivity extends AppCompatActivity {

    TextView answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);

        answer = findViewById(R.id.tvdouble);

        Intent intent = getIntent();
        Double actValue = intent.getDoubleExtra("value",00.00);
        answer.setText("Double value received is: " + actValue);
    }
}