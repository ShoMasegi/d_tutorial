package com.sho.masegi.tutorial.di

import android.content.Context
import com.sho.masegi.tutorial.ui.events.EventsComponent
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        ViewModelModule::class,
        SubcomponentsModule::class
    ]
)
interface AppComponent {
    @Component.Factory
    interface Factory {
        fun create(@BindsInstance context: Context): AppComponent
    }

    fun eventsComponent(): EventsComponent.Factory
}
