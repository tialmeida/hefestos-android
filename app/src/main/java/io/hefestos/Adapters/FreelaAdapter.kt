package io.hefestos.Adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import de.hdodenhof.circleimageview.CircleImageView
import io.hefestos.Models.Freela
import io.hefestos.R

class FreelaAdapter(val freelas: ArrayList<Freela>): RecyclerView.Adapter<FreelaAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.row_freela, parent, false)
        val viewHolder = ViewHolder(view)
        viewHolder.listeners()
        return viewHolder
    }

    override fun getItemCount(): Int = freelas.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val freela = freelas[position]
        holder.run{
            title.text = freela.title
            description.text = freela.description
            if(freela.price == 0f){
                price.text = "Gratuito"
            }else{
                price.text = "R$ ${freela.price}0"
            }
            name.text = freela.userName
            city.text = freela.userCity
        }
    }

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val title: TextView = itemView.findViewById(R.id.textView_title)
        val description: TextView = itemView.findViewById(R.id.textView_description)
        val price: TextView = itemView.findViewById(R.id.textView_price)
        val photo: CircleImageView = itemView.findViewById(R.id.circleImageView_userPhoto)
        val name: TextView = itemView.findViewById(R.id.textView_userName)
        val city: TextView = itemView.findViewById(R.id.textView_city)
        val apply: Button = itemView.findViewById(R.id.btn_apply)

        fun listeners(){

        }
    }
}