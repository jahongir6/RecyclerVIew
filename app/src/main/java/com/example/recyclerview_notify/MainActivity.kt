package com.example.recyclerview_notify

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.recyclerview_notify.adapter.RvAdapter
import com.example.recyclerview_notify.databinding.ActivityMainBinding
import com.example.recyclerview_notify.utils.MyData

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var rvAdapter: RvAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        MyData.addUser()
        rvAdapter = RvAdapter(list = MyData.list,this)
        binding.rv.adapter = rvAdapter

    }
}