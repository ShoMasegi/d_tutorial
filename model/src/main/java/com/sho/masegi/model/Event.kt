package com.sho.masegi.model

import se.ansman.kotshi.JsonSerializable
import java.util.*

typealias EventId = String

@JsonSerializable
data class Event(
    val id: EventId,
    val type: String,
    val actor: User,
    val repo: RepoLink,
    val createdAt: String
)
