package org.simprints.dhis2.usescases.login

import dagger.Subcomponent
import org.simprints.dhis2.data.dagger.PerActivity
import org.simprints.dhis2.data.fingerprint.FingerPrintModule

@PerActivity
@Subcomponent(modules = [LoginModule::class, FingerPrintModule::class])
interface LoginComponent {
    fun inject(loginActivity: LoginActivity)
}
