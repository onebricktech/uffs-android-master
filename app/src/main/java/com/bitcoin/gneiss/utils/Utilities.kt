package com.bitcoin.gneiss.utils

import android.content.Context
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.view.animation.AnimationUtils.loadAnimation
import com.bitcoin.gneiss.R


class Utilities{

    companion object {

        fun SlideUpAnimation(context: Context):Animation{

            val slide_up = AnimationUtils.loadAnimation(context,
                    R.anim.slide_up)

            return slide_up
        }

        fun SlideDownAnimation(context: Context):Animation{

            val slide_up = AnimationUtils.loadAnimation(context,
                    R.anim.silde_down)

            return slide_up
        }

        fun SlideInAnimation(context: Context):Animation{

            val slide_up = AnimationUtils.loadAnimation(context,
                    R.anim.slide_in)

            return slide_up
        }

        fun SlideOutAnimation(context: Context):Animation{

            val slide_up = AnimationUtils.loadAnimation(context,
                    R.anim.slide_out)

            return slide_up
        }
    }
}