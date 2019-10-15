package com.example.study.ui.detail

import android.os.Bundle
import com.example.study.R
import com.example.study.base.BaseActivity
import com.example.study.data.model.User
import com.example.study.ui.main.home.coreJava.syllabusData.SyllabusDataFragment.Companion.DETAIL_OBJECT
import kotlinx.android.synthetic.main.activity_detail.*
import kotlinx.android.synthetic.main.fragment_home.*

/**
 * @author Pardeep Singh
 * @since 14/10/19
 * <h1>DetailActivity</h1>
 *  <p>Description of class</p>
 */
class DetailActivity : BaseActivity() {

    private lateinit var viewPageAdapter: DetailPageAdapter
    private var list = ArrayList<User>()

    override fun getLayout() = R.layout.activity_detail

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        btn_back_detail.setOnClickListener { onBackPressed() }

        val user = intent.getParcelableExtra<User>(DETAIL_OBJECT)
        list.add(user)
        list.add(user)
        viewPageAdapter = DetailPageAdapter(this, list)
        view_pager_detail.adapter = viewPageAdapter
        tv_detail_title.text = user.name
        tab_detail.setupWithViewPager(view_pager_detail, true)
        setUpAdapter()
    }

    fun setUpAdapter() {
        val viewPagerAdapter = DetailViewPagerAdapter(supportFragmentManager)
        view_pager_details.setAdapter(viewPagerAdapter)
        tab_layout_detail.setupWithViewPager(view_pager_details)
    }
}