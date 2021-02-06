package com.example.firstlook;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button mButton;
    private TextView mTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Create a Button Handler
        mButton = (Button) findViewById(R.id.mButton);
        mButton.setText(R.string.button_name);

        //Create a TextView handler
        mTextView = (TextView) findViewById(R.id.mTextView);

        //Liserning events from a button
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mTextView.setVisibility(View.VISIBLE);
                mTextView.setText(R.string.show_text);
            }
        });


    }

//    public void ShowMe(View view) {
//
//       mText.setVisibility(View.VISIBLE);
//
//       mText.setText(R.string.show_text);
//
//    }
}