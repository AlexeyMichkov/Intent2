package com.test.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void onClick(View v) {

        final EditText nameText = findViewById(R.id.name);
        final EditText companyText = findViewById(R.id.company);
        final EditText priceText = findViewById(R.id.price);

        String name = nameText.getText().toString();
        String company = companyText.getText().toString();
        int price = Integer.parseInt(priceText.getText().toString());

        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("name", name);
        intent.putExtra("company", company);
        intent.putExtra("price", price);
        startActivity(intent);
    }
}

/*В обработчике нажатия кнопки получаем введенные в текстовые поля EditText данные и передаем их в объект Intent с помощью метода putExtra().
Затем запускаем SecondActivity.
В итоге при нажатии на кнопку запустится SecondActivity, которая получит некоторые введенные в текстовые поля данные.
* */