package com.example.recyclerview_practice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class MainActivity_01 : AppCompatActivity() {

    lateinit var profileAdapter : ProfileAdpater_01
    val datas = mutableListOf<ProfileData_01>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_01)
        initRecycler()
    }

    private fun initRecycler() {
        profileAdapter = ProfileAdpater_01(this)
        val rv_profile = findViewById<RecyclerView>(R.id.rv_profile)
        rv_profile.adapter = profileAdapter

        datas.apply {
            add(ProfileData_01(img = R.drawable.ic_launcher_foreground, name = "mary", age = 24))
            add(ProfileData_01(img = R.drawable.ic_launcher_background, name = "jenny", age = 26))
            add(ProfileData_01(img = R.drawable.ic_launcher_foreground, name = "jhon", age = 27))
            add(ProfileData_01(img = R.drawable.ic_launcher_foreground, name = "ruby", age = 21))
            add(ProfileData_01(img = R.drawable.ic_launcher_background, name = "yuna", age = 23))

            profileAdapter.datas = datas
            profileAdapter.notifyDataSetChanged()
        }
    }

}