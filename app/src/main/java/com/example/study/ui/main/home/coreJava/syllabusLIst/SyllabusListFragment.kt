package com.example.study.ui.main.home.coreJava.syllabusLIst

import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.study.R
import com.example.study.base.BaseAdadpter
import com.example.study.base.BaseFragment
import com.example.study.data.model.User
import com.example.study.ui.main.home.coreJava.syllabusData.SyllabusDataFragment
import com.example.study.ui.main.home.coreJava.syllabusData.SyllabusDataFragment.Companion.DETAIL_OBJECT
import kotlinx.android.synthetic.main.fragment_syllabus_list.*
import kotlinx.android.synthetic.main.item_rv_home.view.*


/**
 * @author Pardeep Singh
 * @since 14/10/19
 * <h1>SyllabusListFragment</h1>
 *  <p>Description of class</p>
 */
class SyllabusListFragment : BaseFragment() {

    private lateinit var list1: java.util.ArrayList<User>
    lateinit var adapter: BaseAdadpter<User>

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_syllabus_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setUpAdapter()
    }

    fun setUpAdapter() {
        var user = User(
            "email",
            "1234",
            "Android",
            "https://www.appliedis.com/wp-content/uploads/2013/11/android1.png"
        )
        var user1 = User(
            "email",
            "1234",
            "JAVA",
            "https://cdn.app.compendium.com/uploads/user/e7c690e8-6ff9-102a-ac6d-e4aebca50425/bf8cb28a-a019-447d-8704-e443e13573e9/File/e19ea0216ae8395bd4b3389970928be9/java_logo.png"
        )
        var user2 = User(
            "email",
            "1234",
            "Phyton",
            "https://i.imgur.com/ruqvPUf.jpg"
        )
        var user3 = User(
            "email",
            "1234",
            "PHP",
            "http://www.xappsoftware.com/wordpress/wp-content/uploads/2014/02/PHP.png"
        )
        var user5 = User(
            "email",
            "1234",
            "Android",
            "https://www.appliedis.com/wp-content/uploads/2013/11/android1.png"
        )
        var user6 = User(
            "email",
            "1234",
            "JAVA",
            "https://cdn.app.compendium.com/uploads/user/e7c690e8-6ff9-102a-ac6d-e4aebca50425/bf8cb28a-a019-447d-8704-e443e13573e9/File/e19ea0216ae8395bd4b3389970928be9/java_logo.png"
        )
        var user7 = User(
            "email",
            "1234",
            "Phyton",
            "https://i.imgur.com/ruqvPUf.jpg"
        )
        var user8 = User(
            "email",
            "1234",
            "PHP",
            "http://www.xappsoftware.com/wordpress/wp-content/uploads/2014/02/PHP.png"
        )
        var user9 = User(
            "email",
            "1234",
            "Android",
            "https://www.appliedis.com/wp-content/uploads/2013/11/android1.png"
        )
        var user10 = User(
            "email",
            "1234",
            "JAVA",
            "https://cdn.app.compendium.com/uploads/user/e7c690e8-6ff9-102a-ac6d-e4aebca50425/bf8cb28a-a019-447d-8704-e443e13573e9/File/e19ea0216ae8395bd4b3389970928be9/java_logo.png"
        )
        var user11 = User(
            "email",
            "1234",
            "Phyton",
            "https://i.imgur.com/ruqvPUf.jpg"
        )
        var user12 = User(
            "email",
            "1234",
            "PHP",
            "http://www.xappsoftware.com/wordpress/wp-content/uploads/2014/02/PHP.png"
        )
        var user13 = User(
            "email",
            "1234",
            "Phyton",
            "https://i.imgur.com/ruqvPUf.jpg"
        )
        var user14 = User(
            "email",
            "1234",
            "PHP",
            "http://www.xappsoftware.com/wordpress/wp-content/uploads/2014/02/PHP.png"
        )

        list1 = ArrayList<User>()
        list1.add(user)
        list1.add(user1)
        list1.add(user2)
        list1.add(user3)
        list1.add(user5)
        list1.add(user6)
        list1.add(user7)
        list1.add(user8)
        list1.add(user9)
        list1.add(user10)
        list1.add(user11)
        list1.add(user12)
        list1.add(user13)
        list1.add(user14)

        adapter = object : BaseAdadpter<User>(arrayListOf(), R.layout.item_rv_home) {
            override fun onBindData(holder: RecyclerView.ViewHolder, position: User) {

                holder.itemView.tv_home.text = position.name

                holder.itemView.setOnClickListener {
                    val bundle = Bundle()
                    bundle.putParcelable(DETAIL_OBJECT, position) // Put anything what you want
                    val fragment2 = SyllabusDataFragment()
                    fragment2.setArguments(bundle)
                    fragmentManager!!.beginTransaction()
                        .replace(R.id.fragmnet_data, fragment2).commit()

                    list.get(holder.adapterPosition).isSelect = !position.isSelect
                    notifyDataSetChanged()
                }
                if (list.get(holder.adapterPosition).isSelect) {
                    holder.itemView.setBackgroundColor(Color.parseColor("#DBDADA"))
                    list.get(holder.adapterPosition).isSelect = false
                } else {
                    holder.itemView.setBackgroundColor(Color.parseColor("#FFFFFF"))
                }
            }
        }
        rv_core_java.adapter = adapter
        adapter.updateAdapter(list1)
    }
}