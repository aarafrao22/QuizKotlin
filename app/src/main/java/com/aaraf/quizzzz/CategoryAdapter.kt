package com.aaraf.quizzzz

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CategoryAdapter(private val context: Context, val item: List<CategoryModel>) :
    RecyclerView.Adapter<CategoryAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val layoutInflater: LayoutInflater = LayoutInflater.from(parent.context)
        val view: View = layoutInflater.inflate(R.layout.categoryitem, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.setData(item[position].name, item[position].image, item[position].sets)
    }

    override fun getItemCount(): Int {
        return item.size
    }


    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var txtView: TextView = itemView.findViewById<TextView>(R.id.textView)
        var imageView: ImageView = itemView.findViewById<ImageView>(R.id.imageView)


        fun setData(name: String?, imageView: Int, sets: Int) {
            this.txtView.text = name
            this.imageView.setImageResource(item[position].image)

            itemView.setOnClickListener {

                val setIntent = Intent(itemView.context, setActivity::class.java)
                setIntent.putExtra("Title", name)
                setIntent.putExtra("Sets", sets)
                itemView.context.startActivity(setIntent)
            }
        }


    }
}