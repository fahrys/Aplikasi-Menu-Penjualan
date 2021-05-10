package com.example.latihanku

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_bayar.*
import kotlinx.android.synthetic.main.activity_order.*

class Bayar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bayar)

        supportActionBar!!.setTitle("Bayar")
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)

        val intent = intent

        val NMakanan =intent.getStringExtra("NamaMakanan")
        val NJml = intent.getStringExtra("JmlBrg")
        val NJHarga = intent.getStringExtra("TotalHarga")

        val total =findViewById<TextView>(R.id.total)

        total.text = "Name:\n"+NMakanan +
                "\nJumlah Barang:\n" + NJml +
                "\nTotal Harga:\n"+NJHarga


        btnconfirm.setOnClickListener {
            var hasilmakanan = total.text.toString()

            val intent = Intent(this , Hasil::class.java)
            intent.putExtra("HasilMakanan", hasilmakanan)
            startActivity(intent)

        }

    }
}