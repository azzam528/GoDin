package com.example.test

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ProfileActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_profile)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // 🔙 BACK (TIDAK DIUBAH)
        val btnBack = findViewById<ImageButton>(R.id.btnBack)
        btnBack.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_SINGLE_TOP
            startActivity(intent)
            finish()
        }

        // =====================
        // RIWAYAT PESANAN
        // =====================
        findViewById<Button>(R.id.btnOrderHistory).setOnClickListener {
            // val intent = Intent(this, OrderHistory::class.java)
            // startActivity(intent)
        }

        // =====================
        // SETTING
        // =====================
        findViewById<Button>(R.id.btnSetting).setOnClickListener {
            // val intent = Intent(this, SettingActivity::class.java)
            // startActivity(intent)
        }

        // =====================
        // LOGOUT
        // =====================
        findViewById<Button>(R.id.btnLogout).setOnClickListener {
            // val intent = Intent(this, LoginActivity::class.java)
            // intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
            // startActivity(intent)
            // finish()
        }

        // =====================
        // INFO (ℹ️)
        // =====================
        findViewById<ImageButton>(R.id.btnInfo).setOnClickListener {
            // val intent = Intent(this, AboutActivity::class.java)
            // startActivity(intent)
        }

        // =====================
        // CUSTOMER SERVICE (🎧)
        // =====================
        findViewById<ImageButton>(R.id.btnCustomerService).setOnClickListener {
            // val intent = Intent(this, CustomerServiceActivity::class.java)
            // startActivity(intent)
        }

        // =====================
        // FLOATING HELP (?)
        // =====================
        findViewById<ImageButton>(R.id.btnHelp).setOnClickListener {
            // val intent = Intent(this, HelpActivity::class.java)
            // startActivity(intent)
        }
    }
}
