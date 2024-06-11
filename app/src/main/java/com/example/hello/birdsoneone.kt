package com.example.hello

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.hello.databinding.ActivityBirdsoneoneBinding
import com.example.hello.databinding.ActivityMainBinding
import com.squareup.picasso.Picasso

class birdsoneone : AppCompatActivity() {
    lateinit var binding: ActivityBirdsoneoneBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding= ActivityBirdsoneoneBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.btnPrev1.setOnClickListener {
            finish()
        }
       binding.btnNext2.setOnClickListener {
            val intent = Intent(this,birdstwotwo::class.java)
            startActivity(intent)
       }
        Picasso
            .get()
            .load("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSqcVfx9VIa4pRsky3lZPoOfvRqVpIjglCeqA&usqp=CAU")
            .into(binding.imageView5)


    }
}





