package io.hefestos.Adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import io.hefestos.Models.Course
import io.hefestos.R

class CourseAdapter(val courses: ArrayList<Course>): RecyclerView.Adapter<CourseAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.row_course, parent, false)
        val viewHolder = ViewHolder(view)
        viewHolder.listeners()
        return viewHolder
    }

    override fun getItemCount(): Int = courses.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val course = courses[position]
        holder.run{
            title.text = course.title
            address.text = course.address
            if(course.price != 0f){
                price.text = "R$ ${course.price}"
            }
            startDate.text = course.startDate
            endDate.text = course.endDate
            month.text = course.month
            startTime.text = course.startTime
            endTime.text = course.endTime
        }
    }

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val title: TextView = itemView.findViewById(R.id.textView_title)
        val address: TextView = itemView.findViewById(R.id.textView_address)
        val price: TextView = itemView.findViewById(R.id.textView_price)
        val apply: Button = itemView.findViewById(R.id.btn_apply)
        val startDate: TextView = itemView.findViewById(R.id.textView_startDate)
        val endDate: TextView = itemView.findViewById(R.id.textView_endDate)
        val month: TextView = itemView.findViewById(R.id.textView_month)
        val startTime: TextView = itemView.findViewById(R.id.textView_startTime)
        val endTime: TextView = itemView.findViewById(R.id.textView_endTime)

        fun listeners(){
            apply.setOnClickListener {  }
        }
    }
}