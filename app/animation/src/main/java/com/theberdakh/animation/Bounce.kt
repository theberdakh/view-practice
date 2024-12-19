package com.theberdakh.animation

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.view.View

object Bounce {

    fun View.animateBounceIn(): AnimatorSet {
        val animatorSet = AnimatorSet()

        val object1: ObjectAnimator = ObjectAnimator.ofFloat(this, "alpha", 0f, 1f, 1f, 1f)
        val object2: ObjectAnimator = ObjectAnimator.ofFloat(this, "scaleX", 0.3f, 1.05f, 0.9f, 1f)
        val object3: ObjectAnimator = ObjectAnimator.ofFloat(this, "scaleY", 0.3f, 1.05f, 0.9f, 1f)

        animatorSet.playTogether(object1, object2, object3)
        return animatorSet
    }

    fun View.animateBounceInLeft(): AnimatorSet {
        val animatorSet = AnimatorSet()
        val width = -this.width.toFloat()

        val object1: ObjectAnimator = ObjectAnimator.ofFloat(this, "translationX", width, 30f, -10f, 0f)
        val object2: ObjectAnimator = ObjectAnimator.ofFloat(this, "alpha", 0f, 1f, 1f, 1f)

        animatorSet.playTogether(object1, object2)
        return animatorSet
    }

    fun View.animateBounceInRight(): AnimatorSet {
        val animatorSet = AnimatorSet()
        val width = -this.width.toFloat()
        val measuredWidth = -this.measuredWidth.toFloat()

        val object1: ObjectAnimator = ObjectAnimator.ofFloat(this, "translationX", measuredWidth + width, -30f, 10f, 0f)
        val object2: ObjectAnimator = ObjectAnimator.ofFloat(this, "alpha", 0f, 1f, 1f, 1f)

        animatorSet.playTogether(object1, object2)
        return animatorSet
    }

    fun View.animateBounceInUp(): AnimatorSet {
        val animatorSet = AnimatorSet()
        val measuredHeight = this.measuredHeight.toFloat()

        val object1: ObjectAnimator = ObjectAnimator.ofFloat(this, "translationY", measuredHeight, -30f, 10f, 0f)
        val object2: ObjectAnimator = ObjectAnimator.ofFloat(this, "alpha", 0f, 1f, 1f, 1f)

        animatorSet.playTogether(object1, object2)
        return animatorSet
    }

    fun View.animateBounceInDown(): AnimatorSet {
        val animatorSet = AnimatorSet()
        val height = -this.height.toFloat()

        val object1: ObjectAnimator = ObjectAnimator.ofFloat(this, "alpha", 0f, 1f, 1f, 1f)
        val object2: ObjectAnimator = ObjectAnimator.ofFloat(this, "translationY", height, 30f, -10f, 0f)

        animatorSet.playTogether(object1, object2)
        return animatorSet
    }

}