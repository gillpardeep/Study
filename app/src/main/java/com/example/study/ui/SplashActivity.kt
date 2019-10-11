package com.example.study.ui

import android.content.Intent
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.view.animation.LinearInterpolator
import com.example.study.base.BaseActivity
import com.example.study.R
import com.example.study.data.constants.Config.DELAY_SPLASH
import kotlinx.android.synthetic.main.activity_splash.*
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch


/**
 * @author Pardeep Singh
 * @since 11/10/19
 * <h1>SplashActivity</h1>
 *  <p>Description of class</p>
 */
class SplashActivity : BaseActivity() {

    override fun getLayout() = R.layout.activity_splash

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setAnimation()
        GlobalScope.launch {
            delay(DELAY_SPLASH)
            startActivity(Intent(applicationContext, LoginActivity::class.java))
        }
    }

    private fun setAnimation() {
        val animation = AnimationUtils.loadAnimation(applicationContext, R.anim.blink)
        animation.interpolator = LinearInterpolator()
        animation.repeatCount = Animation.INFINITE
        animation.duration = 700
        img_splash.startAnimation(animation)
    }
}