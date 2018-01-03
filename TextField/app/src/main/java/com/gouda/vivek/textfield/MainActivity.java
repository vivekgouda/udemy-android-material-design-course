package com.gouda.vivek.textfield;

import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatEditText;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    AppCompatEditText username;
    AppCompatEditText password;
    RelativeLayout relativeLayout;
    TextInputLayout userLayout;
    TextInputLayout passLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = (AppCompatEditText) findViewById(R.id.username_TextField);
        password = (AppCompatEditText) findViewById(R.id.password_TextField);
        relativeLayout = (RelativeLayout) findViewById(R.id.activity_main);
        userLayout = (TextInputLayout) findViewById(R.id.username_TextInputLayout);
        passLayout = (TextInputLayout) findViewById(R.id.password_TextInputLayout);

        relativeLayout.setOnClickListener(null);

        username.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {

                if (username.getText().toString().isEmpty()){

                    userLayout.setErrorEnabled(true);
                    userLayout.setError("please enter your username !!");

                }else {
                    userLayout.setErrorEnabled(false);
                }
            }

        });

        username.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                if (username.getText().toString().isEmpty()){

                    userLayout.setErrorEnabled(true);
                    userLayout.setError("please enter your username !!");

                }else {
                    userLayout.setErrorEnabled(false);
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        passLayout.setCounterEnabled(true);
        passLayout.setCounterMaxLength(8);

//        username.addTextChangedListener(new TextWatcher() {
//            @Override
//            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
////                System.out.println(charSequence);
//            }
//
//            @Override
//            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
////                System.out.println(charSequence);
//            }
//
//            @Override
//            public void afterTextChanged(Editable editable) {
////                System.out.println("after"");
//            }
//        });

//        username.setOnFocusChangeListener(new View.OnFocusChangeListener() {
//            @Override
//            public void onFocusChange(View view, boolean b) {
////                System.out.println(b);
//            }
//        });

    }
}
