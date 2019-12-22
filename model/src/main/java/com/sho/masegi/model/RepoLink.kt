package com.sho.masegi.model

import se.ansman.kotshi.JsonSerializable

@JsonSerializable
data class RepoLink(
    val id: RepositoryId,
    val name: String,
    val url: String
)