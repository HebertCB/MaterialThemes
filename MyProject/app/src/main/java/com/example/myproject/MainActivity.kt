package com.example.myproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Utils.onActivityCreateSetTheme(this)
        setContentView(R.layout.activity_main)

        val radioGroup = findViewById<View>(R.id.bgrupo) as RadioGroup

        radioGroup.setOnCheckedChangeListener(
            RadioGroup.OnCheckedChangeListener{ group, checkedId ->
                val radio: RadioButton = findViewById(checkedId)
                when(checkedId){
                    R.id.btema1 -> Utils.changeToTheme(this, Utils.THEME_1)
                    R.id.btema2 -> Utils.changeToTheme(this, Utils.THEME_2)
                    R.id.btema3 -> Utils.changeToTheme(this, Utils.THEME_3)
                    R.id.btema4 -> Utils.changeToTheme(this, Utils.THEME_4)
                    R.id.btema5 -> Utils.changeToTheme(this, Utils.THEME_5)
                    R.id.btema6 -> Utils.changeToTheme(this, Utils.THEME_6)
                    R.id.btema7 -> Utils.changeToTheme(this, Utils.THEME_7)
                    R.id.btema8 -> Utils.changeToTheme(this, Utils.THEME_8)
                    R.id.btema9 -> Utils.changeToTheme(this, Utils.THEME_9)
                    R.id.btema10 -> Utils.changeToTheme(this, Utils.THEME_10)
                }
                Toast.makeText(applicationContext," On checked change : ${radio.text}",
                    Toast.LENGTH_SHORT).show()
            })
    }
}
