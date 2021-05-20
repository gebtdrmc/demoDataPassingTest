package sg.edu.rp.c346.id20047223.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {

    TextView answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        answer = findViewById(R.id.textViewChar);

        Intent intentRe = getIntent();
        char actValue = intentRe.getCharExtra("value",'x');
        answer.setText("The Character value received is: " + actValue);
    }
}