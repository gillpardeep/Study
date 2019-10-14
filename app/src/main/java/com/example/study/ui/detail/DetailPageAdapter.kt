package com.example.study.ui.detail

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager.widget.PagerAdapter
import com.example.study.R
import com.example.study.data.model.User
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.item_detail.view.*

/**
 * @author Pardeep Singh
 * @since 14/10/19
 * <h1>DetailPageAdapter</h1>
 *  <p>Description of class</p>
 */
class DetailPageAdapter(val context: Context, val list: ArrayList<User>) : PagerAdapter() {

    override fun isViewFromObject(view: View, obj: Any): Boolean {
        return view.equals(obj)
    }

    override fun getCount(): Int {
        return list.size
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        val view = LayoutInflater.from(context).inflate(R.layout.item_detail, container, false)
        Picasso.with(context).load("https://i.imgur.com/ruqvPUf.jpg").into(view.img_detail)
        return view
    }
}