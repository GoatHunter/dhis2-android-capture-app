package org.simprints.dhis2.usescases.teiDashboard.nfc_data;

import org.simprints.dhis2.data.dagger.PerActivity;
import org.simprints.dhis2.data.qr.QRCodeGenerator;
import org.simprints.dhis2.data.qr.QRInterface;
import org.hisp.dhis.android.core.D2;

import dagger.Module;
import dagger.Provides;

/**
 * QUADRAM. Created by ppajuelo on 19/12/2017.
 */

@Module
public class NfcDataWriteModule {

    @Provides
    @PerActivity
    QRInterface providesQRInterface(D2 d2) {
        return new QRCodeGenerator(d2);
    }
}
