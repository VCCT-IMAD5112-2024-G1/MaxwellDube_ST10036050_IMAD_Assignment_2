package com.example.tamagotchi_app

import android.view.View
import android.widget.ProgressBar
import androidx.test.espresso.matcher.BoundedMatcher
import org.hamcrest.Description
import org.hamcrest.Matcher

fun withProgress(expectedProgress: Int): Matcher<View> {
    return object : BoundedMatcher<View, ProgressBar>(ProgressBar::class.java) {
        override fun describeTo(description: Description?) {
            description?.appendText("with progress: $expectedProgress")
        }

        override fun matchesSafely(progressBar: ProgressBar?): Boolean {
            return progressBar?.progress == expectedProgress
        }
    }
}
