package com.sho.masegi.model

import java.net.URL
import java.util.Date

typealias RepositoryId = Long

data class Repository(
    val id: RepositoryId,
    val name: String,
    val fullName: String,
    val owner: User,
    val url: URL,
    val forksCount: Int,
    val openIssuesCount: Int,
    val watchersCount: Int,
    val stargazersCount: Int,
    val language: String?,
    val createdAt: Date,
    val updatedAt: Date,
    val `private`: Boolean,
    val description: String?
    )
