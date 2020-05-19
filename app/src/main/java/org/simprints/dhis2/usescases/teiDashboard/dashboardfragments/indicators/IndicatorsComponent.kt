package org.simprints.dhis2.usescases.teiDashboard.dashboardfragments.indicators

import dagger.Subcomponent
import org.simprints.dhis2.data.dagger.PerFragment

@PerFragment
@Subcomponent(modules = [IndicatorsModule::class])
interface IndicatorsComponent {
    fun inject(indicatorsFragment: IndicatorsFragment)
}
