package com.sho.masegi.model

import se.ansman.kotshi.JsonSerializable
import java.net.URL

@JsonSerializable
data class RepoLink(
    val id: RepositoryId,
    val name: String,
    val url: String
)