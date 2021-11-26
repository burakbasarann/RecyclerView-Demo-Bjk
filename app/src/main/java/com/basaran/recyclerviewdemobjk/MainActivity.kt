package com.basaran.recyclerviewdemobjk

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var oyuncuisimleri =ArrayList<String>()
        oyuncuisimleri.add("Alex Teixeira")
        oyuncuisimleri.add("Atiba Hutchinson")
        oyuncuisimleri.add("Batshuayi")
        oyuncuisimleri.add("Can Bozdoğan")
        oyuncuisimleri.add("Ersin Destanoğlu")
        oyuncuisimleri.add("Rachid Ghezzal")
        oyuncuisimleri.add("Josef De Souza")
        oyuncuisimleri.add("Cyle Larin")
        oyuncuisimleri.add("Mehmet Topal")
        oyuncuisimleri.add("Mert Günok")
        oyuncuisimleri.add("Montero")
        oyuncuisimleri.add("Necip Uysal")
        oyuncuisimleri.add("Pjanic")
        oyuncuisimleri.add("Rıdvan Yılmaz")
        oyuncuisimleri.add("Valentine Rosier")
        oyuncuisimleri.add("Serdar Saatçi")
        oyuncuisimleri.add("Umut Meraş")
        oyuncuisimleri.add("Vida")
        oyuncuisimleri.add("Welinton")


        val alexbitmap=BitmapFactory.decodeResource(applicationContext.resources,R.drawable.alex)
        val atibabitmap=BitmapFactory.decodeResource(applicationContext.resources,R.drawable.atiba)
        val basthuayibitmap=BitmapFactory.decodeResource(applicationContext.resources,R.drawable.batshuayi)
        val canbozdoganbitmap=BitmapFactory.decodeResource(applicationContext.resources,R.drawable.canbozdogan)
        val ersinbitmap=BitmapFactory.decodeResource(applicationContext.resources,R.drawable.ersin)
        val ghezzalbitmap=BitmapFactory.decodeResource(applicationContext.resources,R.drawable.ghezzal)
        val josefbitmap=BitmapFactory.decodeResource(applicationContext.resources,R.drawable.josef)
        val larinbitmap=BitmapFactory.decodeResource(applicationContext.resources,R.drawable.larin)
        val mehmettopalbitmap=BitmapFactory.decodeResource(applicationContext.resources,R.drawable.mehmettopal)
        val mertgunokbitmap=BitmapFactory.decodeResource(applicationContext.resources,R.drawable.mertgunok)
        val monterobitmap=BitmapFactory.decodeResource(applicationContext.resources,R.drawable.montero)
        val necipbitmap=BitmapFactory.decodeResource(applicationContext.resources,R.drawable.necip)
        val pjanicbitmap=BitmapFactory.decodeResource(applicationContext.resources,R.drawable.pjanic)
        val ridvanyilmazbitmap=BitmapFactory.decodeResource(applicationContext.resources,R.drawable.ridvanyilmaz)
        val rosierbitmap=BitmapFactory.decodeResource(applicationContext.resources,R.drawable.rosier)
        val serdarsaatcibitmap=BitmapFactory.decodeResource(applicationContext.resources,R.drawable.serdarsaatci)
        val umutmerasbitmap=BitmapFactory.decodeResource(applicationContext.resources,R.drawable.umutmeras)
        val vidabitmap=BitmapFactory.decodeResource(applicationContext.resources,R.drawable.vida)
        val welintonbitmap=BitmapFactory.decodeResource(applicationContext.resources,R.drawable.welinton)

        var oyuncugorselleri = ArrayList<Bitmap>()
        oyuncugorselleri.add(alexbitmap)
        oyuncugorselleri.add(atibabitmap)
        oyuncugorselleri.add(basthuayibitmap)
        oyuncugorselleri.add(canbozdoganbitmap)
        oyuncugorselleri.add(ersinbitmap)
        oyuncugorselleri.add(ghezzalbitmap)
        oyuncugorselleri.add(josefbitmap)
        oyuncugorselleri.add(larinbitmap)
        oyuncugorselleri.add(mehmettopalbitmap)
        oyuncugorselleri.add(mertgunokbitmap)
        oyuncugorselleri.add(monterobitmap)
        oyuncugorselleri.add(necipbitmap)
        oyuncugorselleri.add(pjanicbitmap)
        oyuncugorselleri.add(ridvanyilmazbitmap)
        oyuncugorselleri.add(rosierbitmap)
        oyuncugorselleri.add(serdarsaatcibitmap)
        oyuncugorselleri.add(umutmerasbitmap)
        oyuncugorselleri.add(vidabitmap)
        oyuncugorselleri.add(welintonbitmap)


        val layoutManager=LinearLayoutManager(this)
        recyclerView.layoutManager=layoutManager
        val adapter=RecyclerAdapter(oyuncuisimleri,oyuncugorselleri)
        recyclerView.adapter=adapter
    }
}