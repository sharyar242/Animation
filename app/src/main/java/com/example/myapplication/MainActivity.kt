package com.example.myapplication

import android.animation.Animator
import android.animation.AnimatorInflater
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val animation: Animation = AnimationUtils.loadAnimation(this, R.anim.translate)
        image.startAnimation(animation)
        animation.repeatCount = 1000

        val animator: Animator = AnimatorInflater.loadAnimator(this,R.animator.animator)
        animator.setTarget(image)


        startstop.setOnClickListener {
            animator.pause()
        }

    }
}