package com.example.buttontonextactivitybootcamp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(),View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lalbagid.setOnClickListener(this)
        mainamotiid.setOnClickListener(this)
        mohasthangorid.setOnClickListener(this)
        panamid.setOnClickListener(this)
        shatid.setOnClickListener(this)




    }

    override fun onClick(view: View?) {
        when(view?.id){
            R.id.lalbagid->{

                sendAnotherActivity(1)
            }
            R.id.mainamotiid->{

                sendAnotherActivity(2)
            }

            R.id.mohasthangorid->{

                sendAnotherActivity(3)
            }

            R.id.panamid->{

                sendAnotherActivity(4)
            }

            R.id.shatid->{

                sendAnotherActivity(5)
            }


        }
    }

    private fun sendAnotherActivity(i: Int) {
        val intent = Intent(this,Describe_Activity::class.java)
        intent.putExtra("passnumber",i)
        startActivity(intent)

    }
}