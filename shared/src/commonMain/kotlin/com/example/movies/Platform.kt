package com.example.movies

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform