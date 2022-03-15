package com.example.mid_term

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mid_term.data.Info
import com.example.mid_term.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        openSecondScreen()

    }
    private fun openSecondScreen() {
        binding.login.setOnClickListener {
            val intent = Intent(this, sencond_screen::class.java)
            val name = binding.editName.text.toString()
            val email = binding.editEmail.text.toString()
            val phone = binding.editPhone.text.toString()
            intent.putExtra(sencond_screen.KEY_NAME_VALUE, name)
            intent.putExtra(sencond_screen.KEY_EMAIL_VALUE, email)
            intent.putExtra(sencond_screen.KEY_PHONE_VALUE, phone)
            startActivity(intent)
        }
    }
    private fun getdata(){

    }
}