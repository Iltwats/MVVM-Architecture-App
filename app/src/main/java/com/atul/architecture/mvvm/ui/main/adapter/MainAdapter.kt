package com.atul.architecture.mvvm.ui.main.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.atul.architecture.mvvm.R
import com.atul.architecture.mvvm.data.model.User
import com.bumptech.glide.Glide

class MainAdapter(private val users: ArrayList<User>):RecyclerView.Adapter<MainAdapter.DataViewHolder>() {

    class DataViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        fun bind(user:User){
            val textName: TextView = itemView.findViewById(R.id.textViewUserName)
            val textEmail: TextView = itemView.findViewById(R.id.textViewUserEmail)
            val imageUser: ImageView = itemView.findViewById(R.id.imageViewAvatar)
            textName.text = user.name
            textEmail.text = user.email
            Glide.with(imageUser.context)
                .load(user.avatar)
                .into(imageUser)
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        DataViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_layout, parent,
                false
            )
        )


    override fun onBindViewHolder(holder: DataViewHolder, position: Int) = holder.bind(users[position])

    override fun getItemCount(): Int = users.size

    fun addData(list: List<User>) {
        users.addAll(list)
    }
}