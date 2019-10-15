package com.example.study.ui.detail.design

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.study.R
import com.example.study.base.BaseFragment


/**
 * @author Pardeep Singh
 * @since 15/10/19
 * <h1>DesignFragment</h1>
 * <p>Description of class</p>
 */
class DesignFragment : BaseFragment() {

    companion object {
        fun newInstance(): BaseFragment {
            return DesignFragment()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_design, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }
}