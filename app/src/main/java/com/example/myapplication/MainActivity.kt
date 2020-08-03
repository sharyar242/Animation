package com.example.myapplication

import android.animation.Animator
import android.animation.AnimatorInflater
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val animation: Animation = AnimationUtils.loadAnimation(this, R.anim.translate)
        image.startAnimation(animation)

        val animator: Animator = AnimatorInflater.loadAnimator(this,R.animator.animator)
        animator.setTarget(image)
        animator.start()



        startstop.setOnClickListener {
            if (animator.isPaused) {
                animator.resume()
                startstop.text = "pause"
            }else{
            animator.pause()
                startstop.text = "resume"
            }
        }
    }
}