package com.fanhl.jenkinsdemo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.fanhl.lib.LibUtils
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tv_text.text = AppUtils.gradleText() + "\n" + LibUtils.gradleText()+"\n\n"+AppUtils.productFlavors()
    }

}
