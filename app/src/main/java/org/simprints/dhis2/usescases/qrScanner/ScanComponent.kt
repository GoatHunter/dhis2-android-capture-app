package org.simprints.dhis2.usescases.qrScanner

import dagger.Subcomponent
import org.simprints.dhis2.data.dagger.PerActivity

@PerActivity
@Subcomponent(modules = [ScanModule::class])
interface ScanComponent {
    fun inject(scanActivity: ScanActivity?)
}