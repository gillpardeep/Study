package com.example.study.utils.helper

import com.example.study.data.constants.Config
import com.example.study.utils.CommonUtils

/**
 * @author Pardeep Singh
 * @since 11/10/19
 * <h1>ValidationHelper</h1>
 *  <p>Description of class</p>
 */
object ValidationHelper {

    fun validateFields(
        email: String? = null,
        password: String? = null
    ): String {

        if (email!!.isEmpty()) {
            return "Enter Email"

        } else if (!CommonUtils.isValidEmail(email.toString())) {
            return "Enter Valid Email"

        } else {
           // return "emailIsErrorEnabled"
        }

        if (password!!.isEmpty()) {
            return "Enter Passsword"
        } else if (password!!.length < Config.MIN_PASSWORD_LENGTH) {
            return "Enter minimum 6 words"
        } else {
            //return "passwordIsErrorEnabled"
        }
        return "Login SucessFull"
    }
}