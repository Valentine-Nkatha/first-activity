package com.example.hello

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.hello.databinding.ActivityBirdsthreethreeBinding
import com.example.hello.databinding.ActivityBirdstwotwoBinding
import com.squareup.picasso.Picasso

class birdsthreethree : AppCompatActivity() {
    lateinit var binding: ActivityBirdsthreethreeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding=ActivityBirdsthreethreeBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)

        setContentView(binding.root)
        binding.btnPrev3.setOnClickListener {
            finish()
        }
        binding.btnNext4.setOnClickListener {
            val intent = Intent(this,birdsfourfour::class.java)
            startActivity(intent)
        }
        Picasso
            .get()
            .load("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSqcVfx9VIa4pRsky3lZPoOfvRqVpIjglCeqA&usqp=CAU")
            .into(binding.imageView7)

        }
    }
