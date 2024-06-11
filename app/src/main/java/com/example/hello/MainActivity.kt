package com.example.hello

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.hello.databinding.ActivityMainBinding
import com.squareup.picasso.Picasso

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnNext.setOnClickListener {
            val intent = Intent(this,birdsoneone::class.java)
            startActivity(intent)
        }

//         binding.btnNext = setOnC{
//            val intent = Intent(this, birdsoneone::class.java)
//            startActivity(intent)
//        }
        Picasso
            .get()
            .load("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSqcVfx9VIa4pRsky3lZPoOfvRqVpIjglCeqA&usqp=CAU")
            .into(binding.imageView2)


    }
}
