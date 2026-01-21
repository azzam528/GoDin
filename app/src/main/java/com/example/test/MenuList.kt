package com.example.test

import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView

class MenuList : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_list)

        // ================= BACK KE HOME =================
        /*val btnBack = findViewById<LinearLayout>(R.id.btnBack)
        btnBack.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
            finish()
        }

        // ================= LOKASI RESTORAN (MAPS) =================
        val txtLokasi = findViewById<TextView>(R.id.txtLokasi)
        txtLokasi.setOnClickListener {
            val intent = Intent(this, MapsActivity::class.java)
            startActivity(intent)
        }*/

        // ================= CARD VIEW KE DETAIL =================
        val cardMieGacoan = findViewById<CardView>(R.id.cardMieGacoan)
        val cardMieHompimpa = findViewById<CardView>(R.id.cardMieHompimpa)


        cardMieGacoan.setOnClickListener {
            bukaDetail("Mie Gacoan")
        }

        cardMieHompimpa.setOnClickListener {
            bukaDetail("Mie Hompimpa")
        }


    }

    private fun bukaDetail(namaMenu: String) {
        val intent = Intent(this, DetailList::class.java)
        intent.putExtra("nama_menu", namaMenu)
        startActivity(intent)
    }
}
