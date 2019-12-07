package com.sho.masegi.model

import java.net.URL

typealias UserId = Long

data class User(
    val id: UserId,
    val login: String,
    val displayLogin: String?,
    val url: URL,
    val avatarUrl: URL
)