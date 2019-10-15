package com.example.study.ui.main.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.study.R
import com.example.study.base.BaseAdadpter
import com.example.study.base.BaseFragment
import com.example.study.data.model.User
import kotlinx.android.synthetic.main.fragment_home.*


/**
 * @author Pardeep Singh
 * @since 11/10/19
 * <h1>HomeFragment</h1>
 *  <p>Description of class</p>
 */
class HomeFragment : BaseFragment() {

    lateinit var adapter: BaseAdadpter<User>

    companion object {
        fun newInstance(): BaseFragment {
            return HomeFragment()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setUpAdapter()
    }

    fun setUpAdapter(){
        val viewPagerAdapter = HomePagerAdapter(fragmentManager!!)
        view_pager.offscreenPageLimit = 2
        view_pager.setAdapter(viewPagerAdapter)
        tb_layout.setupWithViewPager(view_pager)
    }
}