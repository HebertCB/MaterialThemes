package com.example.myproject

import android.app.Activity
import android.content.Intent

object Utils {
    private var sTheme: Int = 0
    val THEME_1 = 1
    val THEME_2 = 2
    val THEME_3 = 3
    val THEME_4 = 4
    val THEME_5 = 5
    val THEME_6 = 6
    val THEME_7 = 7
    val THEME_8 = 8
    val THEME_9 = 9
    val THEME_10 = 10
    /**
     * Set the theme of the Activity, and restart it by creating a new Activity of the same type.
     */
    fun changeToTheme(activity: Activity, theme: Int) {
        sTheme = theme
        activity.finish()
        activity.startActivity(Intent(activity, activity.javaClass))
    }

    /** Set the theme of the activity, according to the configuration.  */
    fun onActivityCreateSetTheme(activity: Activity) {
        when (sTheme) {
            THEME_1 -> activity.setTheme(R.style.AppTheme_MaterialBGRed)
            THEME_2 -> activity.setTheme(R.style.AppTheme_MaterialBGPurple)
            THEME_3 -> activity.setTheme(R.style.AppTheme_MaterialBGIndigo)
            THEME_4 -> activity.setTheme(R.style.AppTheme_MaterialBGBlue)
            THEME_5 -> activity.setTheme(R.style.AppTheme_MaterialBGCyan)
            THEME_6 -> activity.setTheme(R.style.AppTheme_MaterialBGGreen)
            THEME_7 -> activity.setTheme(R.style.AppTheme_MaterialBGLime)
            THEME_8 -> activity.setTheme(R.style.AppTheme_MaterialBGAmber)
            THEME_9 -> activity.setTheme(R.style.AppTheme_MaterialBGBluegrey)
            THEME_10 -> activity.setTheme(R.style.AppTheme_MaterialBGDark)
        }
    }
}