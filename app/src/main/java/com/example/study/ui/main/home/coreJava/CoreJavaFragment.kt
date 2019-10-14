package com.example.study.ui.main.home.coreJava

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.study.R
import com.example.study.base.BaseFragment
import com.example.study.ui.main.home.coreJava.syllabusData.SyllabusDataFragment
import com.example.study.ui.main.home.coreJava.syllabusLIst.SyllabusListFragment


/**
 * @author Pardeep Singh
 * @since 11/10/19
 * <h1>CoreJavaFragment</h1>
 *  <p>Description of class</p>
 */
class CoreJavaFragment : BaseFragment() {

    companion object {
        private const val EXTRA_LEAD_TYPE = "extra_lead_type"

        fun newInstance(): BaseFragment {
            val fragment = CoreJavaFragment()
            return fragment
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_core_java, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }
}