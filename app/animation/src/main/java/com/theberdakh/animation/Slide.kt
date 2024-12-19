package com.theberdakh.animation

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.view.View
import android.view.ViewGroup

object Slide {



    fun View.animateSlideInDown(): AnimatorSet {
        return AnimatorSet().apply {
            val distance = (top + height).toFloat()
            val fadeIn = ObjectAnimator.ofFloat(this@animateSlideInDown, "alpha", 0f, 1f)
            val slideUp = ObjectAnimator.ofFloat(this@animateSlideInDown, "translationY", -distance, 0f)
            playTogether(fadeIn, slideUp)
        }
    }

    fun View.animateSlideInLeft(): AnimatorSet {
        return AnimatorSet().apply {
            val parent = parent as ViewGroup
            val distance = (parent.width - left).toFloat()
            val fadeIn = ObjectAnimator.ofFloat(this@animateSlideInLeft, "alpha", 0f, 1f)
            val slideRight = ObjectAnimator.ofFloat(this@animateSlideInLeft, "translationX", -distance, 0f)
            playTogether(fadeIn, slideRight)
        }
    }

    fun View.animateSlideInRight(): AnimatorSet {
        return AnimatorSet().apply {
            val parent = parent as ViewGroup
            val distance = (parent.width - left).toFloat()
            val fadeIn = ObjectAnimator.ofFloat(this@animateSlideInRight, "alpha", 0f, 1f)
            val slideLeft = ObjectAnimator.ofFloat(this@animateSlideInRight, "translationX", distance, 0f)
            playTogether(fadeIn, slideLeft)
        }
    }

    fun View.animateSlideInUp(): AnimatorSet {
        return AnimatorSet().apply {
            val parent = parent as ViewGroup
            val distance = (parent.height - top).toFloat()
            val fadeIn = ObjectAnimator.ofFloat(this@animateSlideInUp, "alpha", 0f, 1f)
            val slideDown = ObjectAnimator.ofFloat(this@animateSlideInUp, "translationY", distance, 0f)
            playTogether(fadeIn, slideDown)
        }
    }

    fun View.animateSlideOutDown(): AnimatorSet {
        return AnimatorSet().apply {
            val parent = parent as ViewGroup
            val distance = (parent.height - top).toFloat()
            val fadeOut = ObjectAnimator.ofFloat(this@animateSlideOutDown, "alpha", 1f, 0f)
            val slideDown = ObjectAnimator.ofFloat(this@animateSlideOutDown, "translationY", 0f, distance)
            playTogether(fadeOut, slideDown)
        }
    }

    fun View.animateSlideOutLeft(): AnimatorSet {
        return AnimatorSet().apply {
            val right = right.toFloat()
            val fadeOut = ObjectAnimator.ofFloat(this@animateSlideOutLeft, "alpha", 1f, 0f)
            val slideLeft = ObjectAnimator.ofFloat(this@animateSlideOutLeft, "translationX", 0f, -right)
            playTogether(fadeOut, slideLeft)
        }
    }

    fun View.animateSlideOutRight(): AnimatorSet {
        return AnimatorSet().apply {
            val parent = parent as ViewGroup
            val distance = (parent.width - left).toFloat()
            val fadeOut = ObjectAnimator.ofFloat(this@animateSlideOutRight, "alpha", 1f, 0f)
            val slideRight = ObjectAnimator.ofFloat(this@animateSlideOutRight, "translationX", 0f, distance)
            playTogether(fadeOut, slideRight)
        }
    }

    fun View.animateSlideOutUp(): AnimatorSet {
        return AnimatorSet().apply {
            val bottom = -bottom.toFloat()
            val fadeOut = ObjectAnimator.ofFloat(this@animateSlideOutUp, "alpha", 1f, 0f)
            val slideUp = ObjectAnimator.ofFloat(this@animateSlideOutUp, "translationY", 0f, bottom)
            playTogether(fadeOut, slideUp)
        }
    }
}