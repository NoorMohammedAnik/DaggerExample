package com.app.daggerexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject lateinit var info1: Info
    @Inject lateinit var info2: Info

    override fun onCreate(savedInstanceState: Bundle?) {
        DaggerAppComponent.builder().build().inject(this)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView.text = info1.getData()
        textView2.text = info2.text
    }
}