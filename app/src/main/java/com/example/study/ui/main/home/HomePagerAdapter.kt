package com.example.study.ui.main.home

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter

/**
 * @author Pardeep Singh
 * @since 11/10/19
 * <h1>HomePagerAdapter</h1>
 *  <p>Description of class</p>
 */
class HomePagerAdapter(fm: FragmentManager) : FragmentStatePagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {
        var fragment: Fragment? = null
        when (position) {
            0 -> fragment = CoreJavaFragment.newInstance()
            1 -> fragment = AndroidFragment.newInstance()
        }
        return fragment!!
    }

    override fun getCount(): Int {
        return 2
    }

    override fun getPageTitle(position: Int): CharSequence? {
        var title: String? = null
        if (position == 0) {
            title = "Core-Java"
        } else if (position == 1) {
            title = "Android"
        }
        return title
    }
}