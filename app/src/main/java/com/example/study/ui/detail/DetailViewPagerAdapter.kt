package com.example.study.ui.detail

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.example.study.ui.detail.code.CodeFragment
import com.example.study.ui.detail.design.DesignFragment
import com.example.study.ui.detail.theory.TheoryFragment


/**
 * @author Pardeep Singh
 * @since 15/10/19
 * <h1>DetailViewPagerAdapter</h1>
 * <p>Description of class</p>
 */
class DetailViewPagerAdapter(supportFragmentManager: FragmentManager) :
    FragmentStatePagerAdapter(supportFragmentManager) {

    override fun getItem(position: Int): Fragment {
        var fragment: Fragment? = null
        when (position) {
            0 -> fragment = TheoryFragment.newInstance()
            1 -> fragment = CodeFragment.newInstance()
            2 -> fragment = DesignFragment.newInstance()
        }
        return fragment!!
    }

    override fun getCount(): Int {
        return 3
    }

    override fun getPageTitle(position: Int): CharSequence? {
        var title: String? = null
        if (position == 0) {
            title = "Theory"
        } else if (position == 1) {
            title = "Code"
        } else if (position == 2) {
            title = "Design"
        }
        return title
    }
}