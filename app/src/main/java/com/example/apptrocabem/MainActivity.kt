package com.example.trocabem

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.trocabem.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        ViewCompat.setOnApplyWindowInsetsListener(binding.root) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        setupClickListeners()
    }

    private fun setupClickListeners() {
        binding.btnSignInApple.setOnClickListener {
            // Implementar login com Apple
            navigateToItemsList()
        }

        binding.btnSignInFacebook.setOnClickListener {
            // Implementar login com Facebook
            navigateToItemsList()
        }

        binding.btnSignInPhone.setOnClickListener {
            // Implementar login com telefone
            navigateToItemsList()
        }

        binding.tvTroubleSignIn.setOnClickListener {
            // Implementar recuperação de conta
        }
    }

    private fun navigateToItemsList() {
        val intent = Intent(this, ItemsListActivity::class.java)
        startActivity(intent)
        finish()
    }
}