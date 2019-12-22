package com.sho.masegi.model

import org.threeten.bp.ZonedDateTime
import se.ansman.kotshi.JsonSerializable

typealias RepositoryId = Long

@JsonSerializable
data class Repository(
    val id: RepositoryId,
    val name: String,
    val fullName: String,
    val owner: User,
    val url: String,
    val forksCount: Int,
    val openIssuesCount: Int,
    val watchersCount: Int,
    val stargazersCount: Int,
    val language: String?,
    val createdAt: ZonedDateTime,
    val updatedAt: ZonedDateTime,
    val `private`: Boolean,
    val description: String?
    )
