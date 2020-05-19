package org.simprints.dhis2.usescases.eventsWithoutRegistration.eventCapture.eventInitialFragment

import dagger.Subcomponent

@Subcomponent(modules = [EventCaptureInitialModule::class])
interface EventCaptureInitialComponent {
    fun inject(fragment: EventCaptureInitialFragment)
}