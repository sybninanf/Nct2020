package com.example.nct2020

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.barvolume.R


class DetailActivity : AppCompatActivity() {
    companion object{
        const val EXTRA_DES= "description"
        const val EXTRA_SUB= "description"
        const val EXTRA_DATE= "date"
        const val EXTRA_ZODIAK= "zodiak"
        const val EXTRA_POSISI= "posisi"
        const val EXTRA_NAME= "name"
        const val EXTRA_PHOTO= "photo"
        const val EXTRA_INSTAGRAM= "ig"
}


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        val actionbar = supportActionBar
        actionbar!!.title = "Detail Nct"
        actionbar.setDisplayHomeAsUpEnabled(true)

        val tvSetName: TextView = findViewById(R.id.txtname)
        val imgSetPhoto: ImageView = findViewById(R.id.ivPhoto)
        val tvSetdes: TextView = findViewById(R.id.txtdes)
        val tvDate: TextView = findViewById(R.id.txtttl)
        val tvZodiak: TextView = findViewById(R.id.txtzodiak)
        val tvPosisi: TextView = findViewById(R.id.txtjabatan)
        val tvSub: TextView = findViewById(R.id.txtsub)
        val tvIg: TextView = findViewById(R.id.txtig)


        val tName  = intent.getStringExtra(EXTRA_NAME)
        val tImg = intent.getStringExtra(EXTRA_PHOTO)
        val tdes = intent.getStringExtra(EXTRA_DES)
        val tDate = intent.getStringExtra(EXTRA_DATE)
        val tZodiak = intent.getStringExtra(EXTRA_ZODIAK)
        val tPosisi = intent.getStringExtra(EXTRA_POSISI)
        val tSub = intent.getStringExtra(EXTRA_SUB)
        val tIg = intent.getStringExtra(EXTRA_INSTAGRAM)


        tvSetName.text = tName
        Glide.with(this)
            .load(tImg)
            .apply(RequestOptions())
            .into(imgSetPhoto)
        tvSetdes.text = tdes
        tvZodiak.text = tZodiak
        tvDate.text = tDate
        tvPosisi.text = tPosisi
        tvSub.text = tSub
        tvIg.text = tIg

    }  override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
    }
