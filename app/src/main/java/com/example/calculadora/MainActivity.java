package com.example.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button nine;
    Button eight;
    Button seven;
    Button six;
    Button five;
    Button four;
    Button three;
    Button two;
    Button one;
    Button zero;
    Button point;
    Button equal;
    Button divide;
    Button multiplication;
    Button sum;
    Button subtract;
    Button power;
    Button sine;
    Button cosine;
    Button allClear;

    TextView result;

    double suma;
    double resta;
    double multiplicacion;
    double division;
    int potencia;
    double seno;
    double coseno;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inicializa();
    }

    private void inicializa(){
        nine = findViewById(R.id.button25);
        eight = findViewById(R.id.button26);
        seven = findViewById(R.id.button27);
        divide = findViewById(R.id.button28);
        six = findViewById(R.id.button29);
        five = findViewById(R.id.button30);
        four = findViewById(R.id.button31);
        multiplication = findViewById(R.id.button32);
        three = findViewById(R.id.button33);
        two = findViewById(R.id.button34);
        one = findViewById(R.id.button35);
        subtract = findViewById(R.id.button36);
        point = findViewById(R.id.button37);
        zero = findViewById(R.id.button38);
        equal = findViewById(R.id.button39);
        sum = findViewById(R.id.button40);
        allClear = findViewById(R.id.button41);
        sine = findViewById(R.id.button42);
        cosine = findViewById(R.id.button43);
        power = findViewById(R.id.button44);
        result = (TextView) findViewById(R.id.textView2);
    }

    private void sumar(double x, double y){
        suma = x + y;
        String sumaString;
        sumaString = Double.toString(suma);
    }

    private void restar(double x, double y){
        resta = x - y;
        String restaString;
        restaString = Double.toString(resta);
    }

    private void multiplicar(double x, double y){
        multiplicacion = x * y;
        String multiplicacionString;
        multiplicacionString = Double.toString(multiplicacion);
    }

    private void dividir(double x, double y){
        division = x / y;
        String divisionString;
        divisionString = Double.toString(division);
    }

    private void potenciar(int x, int y){
        potencia = x ^ y;
        String potenciaString;
        potenciaString = Integer.toString(potencia);
    }

    //private void sinCalcular(double x){

    //}

    //private void cosCalcular(double x){

    //}

}
