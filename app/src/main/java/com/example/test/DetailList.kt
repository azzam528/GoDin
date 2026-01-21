package com.example.test

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.TextView
import android.content.Intent
import android.widget.ImageView
class DetailList : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_list)

        val namaMenu = intent.getStringExtra("nama_menu")

        val txtNamaMenu = findViewById<TextView>(R.id.txtNamaMenu)
        txtNamaMenu.text = namaMenu

        val btnMinus = findViewById<TextView>(R.id.btnMinus)
        val btnPlus = findViewById<TextView>(R.id.btnPlus)
        val txtJumlah = findViewById<TextView>(R.id.txtJumlah)

        var jumlah = txtJumlah.text.toString().toInt()

        btnPlus.setOnClickListener {
            jumlah++
            txtJumlah.text = jumlah.toString()
        }

        btnMinus.setOnClickListener {
            if (jumlah > 1) {   // biar ga minus
                jumlah--
                txtJumlah.text = jumlah.toString()
            }
        }

        val btnBack = findViewById<ImageView>(R.id.btnBack)

        btnBack.setOnClickListener {
            val intent = Intent(this, MenuList::class.java)
            startActivity(intent)
            finish() // supaya ga numpuk activity
        }
    }
}
