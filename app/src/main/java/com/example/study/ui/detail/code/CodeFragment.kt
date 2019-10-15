package com.example.study.ui.detail.code

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.study.R
import com.example.study.base.BaseFragment


/**
 * @author Pardeep Singh
 * @since 15/10/19
 * <h1>CodeFragment</h1>
 * <p>Description of class</p>
 */
class CodeFragment : BaseFragment() {

    companion object {
        fun newInstance(): BaseFragment {
            return CodeFragment()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_code, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }
}