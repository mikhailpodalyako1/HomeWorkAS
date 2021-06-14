package com.gmail.calculator2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private CalculatorModel calculator;

    private TextView text;
    // смена тем
    private ThemeStorge storage;
    // смена тем

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

// смена тем
        storage = new ThemeStorge(this);
        setTheme(storage.getTheme().getResource());
        setContentView(R.layout.activity_main);
// смена тем

        findViewById(R.id.key_change_theme_cust).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                storage.setTheme(Theme.CUSTOM);
                recreate();
            }
        });

        findViewById(R.id.key_change_theme_def).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                storage.setTheme(Theme.DEFAULT);
                recreate();
            }
        });
        //смена тем

        int[] numberIds = new int[] {
                R.id.key_0,
                R.id.key_1,
                R.id.key_2,
                R.id.key_3,
                R.id.key_4,
                R.id.key_5,
                R.id.key_6,
                R.id.key_7,
                R.id.key_8,
                R.id.key_9
        };

        int[] actionsIds = new int[] {
                R.id.key_plus,
                R.id.key_minus,
                R.id.key_multiple,
                R.id.key_divided,
                R.id.key_equals
        };

        text = findViewById(R.id.count_text);

        calculator = new CalculatorModel();

        View.OnClickListener numberButtonClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculator.onNumPressed(view.getId());
                text.setText(calculator.getText());
            }
        };

        View.OnClickListener actionButtonOnclickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculator.onActionPressed(view.getId());
                text.setText(calculator.getText());
            }
        };

        for (int i = 0; i < numberIds.length; i++) {
            findViewById(numberIds[i]).setOnClickListener(numberButtonClickListener);
        }

        for (int i = 0; i < actionsIds.length; i++) {
            findViewById(actionsIds[i]).setOnClickListener(actionButtonOnclickListener);
        }

        findViewById(R.id.key_reset).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculator.reset();
                text.setText(calculator.getText());
            }
        });
    }
}