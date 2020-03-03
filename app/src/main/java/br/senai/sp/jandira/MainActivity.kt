package br.senai.sp.jandira

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonCalcular = findViewById<Button>(R.id.button_calcular)
        val editTextPeso = findViewById<EditText>(R.id.edit_text_peso)
        val editTextAltuta = findViewById<EditText>(R.id.edit_text_altura)


        buttonCalcular.setOnClickListener {
            val abrirActivityResultado = Intent(this, ResultadoActivity::class.java)

            abrirActivityResultado.putExtra("peso", editTextPeso.text.toString())
            abrirActivityResultado.putExtra("altura", editTextAltuta.text.toString())

            startActivity(abrirActivityResultado)

        }
    }
}
