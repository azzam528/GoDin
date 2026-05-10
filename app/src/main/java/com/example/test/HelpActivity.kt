package com.example.test

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton

class HelpActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_help)

        val btnEmail = findViewById<MaterialButton>(R.id.btnEmail)
        btnEmail.setOnClickListener {
            val intent = Intent(Intent.ACTION_SENDTO).apply {
                data = Uri.parse("mailto:cs@godin.com")
                putExtra(Intent.EXTRA_SUBJECT, "Bantuan Aplikasi Go Din")
                putExtra(Intent.EXTRA_TEXT, "Halo CS Go Din,\n\nSaya butuh bantuan terkait...")
            }
            startActivity(Intent.createChooser(intent, "Kirim email lewat"))
        }

        val btnChat = findViewById<MaterialButton>(R.id.btnChat)
        btnChat.setOnClickListener {
            val csNumber = "999999"
            val intent = Intent(Intent.ACTION_DIAL).apply {
                data = Uri.parse("tel:$csNumber")
            }
            startActivity(intent)
        }
    }
}
