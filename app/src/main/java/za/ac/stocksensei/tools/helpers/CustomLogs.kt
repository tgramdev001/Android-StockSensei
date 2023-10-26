package za.ac.stocksensei.tools.helpers

import android.util.Log

class CustomLogs {
    companion object {
        fun log(title: String, localizedMessage: String) {
            Log.v("CustomLogs: $title", localizedMessage)
        }
    }

}
