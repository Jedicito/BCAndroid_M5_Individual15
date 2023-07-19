package chl.ancud.m5_individual15
/* Pasos para crear un recycler view
* [x ] item layout
*   [x] agregar constraints
*   [x] cambiar altura de constraints layout de item layout a wrap content
*   [X] definir ID
* [x ] layout con recycler view
* [X ] asignar layout manager
[ ] implementar clase Adapter
[ ]  heredar RecyclerView.Adapter
[ ] creaciones de los métodos: onCreateViewHolder, getItemCount y onBindViewHolder
[ ] crear clase anidada ViewHolder, que hereda de la clase ViewHolder
[ ] Agregar constructor
[ ] crear objeto, data class
[ ] Crear lista
[ ] asignar tamaño de la lista en getItemCount
[ ] definir Binding Class del Item
[ ] cambiar view por el binding
[ ] declarar variable item en onBindViewHolder
[ ] implementar binding en clase viewHolder
 */
/* [ x] Adapter+ view holder
* [ x] obtener los datos
* /*

* */
* */

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import chl.ancud.m5_individual15.databinding.ActivityMainBinding
import com.example.kotlinexamples.Pokedex

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initAdapter()
    }
    private fun initAdapter(){
        val adapter = Adapter()
        val pokedex = Pokedex.getPokedex()
        adapter.setData(pokedex)
        binding.mainRV.adapter = adapter
    }
}