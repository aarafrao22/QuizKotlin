package com.aaraf.quizzzz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_category.*

class CategoryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_category)


        var arrayList1 = ArrayList<CategoryModel>()
        arrayList1.add(CategoryModel("Cateory1",R.mipmap.ic_launcher,8))
        arrayList1.add(CategoryModel("Cateory2",R.mipmap.ic_launcher,9))
        arrayList1.add(CategoryModel("Cateory3",R.mipmap.ic_launcher,0))
        arrayList1.add(CategoryModel("Cateory4",R.mipmap.ic_launcher,12))

        categoryList.layoutManager = LinearLayoutManager(this)
        categoryList.adapter = CategoryAdapter(this,arrayList1)

    }
}