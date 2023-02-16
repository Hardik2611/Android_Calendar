package com.example.hardikgoyal_calendar;

import androidx.annotation.NonNull;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CalendarView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button;
    CalendarView calendarview;
    TextView textView;
    String s1="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        calendarview = findViewById(R.id.calendarView);
        button = findViewById(R.id.button);
        textView = findViewById(R.id.result);
        calendarview.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView calendarView, int i, int i1, int i2) {
                s1 = i2 +" / "+(i1+1)+" / "+i;
                Toast.makeText(MainActivity.this, ""+s1, Toast.LENGTH_LONG).show();
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(s1);
            }
        });
    }
}