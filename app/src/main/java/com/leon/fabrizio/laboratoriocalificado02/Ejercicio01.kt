package com.leon.fabrizio.laboratoriocalificado02

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Ejercicio01 : AppCompatActivity() {

    private lateinit var greenView: View
    private lateinit var btnMostrar: Button
    private lateinit var btnOcultar: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_ejercicio01)


        greenView = findViewById(R.id.greenView)
        btnMostrar = findViewById(R.id.btnMostrar)
        btnOcultar = findViewById(R.id.btnOcultar)


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.constraintLayout)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        btnMostrar.setOnClickListener {
            greenView.visibility = View.VISIBLE
        }


        btnOcultar.setOnClickListener {
            greenView.visibility = View.GONE
        }
    }


    private fun enableEdgeToEdge() {
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION or
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
    }
}

