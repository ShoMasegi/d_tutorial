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
    @Component.Builder
    interface Builder {
        fun build(): AppComponent

        @BindsInstance
        fun context(context: Context): Builder
    }

    fun eventsComponent(): EventsComponent.Factory
}
