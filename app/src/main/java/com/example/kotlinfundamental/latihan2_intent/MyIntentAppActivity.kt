package com.example.kotlinfundamental.latihan2_intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.kotlinfundamental.R
import com.example.kotlinfundamental.latihan2_intent.lat_01_explicitintent.MoveActivity

class MyIntentAppActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_intent_app)

        val btnMoveActivity: Button = findViewById(R.id.btn_move_activity)
        btnMoveActivity.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.btn_move_activity -> {
                val moveIntent = Intent(this@MyIntentAppActivity, MoveActivity::class.java)
                startActivity(moveIntent)
            }
        }
    }
}