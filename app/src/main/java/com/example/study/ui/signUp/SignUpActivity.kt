package com.example.study.ui.signUp

import android.content.Intent
import android.os.Bundle
import com.example.study.R
import com.example.study.base.BaseActivity
import com.example.study.ui.login.LoginActivity
import com.example.study.utils.helper.ValidationHelper.validateFields
import kotlinx.android.synthetic.main.activity_login.et_email
import kotlinx.android.synthetic.main.activity_login.et_password
import kotlinx.android.synthetic.main.activity_sign_up.*

/**
 * @author Pardeep Singh
 * @since 11/10/19
 * <h1>SignUpActivity</h1>
 *  <p>Description of class</p>
 */
class SignUpActivity : BaseActivity() {

    override fun getLayout() = R.layout.activity_sign_up

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        btn_sign_up.setOnClickListener {
            val result =
                validateFields(et_email.text.toString(), et_password.text.toString())
            showToast(result)
            if (result == "Login SucessFull") {
                showToast("SignUp SuccessFully")
                startActivity(Intent(this, LoginActivity::class.java))
            }
        }
        tv_sign_up.setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
        }
    }
}