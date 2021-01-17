package io.hefestos.UIs.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import io.hefestos.Adapters.FreelaAdapter
import io.hefestos.Models.Freela
import io.hefestos.R

class FreelasFragment : Fragment() {
    private lateinit var recyclerView: RecyclerView

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_freelas, container, false)
        recyclerView = view.findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        recyclerView.adapter = FreelaAdapter(generateFreelas())
        return view
    }

    private fun generateFreelas(): ArrayList<Freela>{
        val freelas = arrayListOf<Freela>()
        for(i in 0..99){
            freelas.add(Freela(
                i,
                "Freela $i",
                "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, $i",
                i*10F,
                "Name $i",
                "City $i"
            ))
        }
        return freelas
    }

    companion object {
        @JvmStatic
        fun newInstance() = FreelasFragment()
    }
}