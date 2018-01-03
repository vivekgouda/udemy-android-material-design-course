package com.gouda.vivek.radiobutton;

import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatRadioButton;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

//    AppCompatRadioButton radioButton;

    RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = (RadioGroup) findViewById(R.id.RadioGroup_id);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {

                switch (i) {

                    case R.id.RadioButton1_id :

                        Toast.makeText(getApplicationContext(), "Radio Button 1", Toast.LENGTH_SHORT).show();

                        break;

                    case R.id.RadioButton2_id :

                        Toast.makeText(getApplicationContext(), "Radio Button 2", Toast.LENGTH_SHORT).show();

                        break;
                }
            }
        });

//        radioButton = (AppCompatRadioButton) findViewById(R.id.RadioButton1_id);
//
//        radioButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
//
//                System.out.println(b);
//
//            }
//        });
    }
}
