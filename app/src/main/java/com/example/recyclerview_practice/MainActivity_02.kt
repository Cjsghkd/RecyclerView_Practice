package com.example.recyclerview_practice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class MainActivity_02 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main02)

        val lstUser = findViewById<RecyclerView>(R.id.lstUser)

        val list = ArrayList<UserData_02>()
        list.add(UserData_02(getDrawable(R.drawable.ic_launcher_foreground)!!, "1", "name1"))
        list.add(UserData_02(getDrawable(R.drawable.ic_launcher_background)!!, "2", "name2"))
        list.add(UserData_02(getDrawable(R.drawable.ic_launcher_foreground)!!, "3", "name3"))

        val adapter = UserAdapter_02(list)
        lstUser.adapter = adapter


    }
}