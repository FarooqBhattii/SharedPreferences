package com.bluelock.sharedpreferences

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import com.bluelock.sharedpreferences.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val editor = getSharedPreferences("credentials", MODE_PRIVATE)
        binding.mail.setText(editor.getString("email", null))
        binding.pass.setText(editor.getString("password", null))

        binding.logIn.setOnClickListener {
            val editor = getSharedPreferences("credentials", MODE_PRIVATE).edit()
            editor.putString("email", binding.mail.text.toString())
            editor.putString("password", binding.pass.text.toString())
            editor.apply()

            startActivity(Intent(this, MainActivity2::class.java) )
        }
    }
}
