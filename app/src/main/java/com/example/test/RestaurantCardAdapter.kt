package com.example.test

import RestaurantHomeCard
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class RestaurantCardAdapter(
    private val list: List<RestaurantHomeCard>,
    private val onClick: (RestaurantHomeCard) -> Unit
) : RecyclerView.Adapter<RestaurantCardAdapter.ViewHolder>() {

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val img: ImageView = view.findViewById(R.id.imgRestaurant)
        val name: TextView = view.findViewById(R.id.tvName)
        val category: TextView = view.findViewById(R.id.tvCategory)
        val rating: TextView = view.findViewById(R.id.tvRating)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.card_restauranthome, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = list[position]
        holder.name.text = item.name
        holder.category.text = item.category
        holder.rating.text = item.rating
        holder.img.setImageResource(item.imageRes)
        holder.itemView.setOnClickListener { onClick(item) }
    }

    override fun getItemCount() = list.size
}