package com.example.study.utils

import android.text.TextUtils
import android.widget.ImageView
import com.example.study.data.constants.Config.EMAIL_REGEX
import com.squareup.picasso.Picasso
import java.util.regex.Pattern

/**
 * @author Pardeep Singh
 * @since 11/10/19
 * <h1>CommonUtils</h1>
 *  <p>Description of class</p>
 */
object CommonUtils {


    /**
     * This method is used to check the validation of the email
     * @param email that need to check the validation
     * @return true when email is valid
     */
    fun isValidEmail(email: String): Boolean {
        return !TextUtils.isEmpty(email) && Pattern.matches(EMAIL_REGEX, email)
    }

    fun loadImage(imageView: ImageView, url: String) {
        Picasso.with(imageView.context).load(url).into(imageView);
    }
}