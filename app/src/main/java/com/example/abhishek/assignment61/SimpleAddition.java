package com.example.abhishek.assignment61;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View.OnClickListener;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SimpleAddition extends Fragment implements OnClickListener {

    private Button mbutton;
    private TextView mtxtview;
    private EditText mtxt;
    private String numtxt;


    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        View view = inflater.inflate(R.layout.simple_addition,container, false);
        mtxt = (EditText)view.findViewById(R.id.editText);
        mtxtview = (TextView)view.findViewById(R.id.textView);
        mbutton = (Button)view.findViewById(R.id.button);
        mbutton.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View view){

        numtxt = mtxt.getText().toString();
        mtxtview.setText(numtxt);


    }
}
