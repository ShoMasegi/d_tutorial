package com.sho.masegi.model

import se.ansman.kotshi.JsonSerializable

typealias UserId = Long

@JsonSerializable
data class User(
    val id: UserId,
    val login: String,
    val displayLogin: String?,
    val url: String,
    val avatarUrl: String
)