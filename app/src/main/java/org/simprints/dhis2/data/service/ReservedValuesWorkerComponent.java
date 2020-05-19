package org.simprints.dhis2.data.service;

import androidx.annotation.NonNull;

import org.simprints.dhis2.data.dagger.PerService;

import dagger.Subcomponent;

@PerService
@Subcomponent(modules = ReservedValuesWorkerModule.class)
public interface ReservedValuesWorkerComponent {
    void inject(@NonNull ReservedValuesWorker reservedValuesWorker);
}
