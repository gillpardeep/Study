package com.example.study.ui.main.more

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.study.R
import com.example.study.base.BaseFragment
import com.example.study.ui.login.LoginActivity
import kotlinx.android.synthetic.main.fragment_more.view.*

/**
 * @author Pardeep Singh
 * @since 11/10/19
 * <h1>MoreFragment</h1>
 *  <p>Description of class</p>
 */
class MoreFragment :BaseFragment() {

    companion object {
        fun newInstance(): BaseFragment {
            return MoreFragment()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_more, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.tv_more.setOnClickListener {
            startActivity(Intent(activity!!.applicationContext,LoginActivity::class.java))
        }
    }

}