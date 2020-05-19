package org.simprints.dhis2.usescases.login

import dagger.Module
import dagger.Provides
import org.simprints.dhis2.data.dagger.PerActivity
import org.simprints.dhis2.data.fingerprint.FingerPrintController
import org.simprints.dhis2.data.prefs.PreferenceProvider
import org.simprints.dhis2.data.schedulers.SchedulerProvider
import org.simprints.dhis2.utils.analytics.AnalyticsHelper

/**
 * QUADRAM. Created by ppajuelo on 07/02/2018.
 */

@Module
@PerActivity
class LoginModule(private val view: LoginContracts.View) {

    @Provides
    @PerActivity
    fun providePresenter(
        preferenceProvider: PreferenceProvider,
        schedulerProvider: SchedulerProvider,
        fingerPrintController: FingerPrintController,
        analyticsHelper: AnalyticsHelper
    ): LoginPresenter {
        return LoginPresenter(
            view,
            preferenceProvider,
            schedulerProvider,
            fingerPrintController,
            analyticsHelper
        )
    }
}
