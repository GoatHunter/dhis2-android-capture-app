package org.simprints.dhis2.usescases.qrReader;

import org.simprints.dhis2.data.dagger.PerFragment;

import dagger.Subcomponent;

/**
 * QUADRAM. Created by ppajuelo on 22/05/2018.
 */
@PerFragment
@Subcomponent(modules = QrReaderModule.class)
public interface QrReaderComponent {
    void inject(QrReaderFragment qrReaderFragment);

}
