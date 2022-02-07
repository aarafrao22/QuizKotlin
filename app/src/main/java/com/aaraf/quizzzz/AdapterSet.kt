package com.aaraf.quizzzz

import android.R.attr.category
import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView


class AdapterSet(var context:Context, var sets:Int) : BaseAdapter() {


    override fun getCount(): Int {
        return sets
    }

    override fun getItem(position: Int): Any? {
        return null
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View? {
        val layoutInflater : LayoutInflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val view : View = layoutInflater.inflate(R.layout.setitem,parent,false)
        view.setOnClickListener { var intent:Intent(this,QuestionActivity) }

        val viewText: TextView = view.findViewById(R.id.textSet)
        viewText.text = (position+1).toString()
        return view

    }


}