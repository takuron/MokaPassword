package com.takuron.moka.kotlin

fun main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.

    val moka = MokaPass(MokaPassParameters(
        MokaPassType.NUMBER_LETTER_SYMBOL_EXCLUDE,
        18
    ),)
    moka.passwordSource = "masterCard"
    moka.distinguishCode = "outlook"
    println(moka.generate())
}