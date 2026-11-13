package com.example.kalkulator;
import android.app.Activity;
import android.os.Bundle;
import android.widget.*;
import android.view.Gravity;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setGravity(Gravity.CENTER);

        final EditText num1 = new EditText(this); num1.setHint("Liczba 1");
        final EditText num2 = new EditText(this); num2.setHint("Liczba 2");
        Button add = new Button(this); add.setText("Oblicz sumę");
        final TextView result = new TextView(this);

        add.setOnClickListener(v -> {
            try {
                double a = Double.parseDouble(num1.getText().toString());
                double b = Double.parseDouble(num2.getText().toString());
                result.setText("Wynik: " + (a + b));
            } catch (Exception e) { result.setText("Błąd!"); }
        });

        layout.addView(num1); layout.addView(num2); layout.addView(add); layout.addView(result);
        setContentView(layout);
    }
}
