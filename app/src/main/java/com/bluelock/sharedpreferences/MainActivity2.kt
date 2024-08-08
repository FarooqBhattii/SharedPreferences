package com.bluelock.sharedpreferences

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.bluelock.sharedpreferences.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {

    private lateinit var binding: ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val editor = getSharedPreferences("credentials", MODE_PRIVATE)

        binding.textView.setText("Your Email ID is: ${editor.getString("email", null)}")
        binding.textView2.setText("Your Password is: ${editor.getString("password", null)}")

        }
    }
