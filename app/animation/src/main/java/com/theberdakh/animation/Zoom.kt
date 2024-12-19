package com.theberdakh.animation

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.view.View
import android.view.ViewGroup

object Zoom {

    fun View.animateZoomIn(): AnimatorSet {
        return AnimatorSet().apply {
            playTogether(
                ObjectAnimator.ofFloat(this@animateZoomIn, "scaleX", 0.45f, 1f),
                ObjectAnimator.ofFloat(this@animateZoomIn, "scaleY", 0.45f, 1f),
                ObjectAnimator.ofFloat(this@animateZoomIn, "alpha", 0f, 1f)
            )
        }
    }

    fun View.animateZoomInDown(): AnimatorSet {
        return AnimatorSet().apply {
            val bottom = -this@animateZoomInDown.bottom.toFloat()

            playTogether(
                ObjectAnimator.ofFloat(this@animateZoomInDown, "scaleX", 0.1f, 0.475f, 1f),
                ObjectAnimator.ofFloat(this@animateZoomInDown, "scaleY", 0.1f, 0.475f, 1f),
                ObjectAnimator.ofFloat(this@animateZoomInDown, "translationY", bottom, 60f, 0f),
                ObjectAnimator.ofFloat(this@animateZoomInDown, "alpha", 0f, 1f, 1f)
            )
        }
    }

    fun View.animateZoomInLeft(): AnimatorSet {
        return AnimatorSet().apply {
            val right = -this@animateZoomInLeft.right.toFloat()

            playTogether(
                ObjectAnimator.ofFloat(this@animateZoomInLeft, "scaleX", 0.1f, 0.475f, 1f),
                ObjectAnimator.ofFloat(this@animateZoomInLeft, "scaleY", 0.1f, 0.475f, 1f),
                ObjectAnimator.ofFloat(this@animateZoomInLeft, "translationX", right, 48f, 0f),
                ObjectAnimator.ofFloat(this@animateZoomInLeft, "alpha", 0f, 1f, 1f)
            )
        }
    }

    fun View.animateZoomInRight(): AnimatorSet {
        return AnimatorSet().apply {
            val width = -this@animateZoomInRight.width.toFloat()
            val right = -this@animateZoomInRight.paddingRight.toFloat()

            playTogether(
                ObjectAnimator.ofFloat(this@animateZoomInRight, "scaleX", 0.1f, 0.475f, 1f),
                ObjectAnimator.ofFloat(this@animateZoomInRight, "scaleY", 0.1f, 0.475f, 1f),
                ObjectAnimator.ofFloat(this@animateZoomInRight, "translationX", width + right, -48f, 0f),
                ObjectAnimator.ofFloat(this@animateZoomInRight, "alpha", 0f, 1f, 1f)
            )
        }
    }

    fun View.animateZoomInUp(): AnimatorSet {
        return AnimatorSet().apply {
            val parent = this@animateZoomInUp.parent as ViewGroup
            val distance = (parent.height - this@animateZoomInUp.top).toFloat()

            playTogether(
                ObjectAnimator.ofFloat(this@animateZoomInUp, "alpha", 0f, 1f, 1f),
                ObjectAnimator.ofFloat(this@animateZoomInUp, "scaleX", 0.1f, 0.475f, 1f),
                ObjectAnimator.ofFloat(this@animateZoomInUp, "scaleY", 0.1f, 0.475f, 1f),
                ObjectAnimator.ofFloat(this@animateZoomInUp, "translationY", distance, -60f, 0f)
            )
        }
    }

    fun View.animateZoomOut(): AnimatorSet {
        return AnimatorSet().apply {
            playTogether(
                ObjectAnimator.ofFloat(this@animateZoomOut, "alpha", 1f, 0f, 0f),
                ObjectAnimator.ofFloat(this@animateZoomOut, "scaleX", 1f, 0.3f, 0f),
                ObjectAnimator.ofFloat(this@animateZoomOut, "scaleY", 1f, 0.3f, 0f)
            )
        }
    }

    fun View.animateZoomOutDown(): AnimatorSet {
        return AnimatorSet().apply {
            val parent = this@animateZoomOutDown.parent as ViewGroup
            val distance = (parent.height - this@animateZoomOutDown.top).toFloat()

            playTogether(
                ObjectAnimator.ofFloat(this@animateZoomOutDown, "alpha", 1f, 1f, 0f),
                ObjectAnimator.ofFloat(this@animateZoomOutDown, "scaleX", 1f, 0.475f, 0.1f),
                ObjectAnimator.ofFloat(this@animateZoomOutDown, "scaleY", 1f, 0.475f, 0.1f),
                ObjectAnimator.ofFloat(this@animateZoomOutDown, "translationY", 0f, -60f, distance)
            )
        }
    }

    fun View.animateZoomOutLeft(): AnimatorSet {
        return AnimatorSet().apply {
            val right = -this@animateZoomOutLeft.right.toFloat()

            playTogether(
                ObjectAnimator.ofFloat(this@animateZoomOutLeft, "alpha", 1f, 1f, 0f),
                ObjectAnimator.ofFloat(this@animateZoomOutLeft, "scaleX", 1f, 0.475f, 0.1f),
                ObjectAnimator.ofFloat(this@animateZoomOutLeft, "scaleY", 1f, 0.475f, 0.1f),
                ObjectAnimator.ofFloat(this@animateZoomOutLeft, "translationX", 0f, 42f, right)
            )
        }
    }

    fun View.animateZoomOutRight(): AnimatorSet {
        return AnimatorSet().apply {
            val parent = this@animateZoomOutRight.parent as ViewGroup
            val distance = (parent.width - parent.left).toFloat()

            playTogether(
                ObjectAnimator.ofFloat(this@animateZoomOutRight, "alpha", 1f, 1f, 0f),
                ObjectAnimator.ofFloat(this@animateZoomOutRight, "scaleX", 1f, 0.475f, 0.1f),
                ObjectAnimator.ofFloat(this@animateZoomOutRight, "scaleY", 1f, 0.475f, 0.1f),
                ObjectAnimator.ofFloat(this@animateZoomOutRight, "translationX", 0f, -42f, distance)
            )
        }
    }

    fun View.animateZoomOutUp(): AnimatorSet {
        return AnimatorSet().apply {
            val bottom = -this@animateZoomOutUp.bottom.toFloat()

            playTogether(
                ObjectAnimator.ofFloat(this@animateZoomOutUp, "alpha", 1f, 1f, 0f),
                ObjectAnimator.ofFloat(this@animateZoomOutUp, "scaleX", 1f, 0.475f, 0.1f),
                ObjectAnimator.ofFloat(this@animateZoomOutUp, "scaleY", 1f, 0.475f, 0.1f),
                ObjectAnimator.ofFloat(this@animateZoomOutUp, "translationY", 0f, 60f, bottom)
            )
        }
    }
}