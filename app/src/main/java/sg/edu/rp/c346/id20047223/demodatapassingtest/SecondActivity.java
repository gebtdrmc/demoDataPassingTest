package sg.edu.rp.c346.id20047223.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView tvAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tvAnswer = findViewById(R.id.textview);

        Intent intentReceived = getIntent();
        int actValue = intentReceived.getIntExtra("value", 0);
        tvAnswer.setText("The Integer Value Received is: " + actValue);

    }
}