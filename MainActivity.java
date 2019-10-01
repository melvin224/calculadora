package com.itla.calculadora1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnsum, btnminus, btndiv, btnpercent, btnroot, btnequal, btnmult;
        TextView txtpantalla;
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btnsum = findViewById(R.id.btnsum);
        btnminus = findViewById(R.id.btnminus);
        btnmult = findViewById(R.id.btnmult);
        btndiv = findViewById(R.id.btndiv);
        btnpercent = findViewById(R.id.btnpercent);
        btnequal = findViewById(R.id.btnequal);
        btnroot = findViewById(R.id.btnroot);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mostrar= Resultado.getText().toString();
                mostrar=mostrar+"1";
                Resultado.setText(mostrar);
            }
        };
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mostrar= Resultado.getText().toString();
                mostrar=mostrar+"2";
                Resultado.setText(mostrar);
            }
        };
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mostrar= Resultado.getText().toString();
                mostrar=mostrar+"3";
                Resultado.setText(mostrar);
            }
        };
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mostrar= Resultado.getText().toString();
                mostrar=mostrar+"4";
                Resultado.setText(mostrar);
            }
        };
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mostrar= Resultado.getText().toString();
                mostrar=mostrar+"5";
                Resultado.setText(mostrar);
            }
        };
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mostrar= Resultado.getText().toString();
                mostrar=mostrar+"6";
                Resultado.setText(mostrar);
            }
        };
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mostrar= Resultado.getText().toString();
                mostrar=mostrar+"7";
                Resultado.setText(mostrar);
            }
        };
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mostrar= Resultado.getText().toString();
                mostrar=mostrar+"8";
                Resultado.setText(mostrar);
            }
        };
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mostrar= Resultado.getText().toString();
                mostrar=+"9";
                Resultado.setText(mostrar);
            }
        };
        btnsum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Resserva= Resultado.getText().toString();
                operador="+";
                Resultado.setText("");
            }
        };
        btnminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Resserva= Resultado.getText().toString();
                operador="-";
                Resultado.setText("");
            }
        };
        btnmult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Resserva= Resultado.getText().toString();
                operador="*";
                Resultado.setText("");
            }
        };
        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Resserva= Resultado.getText().toString();
                operador="/";
                Resultado.setText("");
            }
        };
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mostrar= Resultado.getText().toString();
                mostrar=mostrar+".";
                Resultado.setText(mostrar);
            }
        };
        btnequal.setOnClickListener(new view.OnClickListener(){
            public void onClick(View  view){
                mostrar=Resultado.getText().toString();
                mostrar=mostrar+"1";
                if(oerador.equals("-")){
                    resultado = Double.parseDouble(reserva) - Double.parseDouble(Resultado.getText().toString());
                    Resultado.setText(String.valueOf(resultado));
                }
                if(oerador.equals("+")){
                    resultado = Double.parseDouble(reserva) - Double.parseDouble(Resultado.getText().toString());
                    Resultado.setText(String.valueOf(resultado));
                }
                if(oerador.equals("*")){
                    resultado = Double.parseDouble(reserva) - Double.parseDouble(Resultado.getText().toString());
                    Resultado.setText(String.valueOf(resultado));
                }
                if(oerador.equals("/")){
                    resultado = Double.parseDouble(reserva) - Double.parseDouble(Resultado.getText().toString());
                    Resultado.setText(String.valueOf(resultado));
                }
            }
        };

    }
}

