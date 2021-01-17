package io.hefestos.UIs.Fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import io.hefestos.Adapters.HireFreelaAdapter
import io.hefestos.Models.Freela
import io.hefestos.Models.HireFreela
import io.hefestos.R
import io.hefestos.UIs.NewHireFreelaActivity

class HireFreelaFragment : Fragment() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var floatingActionButton: FloatingActionButton

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_hire_freela, container, false)
        recyclerView = view.findViewById(R.id.recyclerView)
        floatingActionButton = view.findViewById(R.id.floatingActionButton)

        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        recyclerView.adapter = HireFreelaAdapter(requireContext(), generateHireFreelas())

        floatingActionButton.setOnClickListener {
            startActivity(Intent(requireContext(), NewHireFreelaActivity::class.java))
        }
        return view
    }

    private fun generateHireFreelas(): ArrayList<HireFreela>{
        val hireFreelas = arrayListOf<HireFreela>()
        for(i in 0..99){
            hireFreelas.add(
                HireFreela(
                i,
                "Freela $i",
                "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, $i",
                i*10F
            ))
        }
        return hireFreelas
    }

    companion object {
        @JvmStatic
        fun newInstance() = HireFreelaFragment()
    }
}