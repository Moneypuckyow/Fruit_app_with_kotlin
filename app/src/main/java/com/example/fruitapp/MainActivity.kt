package com.example.fruitapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity(){
    private lateinit var rvFruit: RecyclerView
    private var title: String = "Menu Utama"


    private var list: ArrayList<Fruit> = arrayListOf()

        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setActionBarTitle(title)


        rvFruit = findViewById(R.id.rv_fruit)
        rvFruit.setHasFixedSize(true)

        list.addAll(FruitData.listData)
        showRecyclerList()
    }


    private fun showSelectedFruit(fruit: Fruit) {
        Toast.makeText(this, "Kamu memilih " + fruit.name, Toast.LENGTH_SHORT).show()

        var fruitTitle : String = fruit.name
        var fruitDetail : String = fruit.detail
        var imageView : Int = fruit.photo



        val intent = Intent (this, DetailFruitActivity::class.java)

        intent.putExtra("Title", fruitTitle)
        intent.putExtra("Detail", fruitDetail)
        intent.putExtra("Image", imageView)

        startActivity(intent)
    }

    private fun showRecyclerList() {
        rvFruit.layoutManager = LinearLayoutManager(this)
        val listFruitAdapter = ListFruitAdapter(list)
        rvFruit.adapter = listFruitAdapter

        listFruitAdapter.setOnItemClickCallback(object : ListFruitAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Fruit) {
                showSelectedFruit(data)
            }
        })
    }

    private fun setActionBarTitle(title: String) {
        supportActionBar?.title=title
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }


    private fun setMode(selectedMode: Int){
        when (selectedMode) {
            R.id.action_about -> {
                val intent = Intent(this, AboutActivity::class.java)
                startActivity(intent)
            }
        }
    }
}