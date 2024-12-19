package com.theberdakh.view_practice

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.theberdakh.animation.AnimationItem

class AnimationItemListAdapter(
    private val items: List<AnimationItem>,
    private val targetView: TextView
) : RecyclerView.Adapter<AnimationItemListAdapter.AnimationItemViewHolder>() {

    class AnimationItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textView = itemView.findViewById<TextView>(R.id.text_view)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnimationItemViewHolder {
        return AnimationItemViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_animation, parent, false)
        )
    }

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: AnimationItemViewHolder, position: Int) {
        val item = items[position]
        holder.textView.text = item.name

        holder.itemView.setOnClickListener {
            targetView.text = item.name
            item.animation(targetView).start()
        }
    }
}