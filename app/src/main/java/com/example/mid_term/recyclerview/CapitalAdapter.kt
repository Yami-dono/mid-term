package com.example.mid_term.recyclerview

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class CapitalAdapter(
    private val listCap: List<Capital>
) : RecyclerView.Adapter<CapitalViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = CapitalViewHolder.from(parent)

    override fun onBindViewHolder(holder: CapitalViewHolder, position: Int) {
        holder.bind(listCap[position])
    }

    override fun getItemCount() = listCap.size
}
