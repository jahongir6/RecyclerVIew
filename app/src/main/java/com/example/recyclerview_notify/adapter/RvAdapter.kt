package com.example.recyclerview_notify.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview_notify.R
import com.example.recyclerview_notify.databinding.ItemRvBinding
import com.example.recyclerview_notify.models.User

class RvAdapter(var list: ArrayList<User> = ArrayList(), val context: Context) :
    RecyclerView.Adapter<RvAdapter.Vh>() {

    inner class Vh(val itemRvBinding: ItemRvBinding) : RecyclerView.ViewHolder(itemRvBinding.root) {
        fun onBind(user: User) {
            itemRvBinding.tvName.text = user.name
            itemRvBinding.tvAge.text = user.age.toString()
            itemRvBinding.image.setImageResource(user.image)

            val animation = AnimationUtils.loadAnimation(context, R.anim.anim)
            itemRvBinding.root.startAnimation(animation)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Vh {
        return Vh(ItemRvBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: Vh, position: Int) {
        holder.onBind(list[position])
    }

    override fun getItemCount(): Int = list.size

}