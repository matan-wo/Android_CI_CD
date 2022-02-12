package com.android.kotlincicd

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun addTestToCheck() {
        assertEquals(5, 2+3)
    }


    @Test
    fun testFotCi() {
        assertEquals(5, 1+4)
    }

    @Test
    fun testFotCi2() {
        var x = 6
        var y = 3+3
        assertEquals(x, y)
    }
}