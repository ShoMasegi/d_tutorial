package com.sho.masegi.model

import org.threeten.bp.ZonedDateTime
import se.ansman.kotshi.JsonSerializable

typealias EventId = String

@JsonSerializable
data class Event(
    val id: EventId,
    val type: String,
    val actor: User,
    val repo: RepoLink,
    val createdAt: ZonedDateTime
)
