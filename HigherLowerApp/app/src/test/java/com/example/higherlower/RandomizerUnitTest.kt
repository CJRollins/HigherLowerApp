package com.example.higherlower

import com.example.higherlower.Randomizer.Randomizer
import org.junit.Test


import org.junit.Assert.*
import org.junit.Before

/**
 * Local Unit Test to ensure Randomizer functionality is behaving as expected.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class RandomizerUnitTest {

    @Before
    fun setUp(){
    }

    @Test
    fun assert_Randomizer_functionality() {
        val randomizer = Randomizer()
        val expected = randomizer.choiceNumber
        randomizer.decideRandom()
        assertNotEquals(expected, randomizer.choiceNumber)
    }
}