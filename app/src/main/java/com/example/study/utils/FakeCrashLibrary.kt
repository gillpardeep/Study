package com.example.study.utils

/**
 * @author Pardeep Singh
 * @since 11/10/19
 * <h1>FakeCrashLibrary</h1>
 *  <p>Description of class</p>
 */
class FakeCrashLibrary private constructor() {

    init {
        throw AssertionError("No instances.")
    }

    companion object {
        fun log(priority: Int, tag: String, message: String) {
            // TODO add log entry to circular buffer.
        }

        fun logWarning(t: Throwable) {
            // TODO report non-fatal warning.
        }

        fun logError(t: Throwable) {
            // TODO report non-fatal error.
        }
    }
}