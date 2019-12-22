package com.sho.masegi.model

import se.ansman.kotshi.JsonSerializable
import java.net.URL
import java.util.Date

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
    val createdAt: String,
    val updatedAt: String,
    val `private`: Boolean,
    val description: String?
    )
