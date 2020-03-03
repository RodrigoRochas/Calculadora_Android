package br.senai.sp.jandira

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast


class ResultadoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)


        var peso = intent.getStringExtra("peso")

        Toast.makeText(this, "Eu sou legal e peso " + peso + " quilos", Toast.LENGTH_LONG).show()



    }
}
