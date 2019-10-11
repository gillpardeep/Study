package com.example.study.ui.main.profile

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.study.R
import com.example.study.base.BaseFragment

/**
 * @author Pardeep Singh
 * @since 11/10/19
 * <h1>ProfileFragment</h1>
 *  <p>Description of class</p>
 */
class ProfileFragment :BaseFragment() {

    companion object {
        fun newInstance(): BaseFragment {
            return ProfileFragment()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_profile, container, false)
    }

}