package com.example.study.data.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

/**
 * @author Pardeep Singh
 * @since 11/10/19
 * <h1>User</h1>
 *  <p>Description of class</p>
 */
@Parcelize
data class User(
    var email: String? = "",
    var password: String? = "",
    var name: String? = "",
    var imageUrl: String? = "",
    var isSelect: Boolean = false

) : Parcelable {
}