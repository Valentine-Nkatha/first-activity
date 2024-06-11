package com.example.hello

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.hello.databinding.ActivityBirdsfourfourBinding
import com.example.hello.databinding.ActivityBirdsthreethreeBinding
import com.squareup.picasso.Picasso

class birdsfourfour : AppCompatActivity() {
    lateinit var binding: ActivityBirdsfourfourBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding=ActivityBirdsfourfourBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)

        setContentView(binding.root)
        binding.btnPrev4.setOnClickListener {
            val intent = Intent(this, birdsthreethree::class.java)
            startActivity(intent)
        }
        Picasso
            .get()
            .load("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSqcVfx9VIa4pRsky3lZPoOfvRqVpIjglCeqA&usqp=CAU")
            .into(binding.imageView10)


    }
}





