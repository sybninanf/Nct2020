package com.example.nct2020

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.barvolume.R

class RecyclerAdapter( val listNct: ArrayList<Nct>) : RecyclerView.Adapter<RecyclerAdapter.ListViewHolder>() {

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_nct, viewGroup,false )
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listNct.size
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val (photo,name , date, zodiak, jabatan, sub, instagram, des) = listNct[position]

        Glide.with(holder.itemView.context)
            .load(photo)
            .apply(RequestOptions().override(55, 55))
            .into(holder.imgPhoto)

        holder.tvname.text = name
        holder.tvborn.text = date
        holder.tvzodiak.text = zodiak
        holder.tvjabatan.text = jabatan
        holder.tvsub.text = sub
        holder.tvig.text = instagram
        holder.tvdes.text = des.toString()

        val mContext = holder.itemView.context

        holder.itemView.setOnClickListener {
            val moveDetail = Intent(mContext, DetailActivity::class.java)
            moveDetail.putExtra(DetailActivity.EXTRA_PHOTO, photo)
            moveDetail.putExtra(DetailActivity.EXTRA_NAME, name)
            moveDetail.putExtra(DetailActivity.EXTRA_DATE, date)
            moveDetail.putExtra(DetailActivity.EXTRA_ZODIAK, zodiak)
            moveDetail.putExtra(DetailActivity.EXTRA_POSISI,jabatan)
            moveDetail.putExtra(DetailActivity.EXTRA_SUB, sub)
            moveDetail.putExtra(DetailActivity.EXTRA_INSTAGRAM, instagram)
            moveDetail.putExtra(DetailActivity.EXTRA_DES, des)

            mContext.startActivity(moveDetail)
        }
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgPhoto: ImageView = itemView.findViewById(R.id.ivPhoto)
        var tvname: TextView = itemView.findViewById(R.id.txtname)
        var tvborn: TextView = itemView.findViewById(R.id.txtttl)
        var tvzodiak: TextView = itemView.findViewById(R.id.txtzodiak)
        var tvjabatan: TextView = itemView.findViewById(R.id.txtjabatan)
        var tvsub: TextView = itemView.findViewById(R.id.txtsub)
        var tvig: TextView = itemView.findViewById(R.id.txtig)
        var tvdes: TextView = itemView.findViewById(R.id.txtdes)

    }


}