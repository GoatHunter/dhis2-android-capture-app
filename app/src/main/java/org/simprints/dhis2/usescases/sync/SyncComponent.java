package org.simprints.dhis2.usescases.sync;

import org.simprints.dhis2.data.dagger.PerActivity;


import dagger.Subcomponent;

@PerActivity
@Subcomponent(modules = SyncModule.class)
public interface SyncComponent {
    void inject(SyncActivity syncActivity);
}