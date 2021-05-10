package com.example.latihanku

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_layout.view.*

class MakananAdapter(val arrayList: ArrayList<MakananModel>,
                     val context: Context) :
        RecyclerView.Adapter<MakananAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bindItems(model: MakananModel) {
            itemView.namamakanan.text = model.nmmakanan
            itemView.descmakanan.text = model.dmakanan
            itemView.hargamakanan.text = model.hrgmakanan.toString()
            itemView.imgmakanan.setImageResource(model.fotomakanan)

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItems(arrayList[position])

        holder.itemView.setOnClickListener(){
            val model = arrayList.get(position)

            var gsepatu : String = model.nmmakanan
            var gDesc : String = model.dmakanan
            var gHarga : Int = model.hrgmakanan.toString().toInt()
            var gImg : Int = model.fotomakanan

            val intent = Intent(context , Order::class.java)
            intent.putExtra("pSepatu" , gsepatu)
            intent.putExtra("pDesc" , gDesc)
            intent.putExtra("pHarga" , gHarga)
            intent.putExtra("pImg" , gImg)

            context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return arrayList.size
    }
}
