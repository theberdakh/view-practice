package com.theberdakh.animation

import android.view.View
import android.animation.AnimatorSet
import android.animation.ObjectAnimator

object Rotate {



    fun View.animateIn(): AnimatorSet {
        return AnimatorSet().apply {
            val fadeIn = ObjectAnimator.ofFloat(this@animateIn, "alpha", 0f, 1f)
            val rotate = ObjectAnimator.ofFloat(this@animateIn, "rotation", -200f, 0f)
            playTogether(fadeIn, rotate)
        }
    }

    fun View.animateInDownLeft(): AnimatorSet {
        return AnimatorSet().apply {
            val x = paddingLeft.toFloat()
            val y = (height - paddingBottom).toFloat()

            val rotate = ObjectAnimator.ofFloat(this@animateInDownLeft, "rotation", -90f, 0f)
            val fadeIn = ObjectAnimator.ofFloat(this@animateInDownLeft, "alpha", 0f, 1f)
            val pivotX = ObjectAnimator.ofFloat(this@animateInDownLeft, "pivotX", x, x)
            val pivotY = ObjectAnimator.ofFloat(this@animateInDownLeft, "pivotY", y, y)

            playTogether(rotate, fadeIn, pivotX, pivotY)
        }
    }

    fun View.animateInDownRight(): AnimatorSet {
        return AnimatorSet().apply {
            val x = (width - paddingRight).toFloat()
            val y = (height - paddingBottom).toFloat()

            val rotate = ObjectAnimator.ofFloat(this@animateInDownRight, "rotation", 90f, 0f)
            val fadeIn = ObjectAnimator.ofFloat(this@animateInDownRight, "alpha", 0f, 1f)
            val pivotX = ObjectAnimator.ofFloat(this@animateInDownRight, "pivotX", x, x)
            val pivotY = ObjectAnimator.ofFloat(this@animateInDownRight, "pivotY", y, y)

            playTogether(rotate, fadeIn, pivotX, pivotY)
        }
    }

    fun View.animateInUpLeft(): AnimatorSet {
        return AnimatorSet().apply {
            val x = paddingLeft.toFloat()
            val y = height - paddingBottom.toFloat()

            val rotate = ObjectAnimator.ofFloat(this@animateInUpLeft, "rotation", 90f, 0f)
            val fadeIn = ObjectAnimator.ofFloat(this@animateInUpLeft, "alpha", 0f, 1f)
            val pivotX = ObjectAnimator.ofFloat(this@animateInUpLeft, "pivotX", x, x)
            val pivotY = ObjectAnimator.ofFloat(this@animateInUpLeft, "pivotY", y, y)

            playTogether(rotate, fadeIn, pivotX, pivotY)
        }
    }

    fun View.animateInUpRight(): AnimatorSet {
        return AnimatorSet().apply {
            val x = (width - paddingRight).toFloat()
            val y = (height - paddingBottom).toFloat()

            val rotate = ObjectAnimator.ofFloat(this@animateInUpRight, "rotation", -90f, 0f)
            val fadeIn = ObjectAnimator.ofFloat(this@animateInUpRight, "alpha", 0f, 1f)
            val pivotX = ObjectAnimator.ofFloat(this@animateInUpRight, "pivotX", x, x)
            val pivotY = ObjectAnimator.ofFloat(this@animateInUpRight, "pivotY", y, y)

            playTogether(rotate, fadeIn, pivotX, pivotY)
        }
    }

    fun View.animateOut(): AnimatorSet {
        return AnimatorSet().apply {
            val fadeOut = ObjectAnimator.ofFloat(this@animateOut, "alpha", 1f, 0f)
            val rotate = ObjectAnimator.ofFloat(this@animateOut, "rotation", 0f, 200f)

            playTogether(fadeOut, rotate)
        }
    }

    fun View.animateOutDownLeft(): AnimatorSet {
        return AnimatorSet().apply {
            val x = paddingLeft.toFloat()
            val y = (height - paddingBottom).toFloat()

            val fadeOut = ObjectAnimator.ofFloat(this@animateOutDownLeft, "alpha", 1f, 0f)
            val rotate = ObjectAnimator.ofFloat(this@animateOutDownLeft, "rotation", 0f, 90f)
            val pivotX = ObjectAnimator.ofFloat(this@animateOutDownLeft, "pivotX", x, x)
            val pivotY = ObjectAnimator.ofFloat(this@animateOutDownLeft, "pivotY", y, y)

            playTogether(fadeOut, rotate, pivotX, pivotY)
        }
    }

    fun View.animateOutDownRight(): AnimatorSet {
        return AnimatorSet().apply {
            val x = (width - paddingRight).toFloat()
            val y = (height - paddingBottom).toFloat()

            val fadeOut = ObjectAnimator.ofFloat(this@animateOutDownRight, "alpha", 1f, 0f)
            val rotate = ObjectAnimator.ofFloat(this@animateOutDownRight, "rotation", 0f, -90f)
            val pivotX = ObjectAnimator.ofFloat(this@animateOutDownRight, "pivotX", x, x)
            val pivotY = ObjectAnimator.ofFloat(this@animateOutDownRight, "pivotY", y, y)

            playTogether(fadeOut, rotate, pivotX, pivotY)
        }
    }

    fun View.animateOutUpLeft(): AnimatorSet {
        return AnimatorSet().apply {
            val x = paddingLeft.toFloat()
            val y = (height - paddingBottom).toFloat()

            val fadeOut = ObjectAnimator.ofFloat(this@animateOutUpLeft, "alpha", 1f, 0f)
            val rotate = ObjectAnimator.ofFloat(this@animateOutUpLeft, "rotation", 0f, -90f)
            val pivotX = ObjectAnimator.ofFloat(this@animateOutUpLeft, "pivotX", x, x)
            val pivotY = ObjectAnimator.ofFloat(this@animateOutUpLeft, "pivotY", y, y)

            playTogether(fadeOut, rotate, pivotX, pivotY)
        }
    }

    fun View.animateOutUpRight(): AnimatorSet {
        return AnimatorSet().apply {
            val x = (width - paddingRight).toFloat()
            val y = (height - paddingBottom).toFloat()

            val fadeOut = ObjectAnimator.ofFloat(this@animateOutUpRight, "alpha", 1f, 0f)
            val rotate = ObjectAnimator.ofFloat(this@animateOutUpRight, "rotation", 0f, 90f)
            val pivotX = ObjectAnimator.ofFloat(this@animateOutUpRight, "pivotX", x, x)
            val pivotY = ObjectAnimator.ofFloat(this@animateOutUpRight, "pivotY", y, y)

            playTogether(fadeOut, rotate, pivotX, pivotY)
        }
    }
}