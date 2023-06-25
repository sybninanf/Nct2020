package com.example.nct2020

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.barvolume.R

class MainActivity : AppCompatActivity() {
    private lateinit var rvNct: RecyclerView
    private var list: ArrayList<Nct> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val actionbar = supportActionBar
        actionbar!!.title= "Home"

        rvNct = findViewById(R.id.rv_nct)
        rvNct.setHasFixedSize(true)

        list.addAll(NctData.listDataNct)
        showRecyclerList()
    }

    private fun showRecyclerList() {
        rvNct.layoutManager = LinearLayoutManager(this)
        val recyclerAdapter = RecyclerAdapter(list)
        rvNct.adapter = recyclerAdapter
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.miCompose -> {
                val iProfile = Intent(this@MainActivity, ProfileActivity::class.java)
                startActivity(iProfile)
            }
        }
    }
    }
