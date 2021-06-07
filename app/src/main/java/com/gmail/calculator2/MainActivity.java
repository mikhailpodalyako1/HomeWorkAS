package com.gmail.calculator2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    //111
    private TextView enterText;
    private String stringEnterText = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }
    private void initViews() {
        initTextViews();
        initButtons();
    }

    private void initTextViews() {
        enterText = findViewById(R.id.count_text);
//        resultText = findViewById(R.id.result_text);
    }

    // инициализируем клавиши
    private void initButtons() {
        Button btn0 = findViewById(R.id.key_0);
        Button btn1 = findViewById(R.id.key_1);
        Button btn2 = findViewById(R.id.key_2);
        Button btn3 = findViewById(R.id.key_3);
        Button btn4 = findViewById(R.id.key_4);
        Button btn5 = findViewById(R.id.key_5);
        Button btn6 = findViewById(R.id.key_6);
        Button btn7 = findViewById(R.id.key_7);
        Button btn8 = findViewById(R.id.key_8);
        Button btn9 = findViewById(R.id.key_9);
        Button btnDot = findViewById(R.id.key_dot);
        Button btnPlus = findViewById(R.id.key_plus);
        Button btnMinus = findViewById(R.id.key_minus);
        Button btnDv = findViewById(R.id.key_divided);
        Button btnX = findViewById(R.id.key_X);
        Button btnEq = findViewById(R.id.key_equals);
        Button btnC = findViewById(R.id.key_clear);
        Button btnBack = findViewById(R.id.key_backspace);
        //создаем массив инициализированных кнопок
        Button[] buttons = {btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnDot, btnPlus, btnMinus, btnDv, btnX, btnEq, btnBack, btnC};

        for (int i = 0; i < buttons.length; i++) {
            clickBtn(buttons[i]);
        }
    }
    //делаем кнопки кликабельными
    private void clickBtn(Button btn) {
        btn.setOnClickListener(this);
    }

    private void addEnterText(char c) {
        stringEnterText = String.format("%s,%c", stringEnterText, c);
        enterText.setText(stringEnterText);
    }

    //очистить все текстовое поле view
    private void ClearTextVieW() {
        stringEnterText = "";
        enterText.setText(stringEnterText);
    }


    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.key_0) {
            addEnterText('0');
        }
        if (view.getId() == R.id.key_1) {
            addEnterText('1');
        }
        if (view.getId() == R.id.key_2) {
            addEnterText('2');
        }
        if (view.getId() == R.id.key_3) {
            addEnterText('3');
        }
        if (view.getId() == R.id.key_4) {
            addEnterText('4');
        }
        if (view.getId() == R.id.key_5) {
            addEnterText('5');
        }
        if (view.getId() == R.id.key_6) {
            addEnterText('6');
        }
        if (view.getId() == R.id.key_7) {
            addEnterText('7');
        }
        if (view.getId() == R.id.key_8) {
            addEnterText('8');
        }
        if (view.getId() == R.id.key_9) {
            addEnterText('9');
        }
    }
}