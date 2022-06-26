package com.tobe.scholarlytest.presentation

import androidx.recyclerview.widget.RecyclerView
import androidx.viewbinding.ViewBinding
import com.tobe.scholarlytest.databinding.ImageDisplayBinding
import com.tobe.scholarlytest.databinding.TextDisplayBinding
import com.tobe.scholarlytest.domain.Result

sealed class ContentRecyclerViewHolder(binding: ViewBinding):RecyclerView.ViewHolder(binding.root){

    class TextContentViewHolder(private val binding: TextDisplayBinding):ContentRecyclerViewHolder(binding){
        fun bind(title : Result){
            binding.textTitle.actualTitle.text = title.text?.title?.text
            binding.textContent.text = title.text?.body?.text

        }
    }

    class ImageViewHolder(private val binding: ImageDisplayBinding):ContentRecyclerViewHolder(binding){
        fun bind(title : Result){
         binding.imageTitle.actualTitle.text = "Image"


        }
    }

}
