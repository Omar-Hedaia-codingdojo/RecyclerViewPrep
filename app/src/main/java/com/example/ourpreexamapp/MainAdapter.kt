package com.example.ourpreexamapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.ourpreexamapp.databinding.ActivityMainBinding
import com.example.ourpreexamapp.databinding.CustomItemRowBinding


class MainAdapter(val todoList:ArrayList<String>): RecyclerView.Adapter<MainAdapter.MyViewHolder>(){
    class MyViewHolder(val binding: CustomItemRowBinding):RecyclerView.ViewHolder(binding.root){


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(CustomItemRowBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val todoItem = todoList[position]

        holder.binding.apply {
            todoTV.text = todoItem
            todoTV.setOnClickListener {


            }

        }


    }

    override fun getItemCount(): Int {
        return todoList.size
    }


}