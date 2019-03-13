package com.example.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

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

    double suma;
    double resta;
    double multiplicacion;
    double division;
    double potencia;
    double seno;

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
    }

    private void sumar(int x, int y){
        suma = x + y;
        String sumaString;
        sumaString = Integer.toString(suma);
    }

    private void restar(int x, int y){
        resta = x - y;
        String restaString;
        restaString = Integer.toString(resta);
    }

    private void multiplicar(int x, int y){
        multiplicacion = x * y;
        String multiplicacionString;
        multiplicacionString = Integer.toString(multiplicacion);
    }

    private void dividir(int x, int y){
        division = x / y;
        String divisionString;
        divisionString = Integer.toString(division);
    }

    private void potenciar(int x, int y){
        potencia = x ^ y;
        String potenciaString;
        potenciaString = Integer.toString(potencia);
    }

    private void sinCalcular(int x){
        seno =
    }
}
