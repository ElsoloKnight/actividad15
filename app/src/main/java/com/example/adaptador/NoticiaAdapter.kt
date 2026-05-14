package com.example.adaptador

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.adaptador.databinding.ItemListaBinding

class NoticiaAdapter(val noticias: List<Noticia>) : RecyclerView.Adapter<NoticiaHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): NoticiaHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemListaBinding.inflate(inflater, parent, false)
        return NoticiaHolder(binding)
    }

    override fun onBindViewHolder(
        holder: NoticiaHolder,
        position: Int
    ) {

        val noticia = noticias[position]
        holder.binding.tvwTittle.text = noticia.titulo
        holder.binding.tvwDescription.text = noticia.descripcion
    }

    override fun getItemCount() = noticias.size

}