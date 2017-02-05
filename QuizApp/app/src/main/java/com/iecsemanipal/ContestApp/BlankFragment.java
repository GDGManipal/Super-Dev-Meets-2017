package com.iecsemanipal.ContestApp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment extends Fragment {


    public BlankFragment() {
        // Required empty public constructor
    }
    EditText editText;
    TextView textView;
    Button button;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = (View) inflater.inflate(R.layout.fragment_blank, container, false);
        button = (Button) view.findViewById(R.id.sub);
        editText = (EditText) view.findViewById(R.id.edit);
        textView = (TextView) view.findViewById(R.id.ans);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editText.getText().toString().equals("sid")){
                    textView.setText("Correct");
                }
                else {
                    textView.setText("Incorrect");
                }
            }
        });
        return view;
    }


}
