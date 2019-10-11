package com.example.study.data.local

import android.content.Context
import android.content.SharedPreferences
import com.example.study.base.BaseApp
import com.example.study.data.constants.Config.PREFS_USER
import com.example.study.data.model.User
import com.google.gson.Gson

/**
 * @author Pardeep Singh
 * @since 11/10/19
 * <h1>PrefManager</h1>
 *  <p>Description of class</p>
 */
object PrefManager {

    private var sharedPreferences =
        BaseApp.getContext().getSharedPreferences(PREFS_USER, Context.MODE_PRIVATE)

    private var gson = Gson()

    fun setUserPref(user: User) {
        val editor: SharedPreferences.Editor = sharedPreferences.edit()
        editor.putString(PREFS_USER, gson.toJson(user))
        editor.apply()
        editor.commit()
    }

    fun updatePref(user: User) {
        val oldUser = getUserPref()
        oldUser!!.email = user.email
        oldUser.password = user.password
        val editor = sharedPreferences.edit()
        editor.putString(PREFS_USER, gson.toJson(oldUser))
        editor.apply()
        editor.commit()
    }

    fun getUserPref(): User? {
        val userInJson = sharedPreferences.getString(PREFS_USER, "")
        return gson.fromJson(userInJson, User::class.java) ?: User()
    }

    fun removePref() {
        sharedPreferences.edit().clear().apply()
    }

    fun isUserAvailable(): Boolean {
        return sharedPreferences.contains(PREFS_USER)
    }
}