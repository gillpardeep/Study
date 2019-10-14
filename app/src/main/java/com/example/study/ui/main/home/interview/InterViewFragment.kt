package com.example.study.ui.main.home.interview

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.study.R
import com.example.study.base.BaseFragment
import com.example.study.ui.main.home.android.AndroidFragment

/**
 * @author Pardeep Singh
 * @since 14/10/19
 * <h1>InterViewFragment</h1>
 *  <p>Description of class</p>
 */
class InterViewFragment :BaseFragment() {

    companion object {
        private const val EXTRA_LEAD_TYPE = "extra_lead_type"

        fun newInstance(): BaseFragment {
            val fragment = InterViewFragment()
            return fragment
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_interview, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }
}