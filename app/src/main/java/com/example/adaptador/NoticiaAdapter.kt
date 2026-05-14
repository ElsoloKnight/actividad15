package com.example.adaptador

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class NoticiaAdapter(val noticias: List<Noticia>) : RecyclerView.Adapter<NoticiaHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): NoticiaHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(
        holder: NoticiaHolder,
        position: Int
    ) {
        TODO("Not yet implemented")
    }

    override fun getItemCount() = noticias.size

}