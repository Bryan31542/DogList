package com.netphi.doglist

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.netphi.doglist.databinding.DogItemBinding
import com.squareup.picasso.Picasso

class DogViewHolder(view: View): RecyclerView.ViewHolder(view) {

    private val binding = DogItemBinding.bind(view)

    fun bind(image: String) {
        Picasso.get().load(image).into(binding.imageViewDogs)
    }

}