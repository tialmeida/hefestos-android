package io.hefestos.Adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import io.hefestos.Models.JobVacancy
import io.hefestos.R

class JobVacancyAdapter(val jobVacancies: ArrayList<JobVacancy>): RecyclerView.Adapter<JobVacancyAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.row_job_vacancy, parent, false)
        val viewHolder = ViewHolder(view)
        viewHolder.listeners()
        return viewHolder
    }

    override fun getItemCount(): Int = jobVacancies.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val jobVacancy = jobVacancies[position]
        holder.run{
            title.text = jobVacancy.title
            description.text = jobVacancy.description
            salary.text = jobVacancy.salary.toString() + "0"
            shift.text = jobVacancy.shift
            workload.text = jobVacancy.workload.toString() + "0"
            type.text = jobVacancy.type
        }
    }

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val title: TextView = itemView.findViewById(R.id.textView_title)
        val description: TextView = itemView.findViewById(R.id.textView_description)
        val salary: TextView = itemView.findViewById(R.id.textView_price)
        val shift: TextView = itemView.findViewById(R.id.textView_shift)
        val workload: TextView = itemView.findViewById(R.id.textView_workload)
        val type: TextView = itemView.findViewById(R.id.textView_type)
        val more: TextView = itemView.findViewById(R.id.btn_more)

        fun listeners(){
            more.setOnClickListener {  }
        }
    }
}