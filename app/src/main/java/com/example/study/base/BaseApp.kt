package com.example.study.base

import android.app.Application
import android.util.Log
import com.example.study.BuildConfig
import com.example.study.utils.FakeCrashLibrary
import timber.log.Timber

/**
 * @author Pardeep Singh
 * @since 11/10/19
 * <h1>BaseApp</h1>
 *  <p>Description of class</p>
 */
class BaseApp : Application() {


    companion object {

        private lateinit var INSTANCE: BaseApp

        fun getContext(): BaseApp {
            return this.INSTANCE
        }
    }

    override fun onCreate() {
        super.onCreate()
        INSTANCE = this
        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        } else {
            Timber.plant(CrashReportingTree())
        }
    }

    /** A tree which logs important information for crash reporting.  */
    private class CrashReportingTree : Timber.Tree() {
        override fun log(priority: Int, tag: String?, message: String, t: Throwable?) {
            if (priority == Log.VERBOSE || priority == Log.DEBUG) {
                return
            }

            if (tag != null) {
                FakeCrashLibrary.log(priority, tag, message)
            }

            if (t != null) {
                if (priority == Log.ERROR) {
                    FakeCrashLibrary.logError(t)
                } else if (priority == Log.WARN) {
                    FakeCrashLibrary.logWarning(t)
                }
            }
        }
    }
}