package com.aaraf.quizzzz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridLayout
import kotlinx.android.synthetic.main.activity_category.*
import kotlinx.android.synthetic.main.activity_set.*

class setActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_set)

        toolbar.title = intent.getStringExtra("Title")
        val sets:Int = intent.getIntExtra("Sets",0)

        GridView.adapter = AdapterSet(this,sets)
        GridView.setOnItemClickListener { parent, view, position, id ->

        }


    }
}