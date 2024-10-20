package com.leon.fabrizio.laboratoriocalificado02

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText

class Ejercicio02Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejercicio02)

        val inputNombre = findViewById<EditText>(R.id.inputNombre)
        val inputNumero = findViewById<EditText>(R.id.inputNumero)
        val inputProductos = findViewById<EditText>(R.id.inputProductos)
        val inputCiudad = findViewById<EditText>(R.id.inputCiudad)
        val inputDireccion = findViewById<EditText>(R.id.inputDireccion)
        val btnRegistrar = findViewById<Button>(R.id.btnRegistrar)

        btnRegistrar.setOnClickListener {

            if (inputNombre.text.isNotEmpty() && inputNumero.text.isNotEmpty() &&
                inputProductos.text.isNotEmpty() && inputCiudad.text.isNotEmpty() &&
                inputDireccion.text.isNotEmpty()) {


                val intent = Intent(this, PedidoActivity::class.java)
                intent.putExtra("nombre", inputNombre.text.toString())
                intent.putExtra("numero", inputNumero.text.toString())
                intent.putExtra("productos", inputProductos.text.toString())
                intent.putExtra("direccion", inputDireccion.text.toString())
                intent.putExtra("ciudad", inputCiudad.text.toString())
                startActivity(intent)
            } else {
                // Mostrar un mensaje de error (puedes usar un Toast)
                // Toast.makeText(this, "Debes completar todos los campos", Toast.LENGTH_SHORT).show()
            }
        }
    }
}