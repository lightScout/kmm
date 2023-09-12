package com.lightscout.kmm

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform