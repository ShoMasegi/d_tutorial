package com.sho.masegi.model

import java.util.*

typealias EventId = String

data class Event(
    val id: EventId,
    val type: String,
    val actor: User,
    val repo: RepoLink,
    val createdAt: Date
)
