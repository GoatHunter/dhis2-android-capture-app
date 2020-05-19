package org.simprints.dhis2.usescases.orgunitselector

import dagger.Subcomponent
import org.simprints.dhis2.data.dagger.PerActivity

@PerActivity
@Subcomponent(modules = [OUTreeModule::class])
interface OUTreeComponent {
    fun inject(activity: OUTreeActivity)
}
