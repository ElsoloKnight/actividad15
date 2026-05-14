package com.example.adaptador

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.adaptador.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    private fun getNews(): List<Noticia> {
        val news = listOf<Noticia>(
            Noticia("Noticia 1", "Se inundó periferico"),
            Noticia("Noticia 2", "Perdio el america")
        )
        return news
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        enableEdgeToEdge()
        setContentView(binding.root)
        binding.rvwNews.layoutManager = LinearLayoutManager(this)
        binding.rvwNews.adapter = NoticiaAdapter(getNews())
    }

}<