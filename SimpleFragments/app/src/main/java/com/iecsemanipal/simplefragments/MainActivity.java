package com.iecsemanipal.simplefragments;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import layout.SecondFragment;

public class MainActivity extends AppCompatActivity {

    boolean flag = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*final BlankFragment fragment = new BlankFragment();

        getSupportFragmentManager().beginTransaction().add(R.id.main_container, fragment).commit();

        Button mainButton = (Button)findViewById(R.id.main_button);

        final SecondFragment secondFragment = new SecondFragment();

        mainButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

                if (!flag){
                    transaction.replace(R.id.main_container, secondFragment).commit();
                }
                else{
                    transaction.replace(R.id.main_container, fragment).commit();
                }

                flag = !flag;
            }
        });*/


    }
}
