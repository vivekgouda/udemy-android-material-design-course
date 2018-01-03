package com.gouda.vivek.sliders;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatSeekBar;
import android.widget.SeekBar;
import android.widget.TextView;

import com.appyvet.rangebar.RangeBar;

public class MainActivity extends AppCompatActivity {

    AppCompatSeekBar appCompatSeekBar;
    TextView appCompatSeekBarValue;
    RangeBar rangeBar1;
    TextView rangeBar1Value;
    RangeBar rangeBar2;
    TextView rangeBar2LeftValue;
    TextView rangeBar2RightValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        appCompatSeekBar = (AppCompatSeekBar) findViewById(R.id.appCompatSeekBar_id);
        appCompatSeekBarValue = (TextView) findViewById(R.id.appCompatSeekBar_value);
        rangeBar1 = (RangeBar) findViewById(R.id.rangBar1_id);
        rangeBar1Value = (TextView) findViewById(R.id.rangBar1_value);
        rangeBar2 = (RangeBar) findViewById(R.id.rangBar2_id);
        rangeBar2LeftValue = (TextView) findViewById(R.id.rangBar2_leftvalue);
        rangeBar2RightValue = (TextView) findViewById(R.id.rangBar2_rightvalue);

        appCompatSeekBar.setProgress(0);

        appCompatSeekBar.setKeyProgressIncrement(1);

        appCompatSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {

                String value = String.valueOf(i);

                appCompatSeekBarValue.setText(value);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        rangeBar1.setSeekPinByIndex(0);
        rangeBar1.setPinColor(getResources().getColor(R.color.colorAccent));
        rangeBar1.setSelectorColor(getResources().getColor(R.color.colorAccent));
        rangeBar1.setTickColor(getResources().getColor(R.color.colorAccent));
        rangeBar1.setConnectingLineColor(getResources().getColor(R.color.colorAccent));
//        rangeBar1.setBarColor(getResources().getColor(R.color.colorAccent));
        rangeBar1.setPinTextColor(getResources().getColor(R.color.colorRangeBarText));

        rangeBar1.setOnRangeBarChangeListener(new RangeBar.OnRangeBarChangeListener() {
            @Override
            public void onRangeChangeListener(RangeBar rangeBar, int leftPinIndex, int rightPinIndex, String leftPinValue, String rightPinValue) {

                rangeBar1Value.setText(rightPinValue);

            }
        });

        rangeBar2.setSeekPinByIndex(0);
        rangeBar2.setPinColor(getResources().getColor(R.color.colorAccent));
        rangeBar2.setSelectorColor(getResources().getColor(R.color.colorAccent));
        rangeBar2.setTickColor(getResources().getColor(R.color.colorAccent));
        rangeBar2.setConnectingLineColor(getResources().getColor(R.color.colorAccent));
//        rangeBar2.setBarColor(getResources().getColor(R.color.colorAccent));
        rangeBar2.setPinTextColor(getResources().getColor(R.color.colorRangeBarText));

        rangeBar2.setOnRangeBarChangeListener(new RangeBar.OnRangeBarChangeListener() {
            @Override
            public void onRangeChangeListener(RangeBar rangeBar, int leftPinIndex, int rightPinIndex, String leftPinValue, String rightPinValue) {

                rangeBar2LeftValue.setText(leftPinValue);
                rangeBar2RightValue.setText(rightPinValue);

            }
        });
    }
}
