package com.iecsemanipal.activityswitching;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        setTitle("Activity 2");

        TextView messageTextView = (TextView)findViewById(R.id.message_text_view);

        messageTextView.setText(getIntent().getStringExtra("message"));
    }
}
