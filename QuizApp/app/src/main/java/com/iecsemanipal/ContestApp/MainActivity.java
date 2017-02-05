package com.iecsemanipal.ContestApp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    boolean count;
    Button next, back;
    BlankFragment blankFragment;
    BlankFragment2 blankFragment2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        blankFragment = new BlankFragment();
        blankFragment2 = new BlankFragment2();
        getSupportFragmentManager().beginTransaction().add(R.id.contain, blankFragment).commit();
        next = (Button)findViewById(R.id.next);
        back = (Button)findViewById(R.id.back);

        count = true;

    }
    public void n(View v){
        count = false;
        if (count == true ){

            getSupportFragmentManager().beginTransaction().replace(R.id.contain, blankFragment).commit();
        }
        else{
            getSupportFragmentManager().beginTransaction().replace(R.id.contain, blankFragment2).commit();

        }
    }
    public void p(View v){
        count = true;
        if (count == true ){

            getSupportFragmentManager().beginTransaction().replace(R.id.contain, blankFragment).commit();
        }
        else{
            getSupportFragmentManager().beginTransaction().replace(R.id.contain, blankFragment2).commit();

        }

    }


}
