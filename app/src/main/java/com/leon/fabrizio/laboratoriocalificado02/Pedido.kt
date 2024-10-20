package com.leon.fabrizio.laboratoriocalificado02

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class PedidoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pedido)


        val nombre = intent.getStringExtra("nombre")
        val numero = intent.getStringExtra("numero")
        val productos = intent.getStringExtra("productos")
        val direccion = intent.getStringExtra("direccion")
        val ciudad = intent.getStringExtra("ciudad") // Obtener ciudad


        findViewById<TextView>(R.id.nombre_cliente).text = nombre
        findViewById<TextView>(R.id.numero_cliente).text = numero
        findViewById<TextView>(R.id.producto).text = productos
        findViewById<TextView>(R.id.ubicacion).text = direccion


        findViewById<ImageButton>(R.id.btn_llamar).setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:$numero"))
            startActivity(intent)
        }


        findViewById<ImageButton>(R.id.btn_whatsapp).setOnClickListener {
            val mensaje = "Hola $nombre, tus productos: $productos están en camino a la dirección: $direccion, Ciudad: $ciudad" // Agregar ciudad al mensaje
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://wa.me/$numero/?text=${Uri.encode(mensaje)}")
            startActivity(intent)
        }


        findViewById<ImageButton>(R.id.btn_google_maps).setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("geo:0,0?q=$direccion")
            intent.setPackage("com.google.android.apps.maps")
            startActivity(intent)
        }
    }
}

