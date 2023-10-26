package com.lightscout.kmm

import kotlin.random.Random

class Greeting {
    private val platform: Platform = getPlatform()

    fun greet(): String {
        val word = if(Random.nextBoolean()) "Hi" else "Hello"
        return "$word, ${platform.name}!"
    }
}