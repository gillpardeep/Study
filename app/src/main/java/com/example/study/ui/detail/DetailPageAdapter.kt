package com.example.study.ui.detail

import android.content.Context
import android.os.Parcelable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.viewpager.widget.PagerAdapter
import com.example.study.R
import com.example.study.data.model.User
import com.squareup.picasso.Picasso

/**
 * @author Pardeep Singh
 * @since 14/10/19
 * <h1>DetailPageAdapter</h1>
 *  <p>Description of class</p>
 */
class DetailPageAdapter(val context: Context, val list: ArrayList<User>) : PagerAdapter() {
    private val inflater: LayoutInflater


    init {
        inflater = LayoutInflater.from(context)
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(`object` as View)
    }

    override fun getCount(): Int {
        return list.size
    }

    override fun instantiateItem(view: ViewGroup, position: Int): Any {
        val imageLayout = inflater.inflate(R.layout.item_detail, view, false)!!

        val imageView = imageLayout
            .findViewById(R.id.img_detail) as ImageView

        Picasso.with(context).load(list.get(position).imageUrl)
            .placeholder(R.drawable.ic_profile)
            .into(imageView)

        view.addView(imageLayout, 0)

        return imageLayout
    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view == `object`
    }

    override fun restoreState(state: Parcelable?, loader: ClassLoader?) {}

    override fun saveState(): Parcelable? {
        return null
    }

}