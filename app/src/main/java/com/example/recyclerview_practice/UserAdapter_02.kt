package com.example.recyclerview_practice

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class UserAdapter_02(private val items : ArrayList<UserData_02>) : RecyclerView.Adapter<UserAdapter_02.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserAdapter_02.ViewHolder {
        val inflatedView = LayoutInflater.from(parent.context).inflate(R.layout.item_recycler_02, parent, false)
        return UserAdapter_02.ViewHolder(inflatedView)
    }

    override fun onBindViewHolder(holder: UserAdapter_02.ViewHolder, position: Int) {
        val item = items[position]
        val listener = View.OnClickListener {
            Toast.makeText(it.context, "Clicked -> ID : ${item.id}, Name : ${item.name}", Toast.LENGTH_SHORT).show()
        }
        holder.apply {
            bind(listener, item)
            itemView.tag = item
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }

    class ViewHolder(v : View) : RecyclerView.ViewHolder(v) {
        private var view : View = v
        private val id : TextView = itemView.findViewById(R.id.txtUser_id)
        private val name : TextView = itemView.findViewById(R.id.txtUser_name)
        fun bind(listener : View.OnClickListener, item : UserData_02) {
            id.text = item.id
            name.text = item.name
            view.setOnClickListener(listener)

            view.setOnClickListener {
                Toast.makeText(it.context, "Clicked -> ID : ${item.id}, NAME : ${item.name}", Toast.LENGTH_SHORT).show()
            }
        }
    }
}