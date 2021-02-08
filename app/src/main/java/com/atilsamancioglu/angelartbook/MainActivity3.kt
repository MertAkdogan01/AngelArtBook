package com.atilsamancioglu.angelartbook

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main3.*

class MainActivity3 : AppCompatActivity() {

    var mediaPlayer: MediaPlayer? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        playSoundBtn.setOnClickListener {

            mediaPlayer=MediaPlayer.create(this,R.raw.duman)
            mediaPlayer?.start()

        }


    }

    fun heaven (view : View){

        val intent = Intent(applicationContext,MainActivity ::class.java)
        startActivity(intent)
        val text = textView.text
        val text2 = textView2.text
    }




}