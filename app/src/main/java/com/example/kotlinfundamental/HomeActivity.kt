package com.example.kotlinfundamental

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.kotlinfundamental.latihan01.InputEventsActivity

class HomeActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn_intent_barvolume: Button = findViewById(R.id.btn_input_events)
        btn_intent_barvolume.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        when (p0?.id) {
            R.id.btn_input_events -> {
                val intent = Intent(this, InputEventsActivity::class.java)
                startActivity(intent)
            }
        }
    }
}