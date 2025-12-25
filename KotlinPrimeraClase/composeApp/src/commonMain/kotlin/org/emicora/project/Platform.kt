package org.emicora.project

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform