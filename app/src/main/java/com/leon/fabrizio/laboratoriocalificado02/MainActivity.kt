package com.leon.fabrizio.laboratoriocalificado02

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnEjercicio01 = findViewById<Button>(R.id.btnEjercicio01)
        val btnEjercicio02 = findViewById<Button>(R.id.btnEjercicio02)

        btnEjercicio01.setOnClickListener {
            // Redirigir a Ejercicio01
            val intent = Intent(this, Ejercicio01::class.java)
            startActivity(intent)
        }

        btnEjercicio02.setOnClickListener {
            // Redirigir a Ejercicio02
            val intent = Intent(this, Ejercicio02Activity::class.java)
            startActivity(intent)
        }
    }
}
