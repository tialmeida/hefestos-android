package io.hefestos.UIs.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import io.hefestos.Adapters.CourseAdapter
import io.hefestos.Models.Course
import io.hefestos.R

class CoursesFragment : Fragment() {
    private lateinit var recyclerView: RecyclerView
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_courses, container, false)
        recyclerView = view.findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        recyclerView.adapter = CourseAdapter(generateCourses())
        return view
    }

    private fun generateCourses(): ArrayList<Course>{
        val freelas = arrayListOf<Course>()
        for(i in 1..30){
            freelas.add(Course(
                i,
                "Freela $i",
                "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, $i",
                "Rua Landoufo Alves, $i, Santo Antonio de Jesus - BA",
                (i-1)*10F,
                "$i",
                    "${i+2}",
                    "Out",
                    "06:30",
                    "10:30"
            ))
        }
        return freelas
    }

    companion object {
        @JvmStatic
        fun newInstance() = CoursesFragment()
    }
}