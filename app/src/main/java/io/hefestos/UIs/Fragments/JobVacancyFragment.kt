package io.hefestos.UIs.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import io.hefestos.Adapters.JobVacancyAdapter
import io.hefestos.Models.Course
import io.hefestos.Models.JobVacancy
import io.hefestos.R

class JobVacancyFragment : Fragment() {
    private lateinit var recyclerView: RecyclerView
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_job_vacancy, container, false)
        recyclerView = view.findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        recyclerView.adapter = JobVacancyAdapter(generateJobVacancy())
        return view
    }

    private fun generateJobVacancy(): ArrayList<JobVacancy>{
        val jobVancancies = arrayListOf<JobVacancy>()
        for(i in 1..30){
            jobVancancies.add(JobVacancy(
                    i,
                    "Técnico em redes $i",
                    "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, $i",
                    i*1100F,
                    40f,
                    "Matutino",
                "Estágio"
            ))
        }
        return jobVancancies
    }

    companion object {
        @JvmStatic
        fun newInstance() = JobVacancyFragment()
    }
}