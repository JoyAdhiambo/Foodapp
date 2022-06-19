package com.example.ordermenu

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class popularFoodAdapter (private val foodList: List<popularFood>):
    RecyclerView.Adapter<popularFoodAdapter.popularFoodViewHolder >() {

    var onItemClick:((popularFood)-> Unit)?= null

    class popularFoodViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val foodImage: ImageView = itemView.findViewById(R.id.chicken)
        val foodName: TextView = itemView.findViewById(R.id.txtchicken)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): popularFoodViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.each_item, parent, false)
        return popularFoodViewHolder(view)
    }

    override fun onBindViewHolder(holder: popularFoodViewHolder, position: Int) {
        val popfood = foodList[position]
        holder.foodImage.setImageResource(popfood.foodImage)
        holder.foodName.text = popfood.foodName


        holder.itemView.setOnClickListener {
            onItemClick?.invoke(popfood)
        }
    }

    override fun getItemCount(): Int {
        return foodList.size
    }



}