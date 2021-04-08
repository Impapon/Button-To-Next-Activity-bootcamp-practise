package com.example.buttontonextactivitybootcamp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_describe_.*

class Describe_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_describe_)

        val passedNumber = intent.getIntExtra("passnumber",1);
       if(passedNumber==1){
            imageid.setImageResource(R.drawable.lal)
           nameid.setText(R.string.lal)
           describeid.setText(R.string.lalbag)
       }
       else if(passedNumber==2){
           imageid.setImageResource(R.drawable.mainamoti)
           nameid.setText(R.string.mai)
           describeid.setText(R.string.Mainamati)
       }
       else if(passedNumber==3){
           imageid.setImageResource(R.drawable.mohasthangor)
           nameid.setText(R.string.mah)
           describeid.setText(R.string.Mahansthangarh)
       }
        else if(passedNumber==4){
           imageid.setImageResource(R.drawable.panamcity)
           nameid.setText(R.string.pan)
           describeid.setText(R.string.Panam)
       }


        else if(passedNumber==5){

           imageid.setImageResource(R.drawable.sat)
           nameid.setText(R.string.shattt)
           describeid.setText(R.string.Shat)

       }

    }

}