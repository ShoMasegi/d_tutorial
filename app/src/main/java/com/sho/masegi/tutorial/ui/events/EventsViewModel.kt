package com.sho.masegi.tutorial.ui.events

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import androidx.lifecycle.LiveData
import com.sho.masegi.model.Event
import com.sho.masegi.network.GitHubApi
import javax.inject.Inject

class EventsViewModel @Inject constructor(
    private val githubApi: GitHubApi
) : ViewModel() {
    val events: LiveData<List<Event>> = liveData {
        val value = githubApi.events(1)
        emit(value)
    }
}
