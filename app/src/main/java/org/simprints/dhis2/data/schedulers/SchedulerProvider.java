package org.simprints.dhis2.data.schedulers;

import androidx.annotation.NonNull;

import io.reactivex.Scheduler;

public interface SchedulerProvider {

    @NonNull
    Scheduler computation();

    @NonNull
    Scheduler io();

    @NonNull
    Scheduler ui();
}
