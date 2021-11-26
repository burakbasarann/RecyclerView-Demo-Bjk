package com.basaran.recyclerviewdemobjk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_oyun_tanitim.*

class OyunTanitim : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_oyun_tanitim)

        val intent=intent
        val secilenoyuncuismi=intent.getStringExtra("oyuncuisimlerii")
        textView.text=secilenoyuncuismi

        val secilenoyuncu=SingletonClass.SecilenOyuncu
        val secilengorsel=secilenoyuncu.gorsel
        imageView.setImageBitmap(secilengorsel)
    }
}