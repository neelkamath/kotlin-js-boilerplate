package com.neelkamath.kotlinjsboilerplate

import org.w3c.dom.HTMLInputElement
import org.w3c.dom.get
import kotlin.browser.document

/** Returns the integer in the element with [id] (`null` will be returned if there is no integer). */
private fun getInt(id: String) = (document.getElementById(id) as HTMLInputElement).value.toIntOrNull()

fun main(args: Array<String>) {
    for (i in 0..1) {
        document.getElementsByClassName("num")[i]!!.addEventListener("keyup", {
            val num1 = getInt("num1")
            val num2 = getInt("num2")
            val answer = document.getElementById("answer")!!
            answer.textContent = if (num1 == null || num2 == null) "Invalid input" else (num1 + num2).toString()
        })
    }
}
