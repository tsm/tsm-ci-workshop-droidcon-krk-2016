package com.tomszom.workshop;

import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.Espresso.onView;

/**
 * Created by tsm on 10/12/16
 */

public class MainActivityTest {

    @Rule
    public ActivityTestRule<MainActivity> rule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void shouldDisplayHelloWorld(){
        onView(ViewMatchers.withId(R.id.text_view)).check(ViewAssertions.matches(ViewMatchers.withText("Hello World!")));
    }
}
