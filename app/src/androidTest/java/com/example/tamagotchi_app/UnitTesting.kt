package com.example.tamagotchi_app

import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith


@RunWith(AndroidJUnit4::class)
class UnitTesting {

    @Before
    fun setUp() {
        // Start the MainActivity2 before each test
        ActivityScenario.launch(MainActivity2::class.java)
    }

    @Test
    fun feedButton_click_progressIncreases() {
        onView(withId(R.id.feedBtn)).perform(click())
        // Check if hunger progress bar increments by 10
        onView(withId(R.id.hungerPB)).check(matches(withProgress(10)))
    }

    @Test
    fun cleanButton_click_progressIncreases() {
        onView(withId(R.id.CleanBtn)).perform(click())
        // Check if clean progress bar increments by 10
        onView(withId(R.id.cleanPB)).check(matches(withProgress(10)))
    }

    @Test
    fun playButton_click_progressIncreases() {
        onView(withId(R.id.PlayBtn)).perform(click())
        // Check if happy progress bar increments by 10
        onView(withId(R.id.happyPB)).check(matches(withProgress(10)))
    }

    @Test
    fun feedButton_click_maxProgress_showToast() {
        // Click the feed button multiple times to reach max progress
        repeat(10) {
            onView(withId(R.id.feedBtn)).perform(click())
        }
        // Check if a toast message is displayed when max progress is reached
        onView(withText("Noodle can't eat any more!")).inRoot(TODO())
            .check(matches(isDisplayed()))
    }

    // Similar tests can be written for CleanBtn and PlayBtn when max progress is reached
}
