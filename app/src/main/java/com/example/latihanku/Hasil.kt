package com.example.latihanku

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_hasil.*

class Hasil : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hasil)

        val intent = intent

        val NHasil = intent.getStringExtra("HasilMakanan")

        val hasil = findViewById<TextView>(R.id.hasil)
        hasil.text = NHasil

        OrderLagi.setOnClickListener {
            val intent = Intent(this , Makanan::class.java)
            startActivity(intent)
        }
    }
}