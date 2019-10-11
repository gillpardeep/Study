package com.example.study.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.study.R
import kotlinx.android.synthetic.main.activity_base.*

/**
 * @author Pardeep Singh
 * @since 11/10/19
 * <h1>BaseActivity</h1>
 *  <p>Description of class</p>
 */
abstract class BaseActivity : AppCompatActivity() {


    abstract fun getLayout(): Int

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_base)
        base_container.addView(LayoutInflater.from(this).inflate(getLayout(), null, false), 0)
        hideLoading()
    }

    fun showLoading() {
        progressBar.visibility = View.VISIBLE
    }


    fun hideLoading() {
        progressBar.visibility = View.GONE
    }

    fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show()
    }

    fun showToast(message: Int) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show()
    }
}