package com.theberdakh.animation

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.view.View

object Flip {
    fun View.animateFlipInX(): AnimatorSet {
        val animatorSet = AnimatorSet()

        val object1: ObjectAnimator = ObjectAnimator.ofFloat(this, "rotationX", -90f, 20f, -10f, 5f, 0f)
        val object2: ObjectAnimator = ObjectAnimator.ofFloat(this, "alpha", 0f, 1f, 1f, 1f, 1f)

        animatorSet.playTogether(object1, object2)
        return animatorSet
    }

    fun View.animateFlipInY(): AnimatorSet {
        val animatorSet = AnimatorSet()

        val object1: ObjectAnimator = ObjectAnimator.ofFloat(this, "rotationY", -90f, 20f, -10f, 5f, 0f)
        val object2: ObjectAnimator = ObjectAnimator.ofFloat(this, "alpha", 0f, 1f, 1f, 1f, 1f)

        animatorSet.playTogether(object1, object2)
        return animatorSet
    }

    fun View.animateFlipOutX(): AnimatorSet {
        val animatorSet = AnimatorSet()

        val object1: ObjectAnimator = ObjectAnimator.ofFloat(this, "rotationX", 0f, 90f)
        val object2: ObjectAnimator = ObjectAnimator.ofFloat(this, "alpha", 1f, 0f)

        animatorSet.playTogether(object1, object2)
        return animatorSet
    }

    fun View.animateFlipOutY(): AnimatorSet {
        val animatorSet = AnimatorSet()

        val object1: ObjectAnimator = ObjectAnimator.ofFloat(this, "rotationY", 0f, 90f)
        val object2: ObjectAnimator = ObjectAnimator.ofFloat(this, "alpha", 1f, 0f)

        animatorSet.playTogether(object1, object2)
        return animatorSet
    }
}