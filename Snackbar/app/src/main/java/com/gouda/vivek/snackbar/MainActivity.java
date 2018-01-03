package com.gouda.vivek.snackbar;

import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Snackbar snackbar;
    FloatingActionButton fab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fab = (FloatingActionButton) findViewById(R.id.fab_id);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                snackbar = snackbar.make(view,"Message Sent...",Snackbar.LENGTH_INDEFINITE);
                snackbar.setDuration(10000);
                snackbar.setAction("OK", new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        snackbar.dismiss();

                    }
                });

                View v = snackbar.getView();
                v.setBackgroundColor(getResources().getColor(R.color.colorSnackbarBackground));

                TextView txt = (TextView) v.findViewById(android.support.design.R.id.snackbar_text);
                txt.setTextColor(getResources().getColor(R.color.colorSnackbarText));

                TextView txtAction = (TextView) v.findViewById(android.support.design.R.id.snackbar_action);
                txtAction.setTextColor(getResources().getColor(R.color.colorSnackbarActionText));

                snackbar.show();

            }
        });

       /*
        View view = (View) findViewById(R.id.activity_main);

//        Snackbar.make(view,"Hello In Snackbar",Snackbar.LENGTH_LONG).show();

        snackbar = Snackbar.make(view,"Hello In Snackbar",Snackbar.LENGTH_INDEFINITE);
        snackbar.setDuration(10000);
        snackbar.show();
//        snackbar.dismiss();

        */
    }
}
