package com.sho.masegi.tutorial.di

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.sho.masegi.tutorial.ui.events.EventsViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
interface ViewModelModule {
    @Binds
    fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory

    @Binds
    @IntoMap
    @ViewModelKey(EventsViewModel::class)
    fun bindEventsViewModel(viewModel: EventsViewModel): ViewModel
}
