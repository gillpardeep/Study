package com.example.study.ui.main.home.coreJava.syllabusLIst

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
            "data:image/jpeg;base64,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"
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
            "data:image/jpeg;base64,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"
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
            "data:image/jpeg;base64,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"
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

        var list = ArrayList<User>()
        list.add(user)
        list.add(user1)
        list.add(user2)
        list.add(user3)
        list.add(user5)
        list.add(user6)
        list.add(user7)
        list.add(user8)
        list.add(user9)
        list.add(user10)
        list.add(user11)
        list.add(user12)
        list.add(user1)
        list.add(user1)
        list.add(user2)
        list.add(user3)
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
                }
            }
        }
        rv_core_java.adapter = adapter
        adapter.updateAdapter(list)
    }
}