package com.adrielmadrigal.curriculumvitae

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform