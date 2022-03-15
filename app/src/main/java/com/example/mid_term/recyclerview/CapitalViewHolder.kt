package com.example.mid_term.recyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.mid_term.databinding.ActivityItemBinding
import com.example.mid_term.item


class CapitalViewHolder private constructor(
    private val binding: ActivityItemBinding
) : RecyclerView.ViewHolder(binding.root) {

    companion object {
        fun from(parent: ViewGroup): CapitalViewHolder {
            val binding = ActivityItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
            return CapitalViewHolder(binding)
        }
    }

    fun bind(capital: Capital) {
        binding.textView.text = capital.name

    }
}