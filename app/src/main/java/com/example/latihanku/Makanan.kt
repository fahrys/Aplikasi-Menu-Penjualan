package com.example.latihanku

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_makanan.*

class Makanan : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_makanan)

        supportActionBar!!.setTitle("Menu Utama")
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)

        val arrayitem = ArrayList<MakananModel>()
        arrayitem.add(MakananModel("Pempek" , "Makanan Berasal Dari Palembang " , R.drawable.pempek , 15000))
        arrayitem.add(MakananModel("Mie Aceh" , "Makanan Berasal Dari Aceh" , R.drawable.mie , 10000))
        arrayitem.add(MakananModel("Karee Kameng" , "Makanan Berasal Dari Aceh" , R.drawable.karee , 20000))
        arrayitem.add(MakananModel("Bika Ambon" , "Makanan Berasal Dari Sumatra Utara" , R.drawable.am , 25000))
        arrayitem.add(MakananModel("Ayam Pinadar" , "Makanan Berasal Dari Sumatra Utara" , R.drawable.ay , 15000))
        arrayitem.add(MakananModel("Rendang" , "Makanan Berasal Dari Sumatra Barat" , R.drawable.r , 10000))
        arrayitem.add(MakananModel("Kacimuih" , "Makanan Berasal Dari Sumatra Barat" , R.drawable.kaci , 13000))
        arrayitem.add(MakananModel("Gulai Ikan Patin" , "Makanan Berasal Dari Jambi" , R.drawable.ikan , 18000))
        arrayitem.add(MakananModel("Pendap" , "Makanan Berasal Dari Bengkulu" , R.drawable.pendap , 30000))
        arrayitem.add(MakananModel("Gulai Belacan" , "Makanan Berasal Dari Riau" , R.drawable.gulai , 50000))
        arrayitem.add(MakananModel("Otak-Otak" , "Makanan Berasal Dari Kepulauan Riau" , R.drawable.otak , 10000))

        var myAdapter = MakananAdapter(arrayitem, this)

        Rv_menu.layoutManager = LinearLayoutManager(this)
        Rv_menu.adapter = myAdapter
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}