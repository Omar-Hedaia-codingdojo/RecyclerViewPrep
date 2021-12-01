package com.example.ourpreexamapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.ourpreexamapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var todoList:ArrayList<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        todoList = arrayListOf()


        val adapter = MainAdapter(todoList)
        binding.mainRV.adapter = adapter
        binding.mainRV.layoutManager = LinearLayoutManager(this)


        binding.addBtn.setOnClickListener{

            todoList.add(binding.todoEt.text.toString())
            adapter.notifyDataSetChanged()


        }









    }




}