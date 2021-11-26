package com.basaran.recyclerviewdemobjk


import android.content.Intent
import android.graphics.Bitmap
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.recycler_row.view.*


class RecyclerAdapter(val oyunculistesi:ArrayList<String>, val oyuncugorselleri:ArrayList<Bitmap>):RecyclerView.Adapter<RecyclerAdapter.oyuncuVH>() {

    class oyuncuVH(itemView: View):RecyclerView.ViewHolder(itemView) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): oyuncuVH {
        val itemView= LayoutInflater.from(parent.context).inflate(R.layout.recycler_row,parent,false)
        return oyuncuVH(itemView)
    }

    override fun onBindViewHolder(holder: oyuncuVH, position: Int) {
        holder.itemView.recyclerviewtext.setText(oyunculistesi.get(position))
        holder.itemView.setOnClickListener{
            val intent= Intent(holder.itemView.context,OyunTanitim::class.java)
            intent.putExtra("oyuncuisimlerii",oyunculistesi.get(position))
            val singleton=SingletonClass.SecilenOyuncu
            singleton.gorsel=oyuncugorselleri.get(position)
            holder.itemView.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return oyunculistesi.size
    }
}