package com.tobe.scholarlytest.presentation

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.tobe.scholarlytest.domain.Result

class ContentAdapter : RecyclerView.Adapter<ContentRecyclerViewHolder>() {

    var items = listOf<Result>()
    set(value) {
        field = value
        notifyDataSetChanged()
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContentRecyclerViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: ContentRecyclerViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
       return items.size
    }

    override fun getItemViewType(position: Int): Int {
        TODO("Not yet implemented")
    }
}