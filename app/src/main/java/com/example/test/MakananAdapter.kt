package com.example.test

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MakananAdapter : RecyclerView.Adapter<MakananAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val imgMakanan: ImageView = itemView.findViewById(R.id.imgMakanan)
        val tvNama: TextView = itemView.findViewById(R.id.tvNama)
        val tvRating: TextView = itemView.findViewById(R.id.tvRating)
        val tvDiskon: TextView = itemView.findViewById(R.id.tvDiskon)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_makanan, parent, false)

        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return 5
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.tvNama.text = "Burger Bageur"
        holder.tvRating.text = "⭐ 4.9 • 15-25 min"
        holder.tvDiskon.text = "Diskon 90%"
    }
}