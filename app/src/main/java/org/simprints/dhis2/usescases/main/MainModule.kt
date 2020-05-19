package org.simprints.dhis2.usescases.main

import dagger.Module
import dagger.Provides
import org.simprints.dhis2.data.dagger.PerActivity
import org.simprints.dhis2.data.prefs.PreferenceProvider
import org.simprints.dhis2.data.schedulers.SchedulerProvider
import org.simprints.dhis2.data.service.workManager.WorkManagerController
import org.simprints.dhis2.utils.filters.FilterManager
import org.hisp.dhis.android.core.D2

@Module
class MainModule(val view: MainView) {

    @Provides
    @PerActivity
    fun homePresenter(
        d2: D2,
        schedulerProvider: SchedulerProvider,
        preferences: PreferenceProvider,
        workManagerController: WorkManagerController,
        filterManager: FilterManager
    ): MainPresenter {
        return MainPresenter(
            view,
            d2,
            schedulerProvider,
            preferences,
            workManagerController,
            filterManager
        )
    }
}
