package com.example.ordermenu

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AsiaAdapt(private val foodLi: ArrayList<Asia>) :
    RecyclerView.Adapter<AsiaAdapt.AsiaViewHolder>() {

    var onItemClick:((Asia)-> Unit)?= null

        class AsiaViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
            val foodImage: ImageView = itemView.findViewById(R.id.pizza)
            val foodName: TextView = itemView.findViewById(R.id.pizzatext)
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AsiaViewHolder {
            val view = LayoutInflater.from(parent.context).inflate(R.layout.asia_items, parent, false)
            return  AsiaViewHolder(view)
        }

        override fun onBindViewHolder(holder: AsiaViewHolder, position: Int) {
            val popfood = foodLi[position]
            holder.foodImage.setImageResource(popfood.foodImage)
            holder.foodName.text = popfood.foodName

            holder.itemView.setOnClickListener {
                onItemClick?.invoke(popfood)
            }



        }

        override fun getItemCount(): Int {
            return foodLi.size
        }




}