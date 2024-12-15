package com.example.extra12;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText editTextBrand;
    private EditText editTextYear;
    private Button buttonCreateCar;
    private Button buttonGo;
    private TextView textViewResult;

    private Car car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextBrand = findViewById(R.id.editTextBrand);
        editTextYear = findViewById(R.id.editTextYear);
        buttonCreateCar = findViewById(R.id.buttonCreateCar);
        buttonGo = findViewById(R.id.buttonGo);
        textViewResult = findViewById(R.id.textViewResult);

        // Обработчик для создания объекта Car
        buttonCreateCar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String brand = editTextBrand.getText().toString();
                String yearStr = editTextYear.getText().toString();

                if (!brand.isEmpty() && !yearStr.isEmpty()) {
                    int year = Integer.parseInt(yearStr);
                    car = new Car(brand, year);
                    textViewResult.setText("Машина создана: " + car.getInfo());
                } else {
                    textViewResult.setText("Введите марку и год.");
                }
            }
        });

        // Обработчик для вызова метода go()
        buttonGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (car != null) {
                    car.go();
                    textViewResult.setText("Машина едет: " + car.getInfo());
                } else {
                    textViewResult.setText("Сначала создайте машину.");
                }
            }
        });
    }
}