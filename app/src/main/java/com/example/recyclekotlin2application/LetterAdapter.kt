package com.example.recyclekotlin2application

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclekotlin2application.databinding.ItemLetterBinding

class LetterAdapter(private var letterList: ArrayList<String>) : RecyclerView.Adapter<LetterAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemLetterBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.onBind(letterList[position])
    }

    override fun getItemCount(): Int {
        return letterList.size
    }

    class ViewHolder(private val binding: ItemLetterBinding) : RecyclerView.ViewHolder(binding.root) {
        fun onBind(letter: String) {
            binding.tvText.text = letter
        }
    }
}
