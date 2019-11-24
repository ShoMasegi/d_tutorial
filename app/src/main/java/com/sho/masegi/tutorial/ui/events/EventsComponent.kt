package com.sho.masegi.tutorial.ui.events

import dagger.Subcomponent

@Subcomponent
interface EventsComponent {

    @Subcomponent.Factory
    interface Factory {
        fun create(): EventsComponent
    }

    fun inject(fragment: EventsFragment)
}
