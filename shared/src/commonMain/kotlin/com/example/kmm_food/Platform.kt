package com.example.kmm_food

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform