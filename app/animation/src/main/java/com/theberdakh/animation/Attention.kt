package com.theberdakh.animation

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.view.View


object Attention {
    fun View.animateBounce(): AnimatorSet {
        val animatorSet = AnimatorSet()

        val object1: ObjectAnimator =
            ObjectAnimator.ofFloat(this, "translationY", 0f, 0f, -30f, 0f, -15f, 0f, 0f)

        animatorSet.playTogether(object1)
        return animatorSet
    }

    fun View.animateFlash(): AnimatorSet {
        val animatorSet = AnimatorSet()

        val object1: ObjectAnimator = ObjectAnimator.ofFloat(this, "alpha", 1f, 0f, 1f, 0f, 1f)

        animatorSet.playTogether(object1)
        return animatorSet
    }

    fun View.animatePulse(): AnimatorSet {
        val animatorSet = AnimatorSet()

        val object1: ObjectAnimator = ObjectAnimator.ofFloat(this, "scaleY", 1f, 1.1f, 1f)
        val object2: ObjectAnimator = ObjectAnimator.ofFloat(this, "scaleX", 1f, 1.1f, 1f)

        animatorSet.playTogether(object1, object2)
        return animatorSet
    }

    fun View.animateRuberband(): AnimatorSet {
        val animatorSet = AnimatorSet()

        val object1: ObjectAnimator =
            ObjectAnimator.ofFloat(this, "scaleX", 1f, 1.25f, 0.75f, 1.15f, 1f)
        val object2: ObjectAnimator =
            ObjectAnimator.ofFloat(this, "scaleY", 1f, 0.75f, 1.25f, 0.85f, 1f)

        animatorSet.playTogether(object1, object2)
        return animatorSet
    }

    fun View.animateShake(): AnimatorSet {
        val animatorSet = AnimatorSet()

        val object1: ObjectAnimator =
            ObjectAnimator.ofFloat(this, "scaleX", 1f, 1.25f, 0.75f, 1.15f, 1f)
        val object2: ObjectAnimator =
            ObjectAnimator.ofFloat(this, "scaleY", 1f, 0.75f, 1.25f, 0.85f, 1f)

        animatorSet.playTogether(object1, object2)
        return animatorSet
    }

    fun View.animateStandup(): AnimatorSet {
        val animatorSet = AnimatorSet()
        val x =
            ((this.width - this.paddingLeft - this.paddingRight) / 2 + this.paddingLeft).toFloat()
        val y = (this.height - this.paddingBottom).toFloat()

        val object1: ObjectAnimator = ObjectAnimator.ofFloat(this, "pivotX", x, x, x, x, x)
        val object2: ObjectAnimator = ObjectAnimator.ofFloat(this, "pivotY", y, y, y, y, y)
        val object3: ObjectAnimator =
            ObjectAnimator.ofFloat(this, "rotationX", 55f, -30f, 15f, -15f, 0f)

        animatorSet.playTogether(object1, object2, object3)
        return animatorSet
    }

    fun View.animateSwing(): AnimatorSet {
        val animatorSet = AnimatorSet()

        val object1: ObjectAnimator =
            ObjectAnimator.ofFloat(this, "rotation", 0f, 10f, -10f, 6f, -6f, 3f, -3f, 0f)

        animatorSet.playTogether(object1)
        return animatorSet
    }

    fun View.animateTada(): AnimatorSet {
        val animatorSet = AnimatorSet()

        val object1: ObjectAnimator = ObjectAnimator.ofFloat(
            this,
            "scaleX",
            1f,
            0.9f,
            0.9f,
            1.1f,
            1.1f,
            1.1f,
            1.1f,
            1.1f,
            1.1f,
            1f
        )
        val object2: ObjectAnimator = ObjectAnimator.ofFloat(
            this,
            "scaleY",
            1f,
            0.9f,
            0.9f,
            1.1f,
            1.1f,
            1.1f,
            1.1f,
            1.1f,
            1.1f,
            1f
        )
        val object3: ObjectAnimator =
            ObjectAnimator.ofFloat(this, "rotation", 0f, -3f, -3f, 3f, -3f, 3f, -3f, 3f, -3f, 0f)

        animatorSet.playTogether(object1, object2, object3)
        return animatorSet
    }

    fun View.animateWave(): AnimatorSet {
        val animatorSet = AnimatorSet()
        val x =
            ((this.width - this.paddingLeft - this.paddingRight) / 2 + this.paddingLeft).toFloat()
        val y = (this.height - this.paddingBottom).toFloat()

        val object1: ObjectAnimator =
            ObjectAnimator.ofFloat(this, "rotation", 12f, -12f, 3f, -3f, 0f)
        val object2: ObjectAnimator = ObjectAnimator.ofFloat(this, "pivotX", x, x, x, x, x)
        val object3: ObjectAnimator = ObjectAnimator.ofFloat(this, "pivotY", y, y, y, y, y)

        animatorSet.playTogether(object1, object2, object3)
        return animatorSet
    }

    fun View.animateWobble(): AnimatorSet {
        val animatorSet = AnimatorSet()
        val width = (this.width).toFloat()
        val one = (width / 100.0).toFloat()

        val object1: ObjectAnimator = ObjectAnimator.ofFloat(
            this,
            "translationX",
            0f * one,
            -25f * one,
            20f * one,
            -15f * one,
            10f * one,
            -5f * one,
            0f * one,
            0f
        )
        val object2: ObjectAnimator =
            ObjectAnimator.ofFloat(this, "rotation", 0f, -5f, 3f, -3f, 2f, -1f, 0f)

        animatorSet.playTogether(object1, object2)
        return animatorSet
    }
}