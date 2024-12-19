package com.theberdakh.animation

import android.animation.AnimatorSet
import android.view.View
import com.theberdakh.animation.Attention.animateBounce
import com.theberdakh.animation.Attention.animateFlash
import com.theberdakh.animation.Attention.animatePulse
import com.theberdakh.animation.Attention.animateRuberband
import com.theberdakh.animation.Attention.animateShake
import com.theberdakh.animation.Attention.animateStandup
import com.theberdakh.animation.Attention.animateSwing
import com.theberdakh.animation.Attention.animateTada
import com.theberdakh.animation.Attention.animateWave
import com.theberdakh.animation.Attention.animateWobble
import com.theberdakh.animation.Bounce.animateBounceIn
import com.theberdakh.animation.Bounce.animateBounceInDown
import com.theberdakh.animation.Bounce.animateBounceInLeft
import com.theberdakh.animation.Bounce.animateBounceInRight
import com.theberdakh.animation.Bounce.animateBounceInUp
import com.theberdakh.animation.Fade.animateFadeIn
import com.theberdakh.animation.Fade.animateFadeInLeft
import com.theberdakh.animation.Fade.animateFadeInRight
import com.theberdakh.animation.Fade.animateFadeInUp
import com.theberdakh.animation.Fade.fadeInDown
import com.theberdakh.animation.Flip.animateFlipInX
import com.theberdakh.animation.Flip.animateFlipInY
import com.theberdakh.animation.Flip.animateFlipOutX
import com.theberdakh.animation.Flip.animateFlipOutY
import com.theberdakh.animation.Slide.animateSlideInDown
import com.theberdakh.animation.Slide.animateSlideInLeft
import com.theberdakh.animation.Slide.animateSlideInRight
import com.theberdakh.animation.Slide.animateSlideInUp
import com.theberdakh.animation.Slide.animateSlideOutDown
import com.theberdakh.animation.Slide.animateSlideOutLeft
import com.theberdakh.animation.Slide.animateSlideOutRight
import com.theberdakh.animation.Slide.animateSlideOutUp
import com.theberdakh.animation.Zoom.animateZoomIn
import com.theberdakh.animation.Zoom.animateZoomInDown
import com.theberdakh.animation.Zoom.animateZoomInLeft
import com.theberdakh.animation.Zoom.animateZoomInRight
import com.theberdakh.animation.Zoom.animateZoomInUp
import com.theberdakh.animation.Zoom.animateZoomOut
import com.theberdakh.animation.Zoom.animateZoomOutDown
import com.theberdakh.animation.Zoom.animateZoomOutLeft
import com.theberdakh.animation.Zoom.animateZoomOutRight
import com.theberdakh.animation.Zoom.animateZoomOutUp

data class AnimationItem(
    val name: String,
    val animation: (View)-> AnimatorSet
)

object AnimationRepository {

    fun getAllAnimationItems() = getAttentionAnimationItems() +
            getBounceAnimationItems() +
            getFadeAnimationItems() +
            getFlipAnimationItems() +
            getSlideAnimationItems() +
            getZoomAnimationItems()

    fun getAttentionAnimationItems(): List<AnimationItem>{
        return listOf(
            AnimationItem("Bounce") { it.animateBounce() },
            AnimationItem("Flash") { it.animateFlash() },
            AnimationItem("Pulse") { it.animatePulse() },
            AnimationItem("Ruberband") { it.animateRuberband() },
            AnimationItem("Shake") { it.animateShake() },
            AnimationItem("Stand up"){it.animateStandup()},
            AnimationItem("Swing") { it.animateSwing() },
            AnimationItem("Tada") { it.animateTada() },
            AnimationItem("Wave") { it.animateWave() },
            AnimationItem("Wobble") { it.animateWobble() },

        )
    }
    fun getBounceAnimationItems(): List<AnimationItem>{
        return listOf(
            AnimationItem("Bounce") { it.animateBounce() },
            AnimationItem("Bounce In") { it.animateBounceIn() },
            AnimationItem("Bounce In Left") { it.animateBounceInLeft() },
            AnimationItem("Bounce In Right") { it.animateBounceInRight() },
            AnimationItem("Bounce In Up") { it.animateBounceInUp() },
            AnimationItem("Bounce In Down") { it.animateBounceInDown() }
        )
    }

    fun getFadeAnimationItems(): List<AnimationItem>{
        return listOf(
            AnimationItem("Fade In") { it.animateFadeIn() },
            AnimationItem("Fade In Left") { it.animateFadeInLeft() },
            AnimationItem("Fade In Right") { it.animateFadeInRight() },
            AnimationItem("Fade In Up") { it.animateFadeInUp() },
            AnimationItem("Fade In Down") { it.fadeInDown() }
        )
    }

    fun getFlipAnimationItems(): List<AnimationItem>{
        return listOf(
            AnimationItem("Flip In X") { it.animateFlipInX() },
            AnimationItem("Flip In Y") { it.animateFlipInY() },
            AnimationItem("Flip Out X") { it.animateFlipOutX() },
            AnimationItem("Flip Out Y") { it.animateFlipOutY() }
        )
    }

    fun getSlideAnimationItems(): List<AnimationItem>{
        return listOf(
            AnimationItem("Slide In Left") { it.animateSlideInLeft() },
            AnimationItem("Slide In Right") { it.animateSlideInRight() },
            AnimationItem("Slide In Up") { it.animateSlideInUp() },
            AnimationItem("Slide In Down") { it.animateSlideInDown() },
            AnimationItem("Slide Out Down") { it.animateSlideOutDown() },
            AnimationItem("Slide Out Left") { it.animateSlideOutLeft() },
            AnimationItem("Slide Out Right") { it.animateSlideOutRight() },
            AnimationItem("Slide Out Up") { it.animateSlideOutUp() }
        )
    }

    fun getZoomAnimationItems(): List<AnimationItem>{
        return listOf(
            AnimationItem("Zoom In") { it.animateZoomIn() },
            AnimationItem("Zoom In Down") { it.animateZoomInDown() },
            AnimationItem("Zoom In Left") { it.animateZoomInLeft() },
            AnimationItem("Zoom In Right") { it.animateZoomInRight() },
            AnimationItem("Zoom In Up") { it.animateZoomInUp() },
            AnimationItem("Zoom Out") { it.animateZoomOut() },
            AnimationItem("Zoom Out Down") { it.animateZoomOutDown() },
            AnimationItem("Zoom Out Left") { it.animateZoomOutLeft() },
            AnimationItem("Zoom Out Right") { it.animateZoomOutRight() },
            AnimationItem("Zoom Out Up") { it.animateZoomOutUp() }
        )
    }
}