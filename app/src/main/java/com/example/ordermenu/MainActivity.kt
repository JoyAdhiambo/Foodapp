package com.example.ordermenu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
     private lateinit var  recycleView: RecyclerView
     private lateinit var foodList: ArrayList<popularFood>
    private lateinit var foodAdapter: popularFoodAdapter

    private lateinit var AsiaRecycler : RecyclerView
    private lateinit var foodLi: ArrayList<Asia>
    private lateinit var foodAdapt:AsiaAdapt




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initi()
        asiaFirst()

    }
    private fun initi() {
        recycleView = findViewById(R.id.recyclerRv)
        recycleView.setHasFixedSize(true)


        recycleView.layoutManager = LinearLayoutManager(this, RecyclerView.HORIZONTAL, false)


        foodList = ArrayList()


        addDataToList()

        foodAdapter = popularFoodAdapter(foodList)
        recycleView.adapter = foodAdapter

        foodAdapter.onItemClick = {
            val intent = Intent(this,foodDetailAcctivity::class.java)
            intent.putExtra("food",it)
            startActivity(intent)
        }

    }
     private  fun asiaFirst(){

        AsiaRecycler = findViewById(R.id.AsiaRecycler)
        AsiaRecycler.setHasFixedSize(true)

        AsiaRecycler.layoutManager = LinearLayoutManager(this,RecyclerView.HORIZONTAL,false)

        foodLi = ArrayList()

        foodAdapt = AsiaAdapt(foodLi)
        AsiaRecycler.adapter = foodAdapt

       asiaDataList()

         foodAdapt.onItemClick = {
             val intent = Intent(this,AsianFoodActivity ::class.java)
             intent.putExtra("food",it)
             startActivity(intent)

         }

    }

 private fun addDataToList(){
        foodList.add(popularFood(R.drawable.popularfood1,"Dumplings"))
        foodList.add(popularFood(R.drawable.popularfood2,"Burger"))
        foodList.add(popularFood(R.drawable.popularfood3,"Wings"))


    }
   private fun asiaDataList(){
        foodLi.add(Asia(R.drawable.asiafood1,"Pizza"))
        foodLi.add(Asia(R.drawable.asiafood2,"Crab"))
    }
}