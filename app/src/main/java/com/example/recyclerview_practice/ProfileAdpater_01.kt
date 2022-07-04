package com.example.recyclerview_practice

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class ProfileAdpater_01(private val context : Context) : RecyclerView.Adapter<ProfileAdpater_01.ViewHolder>() {

    var datas = mutableListOf<ProfileData_01>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProfileAdpater_01.ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_recycler_01, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ProfileAdpater_01.ViewHolder, position: Int) {
        holder.bind(datas[position])
    }

    override fun getItemCount(): Int {
        return datas.size
    }

    inner class ViewHolder(view : View) : RecyclerView.ViewHolder(view) {
        private val txtName : TextView = itemView.findViewById(R.id.tv_rv_name)
        private val txtAge : TextView = itemView.findViewById(R.id.tv_rv_age)
        private val imgProfile : ImageView = itemView.findViewById(R.id.img_rv_photo)

        fun bind(item : ProfileData_01) {
            txtName.text = item.name
            txtAge.text = item.age.toString()
            Glide.with(itemView).load(item.img).into(imgProfile)
        }
    }
}