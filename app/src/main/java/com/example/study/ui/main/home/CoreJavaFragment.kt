package com.example.study.ui.main.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.study.R
import com.example.study.base.BaseAdadpter
import com.example.study.base.BaseFragment
import com.example.study.data.model.User
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.fragment_core_java.*
import kotlinx.android.synthetic.main.item_rv_home.view.*

/**
 * @author Pardeep Singh
 * @since 11/10/19
 * <h1>CoreJavaFragment</h1>
 *  <p>Description of class</p>
 */
class CoreJavaFragment : BaseFragment() {

    lateinit var adapter: BaseAdadpter<User>

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
        setUpAdapter()
    }

    fun setUpAdapter() {
        var user = User(
            "email",
            "1234",
            "Title",
            "https://cdn.mos.cms.futurecdn.net/pnUW2ua9XZuFph9ExrAMCb-320-80.jpg"
        )
        var user1 = User(
            "email",
            "1234",
            "Title",
            "https://cdn.mos.cms.futurecdn.net/pnUW2ua9XZuFph9ExrAMCb-320-80.jpg"
        )
        var user2 = User(
            "email",
            "1234",
            "Title",
            "https://cdn.mos.cms.futurecdn.net/pnUW2ua9XZuFph9ExrAMCb-320-80.jpg"
        )
        var user3 = User(
            "email",
            "1234",
            "Title",
            "https://cdn.mos.cms.futurecdn.net/pnUW2ua9XZuFph9ExrAMCb-320-80.jpg"
        )
        var list = ArrayList<User>()
        list.add(user)
        list.add(user1)
        list.add(user2)
        list.add(user3)
        adapter = object : BaseAdadpter<User>(arrayListOf(), R.layout.item_rv_home) {
            override fun onBindData(holder: RecyclerView.ViewHolder, position: User) {
                holder.itemView.tv_home.text = position.name
                Picasso.with(context).load(position.imageUrl).into(holder.itemView.img_home)
                //loadImage(holder.itemView.img_home, position.imageUrl.toString())
            }
        }
        rv_core_java.adapter = adapter
        adapter.updateAdapter(list)
    }
}