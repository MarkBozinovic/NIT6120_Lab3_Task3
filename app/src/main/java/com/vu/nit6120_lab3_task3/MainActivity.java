package com.vu.nit6120_lab3_task3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity
{
    RadioButton button2010, button2012, button2013, button2014;
    Button submitButton;

    private String mAnswer;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button2010 = (RadioButton) findViewById(R.id.answer2010);
        button2012 = (RadioButton) findViewById(R.id.answer2012);
        button2013 = (RadioButton) findViewById(R.id.answer2013);
        button2014 = (RadioButton) findViewById(R.id.answer2014);


    }
}
