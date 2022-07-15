package com.example.bindingadapter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.bindingadapter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var mainbinding: ActivityMainBinding
    private lateinit var model: ArrayList<DataModel>
    private lateinit var adapterr: Adapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainbinding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainbinding.root)


        model= ArrayList()
        adapterr=Adapter(model)
        mainbinding.rec.adapter=adapterr
        mainbinding.rec.layoutManager = LinearLayoutManager(this)


        model.add(0,DataModel("appu"))
        model.add(1,DataModel("manoj"))
        model.add(2,DataModel("appu"))
        model.add(3,DataModel("manoj"))
        model.add(4, DataModel("appu"))
        model.add(5,DataModel("manoj"))
        model.add(6,DataModel("appu"))
        model.add(7,DataModel("manoj"))
        model.add(8,DataModel("appu"))

adapterr.notifyDataSetChanged()
    }
}