package com.sho.masegi.tutorial.di

import com.sho.masegi.tutorial.ui.events.EventsComponent
import dagger.Module

@Module(
    subcomponents = [
        EventsComponent::class
    ]
)
class SubcomponentsModule
