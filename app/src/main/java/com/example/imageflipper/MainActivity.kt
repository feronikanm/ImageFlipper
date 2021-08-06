package com.example.imageflipper

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.TextView
import android.widget.ViewFlipper

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewFlipper = findViewById<ViewFlipper>(R.id.viewFlipper)

        title = "KotlinApp"
        val textView = TextView(this)
        textView.text = "Have a great day"
        textView.textSize = 24F
        textView.textColors.defaultColor
        textView.gravity = Gravity.CENTER
        viewFlipper.addView(textView)
        viewFlipper.flipInterval = 2000
        viewFlipper.startFlipping()
    }

    fun previousView(view: View) {
        val viewFlipper = findViewById<ViewFlipper>(R.id.viewFlipper)

        viewFlipper.setInAnimation(this, R.anim.slide_in_left)
        viewFlipper.setOutAnimation(this, R.anim.slide_out_right)
        viewFlipper.showPrevious();
    }

    fun nextView(view: View) {
        val viewFlipper = findViewById<ViewFlipper>(R.id.viewFlipper)

        viewFlipper.setInAnimation(this, android.R.anim.slide_in_left)
        viewFlipper.setOutAnimation(
            this,
            android.R.anim.slide_out_right
        )
        viewFlipper.showNext()
    }
}