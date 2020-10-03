package com.example.semana6_controles;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button btnProcesar;
    private EditText txtValor;
    private TextView rta;
    private RadioButton rb1, rb2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnProcesar=(Button )findViewById(R.id.btnProcesar);
        txtValor=(EditText)findViewById(R.id.et_valor);
        rta=(TextView )findViewById(R.id.tv_rta);

        rb1=(RadioButton) findViewById(R.id.radioButton_soles_dolares);
        rb2=(RadioButton) findViewById(R.id.radioButton_dolares_sol);

        btnProcesar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                if(rb1.isChecked()==true){
                    double valor=Double.parseDouble(txtValor.getText().toString());
                    double new_valor=valor/3.6;
                    rta.setText(String.valueOf("$ "+new_valor));

                }else if(rb2.isChecked()==true){
                    double valor=Double.parseDouble(txtValor.getText().toString());
                    double new_valor=valor*3.6;
                    rta.setText(String.valueOf("S/ "+new_valor));
                }else{
                    Toast.makeText(MainActivity.this, "Seleccione una opción!", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}