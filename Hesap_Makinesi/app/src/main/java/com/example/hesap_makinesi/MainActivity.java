package com.example.hesap_makinesi;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    EditText number1;
    EditText number2;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        number1 = findViewById(R.id.editTextNumber); // girilen ilk sayı
        number2 = findViewById(R.id.editTextNumber2); // ikinci sayı
        result = findViewById(R.id.textView); // Sonucu yazdıracağımız yer "TextView" kısmına dikkat

    }

    public void sum(View view){
        if(number1.getText().toString().equals("") || number2.getText().toString().equals("")){
            result.setText("Hata!");
        }
        else {
            int sayi1 = Integer.parseInt(number1.getText().toString());
            int sayi2 = Integer.parseInt(number2.getText().toString());
            int sonuc = sayi1 + sayi2;
            result.setText("Result: " + sonuc);
        }
    }
    public void sub(View view){
        if(number1.getText().toString().equals("") || number2.getText().toString().equals("")){
            result.setText("Hata!");
        }
        else {
            int sayi1 = Integer.parseInt(number1.getText().toString());
            int sayi2 = Integer.parseInt(number2.getText().toString());
            int sonuc = sayi1 - sayi2;
            result.setText("Result: " + sonuc);
        }
    }
    public void carpma(View view){
        if(number1.getText().toString().equals("") || number2.getText().toString().equals("")){
            result.setText("Hata!");
        }
        else {
            int sayi1 = Integer.parseInt(number1.getText().toString());
            int sayi2 = Integer.parseInt(number2.getText().toString());
            int sonuc = sayi1 * sayi2;
            result.setText("Result: " + sonuc);
        }
    }
    public void divide(View view){
        if(number1.getText().toString().equals("") || number2.getText().toString().equals("")){
            result.setText("Hata!");
        }
        else {
            int sayi1 = Integer.parseInt(number1.getText().toString());
            int sayi2 = Integer.parseInt(number2.getText().toString());
            double sonuc = sayi1 / sayi2;
            result.setText("Result: " + sonuc);
        }
    }
}