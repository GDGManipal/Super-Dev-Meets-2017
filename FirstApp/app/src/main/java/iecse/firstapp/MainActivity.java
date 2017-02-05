package iecse.firstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv2;
    String s1 = "IECSE Dev Meets";
    String s2 = "Sunday 10 AM - 1 PM";
    String ip;
    boolean flag = false;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("MainActivity", "created");

        Button bt1= (Button) findViewById(R.id.button);
        tv2= (TextView) findViewById(R.id.textview2);

        editText = (EditText)findViewById(R.id.edit_text);

        bt1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        /*if (!flag){
                            tv2.setText(s2);
                        }
                        else{
                            tv2.setText(s1);
                        }

                        flag = !flag;*/

                        ip = editText.getText().toString();

                        if (!ip.isEmpty()){
                            tv2.setText(ip);
                        }

                    }
                }
        );
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

}
