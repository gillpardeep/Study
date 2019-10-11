package com.example.study.ui.main

import android.os.Bundle
import android.view.MenuItem
import androidx.fragment.app.Fragment
import com.example.study.R
import com.example.study.base.BaseActivity
import com.example.study.ui.main.home.HomeFragment
import com.example.study.ui.main.more.MoreFragment
import com.example.study.ui.main.profile.ProfileFragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity(), BottomNavigationView.OnNavigationItemSelectedListener {

    override fun getLayout() = R.layout.activity_main
    private var doubleBackToExitPressedOnce = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        loadFragment(HomeFragment())
        bottom_navigation.setOnNavigationItemSelectedListener(this)
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        var fragment = HomeFragment.newInstance()
        when (item.getItemId()) {
            R.id.action_home -> fragment = HomeFragment.newInstance()

            R.id.action_profile -> fragment = ProfileFragment.newInstance()

            R.id.action_more -> fragment = MoreFragment.newInstance()
        }
        return loadFragment(fragment)

    }

    private fun loadFragment(fragment: Fragment): Boolean {
        //switching fragment
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.container, fragment)
            .commit()
        return true
    }

    override fun onBackPressed() {
        if (doubleBackToExitPressedOnce) {
            super.onBackPressed()
            return
        }
        this.doubleBackToExitPressedOnce = true
        showToast(getString(R.string.exit_toast))
    }
}
