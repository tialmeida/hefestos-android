package io.hefestos.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.MenuInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import android.widget.PopupMenu
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import io.hefestos.Models.HireFreela
import io.hefestos.R

class HireFreelaAdapter(val context: Context, val hireFreelas: ArrayList<HireFreela>): RecyclerView.Adapter<HireFreelaAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.row_hire_freela, parent, false)
        val viewHolder = ViewHolder(view)
        viewHolder.listeners()
        return viewHolder
    }

    override fun getItemCount(): Int = hireFreelas.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val hireFreela = hireFreelas[position]
        holder.run {
            title.text = hireFreela.title
            description.text = hireFreela.description
            price.text = "R$" +
                    "" + hireFreela.price.toString() + "0"
        }
    }

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val title: TextView = itemView.findViewById(R.id.textView_title)
        val description: TextView = itemView.findViewById(R.id.textView_description)
        val price: TextView = itemView.findViewById(R.id.textView_price)
        val apply: Button = itemView.findViewById(R.id.btn_apply)
        val more: ImageButton = itemView.findViewById(R.id.imageButton_more)

        fun listeners(){
            apply.setOnClickListener {}

            more.setOnClickListener {
                val popup = PopupMenu(context, more)
                val inflater: MenuInflater = popup.menuInflater
                inflater.inflate(R.menu.hire_freela_menu, popup.menu)
                popup.show()
            }
        }
    }
}