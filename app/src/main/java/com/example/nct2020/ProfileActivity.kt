package com.example.nct2020

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.barvolume.R


class ProfileActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val actionbar = supportActionBar
        actionbar!!.title = "Profile"
        actionbar.setDisplayHomeAsUpEnabled(true)
        val imgMe: ImageView = findViewById(R.id.ivFoto)
        val tImg = "https://dicoding-web-img.sgp1.cdn.digitaloceanspaces.com/small/avatar/dos:0e1f19365b258a19ad2e90d7b9190fcf20220107235110.png"

        Glide.with(this)
            .load(tImg)
            .apply(RequestOptions())
            .into(imgMe)

    }


    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true

    }
}