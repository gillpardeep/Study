package com.example.study.ui.main.home.coreJava.syllabusData

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.study.R
import com.example.study.base.BaseAdadpter
import com.example.study.base.BaseFragment
import com.example.study.data.model.User
import com.example.study.ui.detail.DetailActivity
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.fragment_syllabus_data.*
import kotlinx.android.synthetic.main.item_data.view.*


/**
 * @author Pardeep Singh
 * @since 14/10/19
 * <h1>SyllabusDataFragment</h1>
 *  <p>Description of class</p>
 */
class SyllabusDataFragment : BaseFragment() {

    lateinit var adapter: BaseAdadpter<User>
    private var list = ArrayList<User>()
    private var bundle: Bundle? = null

    companion object {
        val DETAIL_OBJECT = "Detail_Object"

        fun newInstance(): BaseFragment {
            return SyllabusDataFragment()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_syllabus_data, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setUpAdapter()
        var user = User(
            "email",
            "1234",
            "Android",
            "https://www.appliedis.com/wp-content/uploads/2013/11/android1.png"
        )
        adapter.updateAdapter(arrayListOf(user))

        bundle = this.arguments
        if (bundle != null) {
            val user = bundle!!.getParcelable<User>(DETAIL_OBJECT)
            list.add(user)
            adapter.updateAdapter(list)
        }
    }

    private fun setUpAdapter() {
        adapter = object : BaseAdadpter<User>(arrayListOf(), R.layout.item_data) {
            override fun onBindData(holder: RecyclerView.ViewHolder, position: User) {

                holder.itemView.tv_syllabus_data.text = position.name
                Picasso.with(context).load(position.imageUrl).into(holder.itemView.img_data)
                holder.itemView.tv_core_more.setOnClickListener {

                    val intent = Intent(activity, DetailActivity::class.java)
                    intent.putExtra(DETAIL_OBJECT, position)
                    startActivity(intent)
                }
            }
        }
        rv_data.adapter = adapter
    }
}
