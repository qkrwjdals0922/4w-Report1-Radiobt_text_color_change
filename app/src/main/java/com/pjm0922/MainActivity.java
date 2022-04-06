package com.pjm0922;

import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    TextView Sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("RadioButtonReport");

        Sp = (TextView) findViewById(R.id.text1);

        RadioGroup RG = (RadioGroup) findViewById(R.id.color);
        RG.setOnCheckedChangeListener(RdoCk);

        CheckBox ckb = (CheckBox) findViewById(R.id.ckb);
        ckb.setOnCheckedChangeListener(Cg);

        ToggleButton tg = (ToggleButton) findViewById(R.id.tg);
        tg.setOnCheckedChangeListener(Cg);
    }

        RadioGroup.OnCheckedChangeListener RdoCk =
                new RadioGroup.OnCheckedChangeListener() {
                    public void onCheckedChanged(RadioGroup group, int checkedId) {
                        if (group.getId() == R.id.color) {
                            switch (checkedId) {
                                case R.id.red:
                                    Sp.setTextColor(Color.RED);
                                    break;
                                case R.id.green:
                                    Sp.setTextColor(Color.GREEN);
                                    break;
                                case R.id.blue:
                                    Sp.setTextColor(Color.BLUE);
                                    break;
                            }
                        }
                    }
                };

        CompoundButton.OnCheckedChangeListener Cg =
                new CompoundButton.OnCheckedChangeListener() {
                    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                        if (buttonView.getId() == R.id.ckb) {
                            if (isChecked) {
                                Sp.setBackgroundColor(Color.WHITE);
                            } else {
                                Sp.setBackgroundColor(Color.YELLOW);
                            }
                        }
                        if (buttonView.getId() == R.id.tg) {
                            if (isChecked) {
                                Sp.setText("샘플");
                            } else {
                                Sp.setText("Sample");
                            }
                        }
                    }
                };
    }