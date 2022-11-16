package com.one.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.one.recyclerview.adapter.UserAdapter
import com.one.recyclerview.models.UsersModel

class MainActivity : AppCompatActivity() {
    lateinit var recyclerView: RecyclerView
    val adaperList = mutableListOf<UsersModel>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       recyclerView =  findViewById<RecyclerView>(R.id.recyclerId)

        adaperList.add(UsersModel(R.drawable.img1, "title 1", "message 1"))
        adaperList.add(UsersModel(R.drawable.img2, "title 2", "message 2"))
        adaperList.add(UsersModel(R.drawable.img3, "title 3", "message 3"))
        adaperList.add(UsersModel(R.drawable.img1, "title 1", "message 1"))
        adaperList.add(UsersModel(R.drawable.img2, "title 2", "message 2"))
        adaperList.add(UsersModel(R.drawable.img3, "title 3", "message 3"))
        adaperList.add(UsersModel(R.drawable.img1, "title 1", "message 1"))
        adaperList.add(UsersModel(R.drawable.img2, "title 2", "message 2"))
        adaperList.add(UsersModel(R.drawable.img3, "title 3", "message 3"))
        adaperList.add(UsersModel(R.drawable.img1, "title 1", "message 1"))
        adaperList.add(UsersModel(R.drawable.img2, "title 2", "message 2"))
        adaperList.add(UsersModel(R.drawable.img3, "title 3", "message 3"))
        adaperList.add(UsersModel(R.drawable.img1, "title 1", "message 1"))
        adaperList.add(UsersModel(R.drawable.img2, "title 2", "message 2"))
        adaperList.add(UsersModel(R.drawable.img3, "title 3", "message 3"))
        adaperList.add(UsersModel(R.drawable.img1, "title 1", "message 1"))
        adaperList.add(UsersModel(R.drawable.img2, "title 2", "message 2"))
        adaperList.add(UsersModel(R.drawable.img3, "title 3", "message 3"))
        adaperList.add(UsersModel(R.drawable.img1, "title 1", "message 1"))

        recyclerView.layoutManager = LinearLayoutManager(this)//vertical scroll
//        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)//horizontal scroll
//        recyclerView.layoutManager = GridLayoutManager(this, 3)//vertical scroll 3-column

        recyclerView.adapter = UserAdapter(adaperList)// set adapter


    }
}
/**
 * item ly
 * model
 * adapter
 * */