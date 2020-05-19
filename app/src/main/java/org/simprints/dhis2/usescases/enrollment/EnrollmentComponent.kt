package org.simprints.dhis2.usescases.enrollment

import dagger.Subcomponent
import org.simprints.dhis2.data.dagger.PerActivity

@PerActivity
@Subcomponent(modules = [EnrollmentModule::class])
interface EnrollmentComponent {
    fun inject(activity: EnrollmentActivity)
}
