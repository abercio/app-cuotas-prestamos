package com.example.calculadoradecuotadeprestamos


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_registro_datos.*


class Registro_datos : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro_datos)

        var n1 = findViewById<View>(R.id.editText6) as EditText
        var n2 = findViewById<View>(R.id.editText7) as EditText
        var n3 = findViewById<View>(R.id.editText8) as EditText

        var bntRest = findViewById<View>(R.id.btnSiguiente)

        /*bntRest.setOnClickListener {
            var monto = (n1.text.toString().toInt()*(1 + n3.text.toString().toInt()* n2.text.toString().toInt()))

        }*/

        btnSiguiente.setOnClickListener {
            val actSig = Intent(this,Resultado_Calculo::class.java)
            startActivity(actSig)
        }
    }



}
