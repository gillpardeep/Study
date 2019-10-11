package com.example.study.ui.login

import android.content.Intent
import android.os.Bundle
import com.example.study.ui.main.MainActivity
import com.example.study.R
import com.example.study.base.BaseActivity
import com.example.study.ui.signUp.SignUpActivity
import com.example.study.utils.helper.ValidationHelper.validateFields
import kotlinx.android.synthetic.main.activity_login.*

/**
 * @author Pardeep Singh
 * @since 11/10/19
 * <h1>LoginActivity</h1>
 *  <p>Description of class</p>
 */
class LoginActivity : BaseActivity() {

    override fun getLayout() = R.layout.activity_login

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        btn_login.setOnClickListener {
            val result =
                validateFields(et_email.text.toString(), et_password.text.toString())
            showToast(result)
            if (result == "Login SucessFull") {
                startActivity(Intent(this, MainActivity::class.java))
            }
        }
        tv_login.setOnClickListener {
            startActivity(Intent(this, SignUpActivity::class.java))
        }
    }
}