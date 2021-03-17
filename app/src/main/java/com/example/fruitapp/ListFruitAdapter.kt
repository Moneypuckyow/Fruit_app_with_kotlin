package com.example.fruitapp

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListFruitAdapter(private val listFruit: ArrayList<Fruit>) : RecyclerView.Adapter<ListFruitAdapter.ListViewHolder>() {
    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback

    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_item_detail)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)


        }



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListFruitAdapter.ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_row_fruit, parent, false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listFruit.size
    }

    override fun onBindViewHolder(holder: ListFruitAdapter.ListViewHolder, position: Int) {
        val fruit = listFruit[position]



        Glide.with(holder.itemView.context)
            .load(fruit.photo)
            .apply(RequestOptions().override(55, 55))
            .into(holder.imgPhoto)

        holder.tvName.text = fruit.name
        holder.tvDetail.text = fruit.detail

        holder.itemView.setOnClickListener { onItemClickCallback.onItemClicked(listFruit[holder.adapterPosition])}



    }

    interface OnItemClickCallback {
        fun onItemClicked(data: Fruit)

    }



}