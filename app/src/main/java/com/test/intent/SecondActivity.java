package com.test.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView textView = new TextView(this);
        textView.setTextSize(20);
        textView.setPadding(16, 16, 16, 16);

        Bundle arguments = getIntent().getExtras();

        if(arguments!=null){
            String name = arguments.get("name").toString();
            String company = arguments.getString("company");
            int price = arguments.getInt("price");
            textView.setText("Name: " + name + "\nCompany: " + company +
                    "\nPrice: " + price);
        }

        setContentView(textView);
    }
}

/*В данном случае в SecondActivity получаем все данных из объекта Bundle и выводим их в текстовое поле TextView.
Предполагается, что данной activity будут передаваться три элемента - две строки с ключами name и company и число с ключом price.*/