package com.iecsemanipal.simplecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    float num1;
    float num2;
    float ans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText editText1 = (EditText)findViewById(R.id.edit_text_1);
        final EditText editText2 = (EditText)findViewById(R.id.edit_text_2);

        final Button addButton = (Button)findViewById(R.id.add_button);
        final Button subButton = (Button)findViewById(R.id.sub_button);
        final Button mulButton = (Button)findViewById(R.id.mul_button);
        final Button divButton = (Button)findViewById(R.id.div_button);

        final TextView resultTextView = (TextView)findViewById(R.id.text_view);

        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String temp = editText1.getText().toString();

                if (temp.isEmpty())
                    num1 = 0;
                else
                    num1 = Float.parseFloat(temp);

                temp = editText2.getText().toString();

                if (temp.isEmpty())
                    num2 = 0;
                else
                    num2 = Float.parseFloat(temp);


                if (view.getId() == addButton.getId()){
                    ans = num1 + num2;
                    resultTextView.setText(Float.toString(ans));
                }

                else if (view.getId() == subButton.getId()){
                    ans = num1 - num2;
                    resultTextView.setText(Float.toString(ans));

                }

                else if (view.getId() == mulButton.getId()){
                    ans = num1 * num2;
                    resultTextView.setText(Float.toString(ans));
                }

                else if (view.getId() == divButton.getId()){
                    if (num2 != 0) {
                        ans = num1 / num2;
                        resultTextView.setText(Float.toString(ans));
                    }
                    else{
                        resultTextView.setText("Undefined");

                        Toast.makeText(getApplicationContext(), "Divide by zero", Toast.LENGTH_SHORT).show();
                    }

                }

            }
        };

        addButton.setOnClickListener(onClickListener);
        subButton.setOnClickListener(onClickListener);
        mulButton.setOnClickListener(onClickListener);
        divButton.setOnClickListener(onClickListener);

    }
}
