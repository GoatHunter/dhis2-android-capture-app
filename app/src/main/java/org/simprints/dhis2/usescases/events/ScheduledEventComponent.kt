package org.simprints.dhis2.usescases.events

import dagger.Subcomponent
import org.simprints.dhis2.data.dagger.PerActivity

@PerActivity
@Subcomponent(modules = [ScheduledEventModule::class])
interface ScheduledEventComponent {
    fun inject(scheduledEventActivity: ScheduledEventActivity)
}
