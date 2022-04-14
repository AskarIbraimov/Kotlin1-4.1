package com.example.kotlin1_41.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlin1_41.databinding.ChangesItemBinding

class MyAdapter(private var list: List<String>) : RecyclerView.Adapter<MyAdapter.MyViewHolder>() {

    private lateinit var binding: ChangesItemBinding

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        binding = ChangesItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MyViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.onBind(list[position])
    }

    override fun getItemCount(): Int = list.size

    inner class MyViewHolder(itemView: ChangesItemBinding) :
        RecyclerView.ViewHolder(itemView.root) {

        fun onBind(position: String) {
            binding.tvCount.text = position
        }
    }
}