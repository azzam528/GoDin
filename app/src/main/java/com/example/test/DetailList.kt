package com.example.test

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class DetailList : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detail_list)

        // Menghubungkan TextView dari XML
        val txtNamaMenu = findViewById<TextView>(R.id.txtNamaMenu)
        val txtHarga = findViewById<TextView>(R.id.txtHarga)
        val txtDeskripsi = findViewById<TextView>(R.id.txtDeskripsi)

        // Mengambil data dari Intent
        val nama = intent.getStringExtra("nama")
        val harga = intent.getStringExtra("harga")
        val deskripsi = intent.getStringExtra("deskripsi")

        // Menampilkan data ke halaman detail
        txtNamaMenu.text = nama
        txtHarga.text = harga
        txtDeskripsi.text = deskripsi
    }
}