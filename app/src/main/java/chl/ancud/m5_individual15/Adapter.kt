package chl.ancud.m5_individual15

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import chl.ancud.m5_individual15.databinding.ItemLayoutBinding
import com.example.kotlinexamples.Pokedex

class Adapter: RecyclerView.Adapter <Adapter.ViewHolder>() {

    val pokemones = mutableListOf<Pokemon>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        TODO("Not yet implemented")
        val binding: ItemLayoutBinding = ItemLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return pokemones.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = pokemones[position]
        holder.bind(item)
    }

    class ViewHolder(val binding: ItemLayoutBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bind(pokemon: Pokemon) {
            binding.itemTxvNombre.text = pokemon.nombre
            binding.itemTxvTipo.text = pokemon.tipo
        }
    }

    fun initData() {

    }
}