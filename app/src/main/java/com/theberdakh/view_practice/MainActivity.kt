package com.theberdakh.view_practice

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.theberdakh.animation.AnimationRepository

class MainActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val targetView = findViewById<TextView>(R.id.target_view)
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        val allAnimations = AnimationRepository.getAllAnimationItems()
        val adapter = AnimationItemListAdapter(allAnimations, targetView)
        recyclerView.adapter = adapter

    }
}