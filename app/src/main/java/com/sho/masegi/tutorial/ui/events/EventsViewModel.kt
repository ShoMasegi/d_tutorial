package com.sho.masegi.tutorial.ui.events

import androidx.lifecycle.ViewModel
import com.sho.masegi.network.GitHubApi
import javax.inject.Inject

class EventsViewModel @Inject constructor(
    val githubApi: GitHubApi
) : ViewModel()
