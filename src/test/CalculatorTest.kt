package com.neelkamath.kotlinjsboilerplate.test

import com.neelkamath.kotlinjsboilerplate.calculate
import kotlin.test.Test
import kotlin.test.assertEquals

class CalculatorTest {
    @Test
    fun testCalculate() = assertEquals(7, calculate(3, 4))
}