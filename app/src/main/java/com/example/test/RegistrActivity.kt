package com.example.test

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.google.android.material.textfield.TextInputEditText
import kotlinx.coroutines.launch

class RegistrActivity : AppCompatActivity() {
    private lateinit var db: AppDatabase

    // Kalau edit, kirim user lewat intent (opsional)
    private var existingUser: User? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registr)

        db = AppDatabase.getInstance(this)

        val etNama = findViewById<TextInputEditText>(R.id.etNama)
        val etEmail = findViewById<TextInputEditText>(R.id.etEmail)
        val etPassword = findViewById<TextInputEditText>(R.id.etPassword)
        val etConfirmPassword = findViewById<TextInputEditText>(R.id.etConfirmPassword)
        val btnSignUp = findViewById<Button>(R.id.btn_login)

        // Kalau mode EDIT — isi field dengan data lama
        val userId = intent.getIntExtra("USER_ID", -1)
        if (userId != -1) {
            lifecycleScope.launch {
                val user = db.userDao().getUserById(userId)
                user?.let {
                    existingUser = it
                    runOnUiThread {
                        etNama.setText(it.nama)
                        etEmail.setText(it.email)
                        etPassword.setText(it.password)
                        btnSignUp.text = "UPDATE"
                    }
                }
            }
        }

        btnSignUp.setOnClickListener {
            val nama = etNama.text.toString().trim()
            val email = etEmail.text.toString().trim()
            val password = etPassword.text.toString().trim()
            val confirmPassword = etConfirmPassword.text.toString().trim()

            // Validasi
            if (nama.isEmpty() || email.isEmpty() || password.isEmpty()) {
                Toast.makeText(this, "Semua field harus diisi", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            if (password != confirmPassword) {
                Toast.makeText(this, "Password tidak cocok", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            lifecycleScope.launch {
                if (existingUser != null) {
                    // Mode EDIT
                    db.userDao().update(existingUser!!.copy(
                        nama = nama,
                        email = email,
                        password = password
                    ))
                    runOnUiThread {
                        Toast.makeText(this@RegistrActivity, "Data berhasil diupdate!", Toast.LENGTH_SHORT).show()
                        finish()
                    }
                } else {
                    // Mode INSERT
                    db.userDao().insert(User(nama = nama, email = email, password = password))
                    runOnUiThread {
                        Toast.makeText(this@RegistrActivity, "Registrasi berhasil!", Toast.LENGTH_SHORT).show()
                        startActivity(Intent(this@RegistrActivity, LoginActivity::class.java))
                        finish()
                    }
                }
            }
        }
    }
}