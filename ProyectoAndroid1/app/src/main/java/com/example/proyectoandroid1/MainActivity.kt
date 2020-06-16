package com.example.proyectoandroid1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputLayout
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val boton = findViewById(R.id.buttonSuma) as Button //boton Suma
        val txtNum1 = findViewById(R.id.inputNum1) as TextInputLayout
        val txtNum2 = findViewById(R.id.inputNum2) as TextInputLayout


        boton.setOnClickListener{
            view -> buttonSuma()    //todo evento del boton buttonSuma
        }

    }
    //Evento del Button:
    fun buttonSuma(){
        // código del evento asociado del Boton
        val txtNum1 = findViewById(R.id.inputNum1) as TextInputLayout
        val txtNum2 = findViewById(R.id.inputNum2) as TextInputLayout
        //val num1 = txtNum1.text.toString()


    }



    fun verEnPantalla(s: String){
        val txt = findViewById(R.id.textViewNum1) as TextView
        txt.setText(s)
    }

}
