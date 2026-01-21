package com.example.app

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.app.databinding.ActivitySettingBinding

class SettingActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySettingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySettingBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // tombol back di toolbar
        binding.topBar.setNavigationOnClickListener {
            finish()
        }

        // dummy listener (ga ngubah apa-apa)
        binding.rgTheme.setOnCheckedChangeListener { _, _ -> }
        binding.switchNotif.setOnCheckedChangeListener { _, _ -> }
    }
}
