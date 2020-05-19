package org.simprints.dhis2.usescases.sync;

import org.simprints.dhis2.data.dagger.PerActivity;
import org.simprints.dhis2.data.schedulers.SchedulerProvider;
import org.simprints.dhis2.data.service.workManager.WorkManagerController;
import org.hisp.dhis.android.core.D2;

import dagger.Module;
import dagger.Provides;

@Module
@PerActivity
public class SyncModule {

    @Provides
    @PerActivity
    SyncContracts.Presenter providePresenter(D2 d2, SchedulerProvider schedulerProvider, WorkManagerController workManagerController) {
        return new SyncPresenter(d2, schedulerProvider, workManagerController);
    }
}
