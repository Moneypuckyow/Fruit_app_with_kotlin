package com.example.fruitapp

import android.app.ActionBar
import android.app.Activity
import android.app.Application
import android.app.Instrumentation
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class DetailFruitActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_fruit)

        var tvName: TextView = findViewById(R.id.tvFruitName)
        var tvDetail: TextView = findViewById(R.id.tvDetail)
        var imgPhoto: ImageView = findViewById(R.id.imgFruit)

        val actionBar : androidx.appcompat.app.ActionBar? = supportActionBar
        actionBar!!.setDisplayShowHomeEnabled(true)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)


        var intent= intent
        val aTitle = intent.getStringExtra("Title")
        val aDetail= intent.getStringExtra("Detail")
        val aImage= intent.getIntExtra("Image", 0)

        actionBar.setTitle(aTitle)
        tvName.text = aTitle
        tvDetail.text = aDetail
        imgPhoto.setImageResource(aImage)


    }
}