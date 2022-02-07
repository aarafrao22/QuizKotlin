package com.aaraf.quizzzz

import android.animation.Animator
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.Animation
import kotlinx.android.synthetic.main.activity_question.*

class QuestionActivity : AppCompatActivity() {
    var count:Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question)


        btnNext.setOnClickListener {
            count=0
            playAnim(txtQuestion,0)
        }
    }

    private fun playAnim(view:View,value:Int) {
        view.animate().apply {
            duration = 499
            alpha(value.toFloat())
            scaleX(value.toFloat())
            scaleY(value.toFloat())
            startDelay = 100
            interpolator

        }.setListener(object : Animator.AnimatorListener {
            override fun onAnimationStart(animation: Animator?) {
                if (value ==0 && count<4){
                    playAnim(optionContainer.getChildAt(count),0)
                }
            }
            override fun onAnimationRepeat(animation: Animator?) {}
            override fun onAnimationCancel(animation: Animator?) {}

            override fun onAnimationEnd(animation: Animator?) {
                //DataChange
                if (value==0){
                    playAnim(view,1)
                }

            }
        })
    }
}