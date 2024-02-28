package com.example.comeng2024mobilhafta02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("MCK","ON Restart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("MCK","ON Pause");
    }

    @Override
    protected void onDestroy() {

        Log.d("MCK","ON Destroy");
        super.onDestroy();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("MCK","ON Stop");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("MCK","ON Start");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("MCK","ON Resume");
    }

    EditText etDerece;
    TextView tvSonuc;
    RadioButton rbFah;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etDerece=(EditText) findViewById(R.id.editTextText);
        tvSonuc=(TextView)findViewById(R.id.textView);
        rbFah=(RadioButton)findViewById(R.id.radioButton);
    Log.d("MCK","ON CREATE");
    }

    public void myClick(View v){

        double Derece=Double.parseDouble(etDerece.getText().toString());
        double sonuc;
        String str;
        if(rbFah.isChecked()){
            sonuc=Derece*9.0/5.0+32;
            str="Girilen C " +Derece +":  "+sonuc +"Fahrenhayt";
        }
        else{
          sonuc=(Derece-32)*5.0/9.0;
            str="Girilen F " +Derece +":  "+sonuc +"Celsius";
        }

        tvSonuc.setText(str);
    }


}