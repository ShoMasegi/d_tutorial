package com.sho.masegi.model

import java.net.URL

data class RepoLink(
    val id: RepositoryId,
    val name: String,
    val url: URL
)